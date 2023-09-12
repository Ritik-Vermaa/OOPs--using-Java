package Encapsulation;
class Employee {
    int empID = 2;
    private int ph = 0;
    private String name ;
    int basicsal = 20000;

    Employee(String empName , int PhoneNo){
        ph = PhoneNo;
        name = empName;
    }
    Employee(){
        ph = 2000;
        name = "Aman";
    }

    void setph(int phone){
        ph=phone;
    }

    void setname(String Name){

        name = Name;
    }

    void count() {
        System.out.println(basicsal);
    }

    // Getter & setter

    int getph(){
        return ph;
    }

    String getname(){
        return name;
    }

}
