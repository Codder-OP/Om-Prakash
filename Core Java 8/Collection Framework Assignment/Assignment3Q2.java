import java.util.*;

public class Assignment3Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> linkHSet = new LinkedHashSet<>();
    	linkHSet.add(1);
    	linkHSet.add(2);
    	linkHSet.add(3);
    	linkHSet.add(4);
    	linkHSet.add(5);
    	if(linkHSet == ordered(linkHSet)) {
    		System.out.println("ordered");
    	}
    	else {
    	System.out.println("unordered");}
    	System.out.println(ordered(linkHSet));
    	
    	HashSet<Integer> Hset = new HashSet<>();
    	Hset.add(1);
    	Hset.add(2);
    	Hset.add(3);
    	Hset.add(4);
    	Hset.add(5);
    	if(linkHSet == unordered(Hset)) {
    		System.out.println("ordered");
    	}
    	else {
        	System.out.println("unordered");}
    	System.out.println(unordered(Hset));
    	
    	
    	
    }
    public static LinkedHashSet<?> ordered(LinkedHashSet<?> linkedHashSet){ 
    	return linkedHashSet;
    }
    public static HashSet<?> unordered(HashSet<?> hashSet){
    	return hashSet;
    }
	   
}
