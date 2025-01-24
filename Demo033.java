import java.util.Iterator;
import java.util.LinkedHashSet;
class LinkedHashSetDemo{
    void linkedHashsetMethod(){
        LinkedHashSet <Integer>lhs = new LinkedHashSet<>();
        lhs.add(21);
        lhs.add(38);
        lhs.add(66);
        lhs.add(88);
        System.out.println(lhs);
        lhs.remove(30);

		int sum=0;
		for(Integer x : lhs) {
			sum += x;
		}

		System.out.println("The sum is :" + sum);

		Iterator it = lhs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
public class Demo033 {
    public static void main(String[] args) {
        LinkedHashSetDemo obj = new LinkedHashSetDemo();
        obj.linkedHashsetMethod();
    }
}