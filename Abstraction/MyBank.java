package Abstraction;

interface MyBank {
   void write();
   void read();
   // declare only

}

class SBI implements MyBank{

    @Override
    public void write() {
        System.out.println("SBIread");
    }
    @Override
    public void read() {
        System.out.println("SBI Write");
    }
     
}
