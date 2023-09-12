package Inheritance;

class Dadaji  {
    String name = "Dalpati Ram";
    String surname = "Verma";
}

class Father extends Dadaji{
    String name = "Anil";

}

class me extends Father{
    String name = "Ritik";
}

class run{
    public static void main(String[] args) {
        me m = new me();
        System.out.println(m.name);
        System.out.println(m.surname);
    }
}
