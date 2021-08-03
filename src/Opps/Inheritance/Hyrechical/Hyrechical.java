package Opps.Inheritance.Hyrechical;

import Opps.Inheritance.MultiLevel.MultiLevel;

public class Hyrechical {
    void ShowA() {

        System.out.println("1");
    }

    public static class Double extends Hyrechical {
        void ShowB() {
            System.out.println("2");
        }
    }

    public static class Trible extends Hyrechical {
        void ShowC() {
            System.out.println("3");
        }
    }

    public static void main(String args[]) {
        Hyrechical hyrechical = new Hyrechical();
        hyrechical.ShowA();

        System.out.println("-------------------------------------------");

         Double doubl = new Double();
        doubl.ShowA();
        doubl.ShowB();

        System.out.println("-------------------------------------------");

         Trible trible= new Trible();{
            trible.ShowA();
            trible.ShowC();
        }

    }
}
