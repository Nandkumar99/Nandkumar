package Opps.Inheritance.MultiLevel;

import Opps.Inheritance.Single.SingleLevel;

public class MultiLevel {
    void ShowA() {

        System.out.println("1");
    }

    public static class Double extends MultiLevel {
        void ShowB() {
            System.out.println("2");
        }
    }
    public static class Trible extends Double{
        void ShowC() {
            System.out.println("3");
        }
    }
    public static void main(String args[]) {
        MultiLevel single = new MultiLevel();
            single.ShowA();

        System.out.println("-------------------------------------------");

        Double doubl = new Double();
            doubl.ShowA();
            doubl.ShowB();

        System.out.println("-------------------------------------------");

        Trible trible= new Trible();{
            trible.ShowA();
            trible.ShowB();
            trible.ShowC();
        }

    }
}

