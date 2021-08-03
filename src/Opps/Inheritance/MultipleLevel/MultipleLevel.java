package Opps.Inheritance.MultipleLevel;

public class MultipleLevel {
    void ShowA() {
        System.out.println("1");
    }

    public static class Double  {
        void ShowB() {
            System.out.println("2");
        }
    }
    public static class Trible extends MultipleLevel{
        //    public static class Trible extends MultipleLevel, Double{
        void ShowC() {
            System.out.println("3");
        }
    }
    public static void main(String args[]) {

         Trible trible= new Trible();{
            trible.ShowA();
//          trible.ShowB();
            trible.ShowC();
        }

    }
}
