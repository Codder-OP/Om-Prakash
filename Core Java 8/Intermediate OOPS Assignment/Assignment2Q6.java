import java.util.*;

abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() {
    	return "This is FilePersistence";
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
    	return "This is DataPersistence";
    }
}
public class Assignment2Q6 {

	public static void main(String[] args) {
		Persistence filePersistence=new FilePersistence();
		System.out.println(filePersistence.persist());
		
		Persistence databasePersistence=new DatabasePersistence();
		System.out.println(databasePersistence.persist());
		
		

	}

}
