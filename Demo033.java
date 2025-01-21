import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    void linkedHashsetMethod(){
        LinkedHashSet linkedHashSet = new LinkedHashSet ();

        linkedHashSet.add(20);
        linkedHashSet.add(50);
        linkedHashSet.add(90);
        
        System.out.println(linkedHashSet);
    
}
}
public class Demo033 {
    public static void main(String[] args) {
        LinkedHashSetDemo obj = new LinkedHashSetDemo();
        obj.linkedHashsetMethod();
    }
}
