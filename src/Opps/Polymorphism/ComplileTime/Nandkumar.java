package Opps.Polymorphism.ComplileTime;

public class Nandkumar {

     void Show(int a, String NS) {
        System.out.println("1");

    }
        void Show(String NS, int a) {
            {
                System.out.println("2");
            }
        }
    public static void main(String args[]) {

        Nandkumar nandkumar = new Nandkumar();
        nandkumar.Show(10, "Sonu");
        nandkumar.Show("Sonu", 20);

//        nandkumar.main(20);            // main method overload
//    }
//    public static void main(int m){
//        System.out.println("999");

    }
}

//NOTE: We can overload main method and we cant achieve overloading by changing returnn type
