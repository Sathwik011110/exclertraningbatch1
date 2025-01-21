import java.util.ArrayList;
import java.util.Iterator;

class ArrayListCode{
	
	void arrayListMethod(){
 	ArrayList<String> arraylist = new ArrayList<>();	    

     //ArrayList<String> arraylist;

     arraylist.add("Sathwik");
     arraylist.add("Siddu");
     arraylist.add("Sai");

System.out.println("Friends Name : ");
	      
	      Iterator<String> iterate = arraylist.iterator();
	    
	      while (iterate.hasNext()) { 
	         System.out.println(iterate.next()); 
	}
	    
}
}
public class Demo030{

	public static void main(String[] args) {
		ArrayListCode obj = new ArrayListCode();
		obj.arrayListMethod();
		  }
	}

