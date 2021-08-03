package Opps.Inheritance.Single;

public class SingleLevel {
    void ShowA() {

        System.out.println("1");
    }

    public static class Double extends SingleLevel {
        void ShowB() {
            System.out.println("2");
        }
    }

    public static void main(String args[]) {
        SingleLevel single = new SingleLevel();
        single.ShowA();

        System.out.println("-------------------------------------------");

        Double doubl = new Double();
        doubl.ShowA();
        doubl.ShowB();

    }
}
