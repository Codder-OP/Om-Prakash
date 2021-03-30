import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

class News {
    private int newsId;
    private String postedByUser;
    private String commentByUser;
    private String comment;
    
	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public String getPostedByUser() {
		return postedByUser;
	}
	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}
	public String getCommentByUser() {
		return commentByUser;
	}
	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
}

public class Assignment5Q2 {
	  public static int maxComments(List<News> news) {
		  Optional<News> comments=news.stream().max(Comparator.comparing(News::getComment));
		  List<Integer> it = new ArrayList<>();
	    	comments.stream().forEach(i->{int id =i.getNewsId(); it.add(id);});
	    	int n = it.stream().findFirst().get();
	    	return n;
	  }

	    public static int budgetCount (List < News > news) {
	    	int count = 0;
	    	List<String> allComments = new ArrayList<>();
	    	news.stream().forEach(i->allComments.add(i.getComment()));
	    	for(String s:allComments) {
	    		if(s.contains("budget")) {
	    			count++;
	    		}
	    	}
	    	return count;
	    }
	    public static String maxCommentsByUser (List < News > news) {
	    	Optional<News> toSL = news.stream().min(Comparator.comparing(News::getCommentByUser));  //max is not working here
	    	List<String> userNames = new ArrayList<>(); 
	    	toSL.stream().forEach(j->userNames.add(j.getCommentByUser()));
	    	String finalName = userNames.stream().findFirst().get();
	    	return finalName;
	    }
	    public static <K, V extends Comparable<V>> Map<K, V> 
	    sortByValues(final Map<K, V> map) {
	    Comparator<K> valueComparator = 
	             new Comparator<K>() {
	      public int compare(K k1, K k2) {
	        int compare = 
	              map.get(k2).compareTo(map.get(k1));
	        if (compare == 0) 
	          return 1;
	        else 
	          return compare;
	      }
	    };
	 
	    Map<K, V> sortedByValues = 
	      new TreeMap<K, V>(valueComparator);
	    sortedByValues.putAll(map);
	    return sortedByValues;
	  }

	    public static Map<String, Integer> sortMaxCommentsByUser (List < News > news) {
	    	Map<String,Integer> mp = new TreeMap<>();
	    	List<String> allUsers = new ArrayList<String>();
	    	news.stream().forEach(i->allUsers.add(i.getCommentByUser()));
	    	for(String userName: allUsers) {
	    		mp.put(userName,0);
	    	}
	    	for(String userName: allUsers) {
	    		mp.put(userName,mp.get(userName)+1);
	    	}
	    	Map<String, Integer> mp2 = sortByValues(mp);
	    	return mp2;
	    }

	public static void main(String[] args) {
		News n1 = new News(1,"Ram","Shyam","comment");
    	News n2 = new News(2,"Ghanshyam","Om","budget");
    	News n3 = new News(1,"Ajay","Prashanth","comment");
    	News n4 = new News(3,"Amar","Narendra","budget");
    	News n5 = new News(1,"Modi","Amit","comment");
    	News n6 = new News(3,"Rahul","Sonia","budget");
    	News n7 = new News(1,"Akhilesh","Mulayam","comment");
    	List<News> news = new ArrayList<News>();
    	news.add(n1);
    	news.add(n2);
    	news.add(n3);
    	news.add(n4);
    	news.add(n5);
    	news.add(n6);
    	news.add(n7);
    	
    	int x = maxComments(news);
    	System.out.println("Maximum comments by news ID: "+x);
    	
    	int y = budgetCount(news);
    	System.out.println("Budget count is: "+ y);
    	
    	String nameOfUser = maxCommentsByUser(news);
    	System.out.println("Maximum comments posted by user: "+nameOfUser);
    
    	Map<String,Integer> map = sortMaxCommentsByUser(news);
    	for(Map.Entry<String, Integer> mMap: map.entrySet()) {
    		System.out.println(mMap.getKey()+": "+mMap.getValue());

	}
	}
}