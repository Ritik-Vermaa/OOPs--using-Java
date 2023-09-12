package Encapsulation;
//import Pack1.Myclass;

public class Test {
    public static void main(String[] args) {
        Employee obj = new Employee("Ritik", 21);
        Employee obj2 = new Employee();
        obj2.setph(9076);
        obj2.setname("vikram");
        // obj.count();
        System.out.println(obj.getph());
        System.out.println(obj.getname());
        System.out.println(obj2.getph());
        System.out.println(obj2.getname());
        // Myclass obj1 = new Myclass();
        // obj1.show();

    }
}
