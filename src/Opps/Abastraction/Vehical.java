package Opps.Abastraction;

abstract class Vehical {

    abstract void Start();
}

 class Bullet extends Vehical{
    public void Start()
       {
        System.out.println("Start with kick");
        }

    public static void main(String[] args)
    {
        Bullet b= new Bullet();
        b.Start();

    }








//     abstract class Vehical {
//         int NOT;
//         abstract void Start();
//     }
//
//     class Bullet extends Opps.Abastraction.Vehical {
//         public void Start()
//         {
//             System.out.println("Start with kick");
//         }
//         void setNOT(int no){
//             NOT=no;
//
//         }
//         public int getNOT(){
//             return NOT;
//         }
//         public static void main(String[] args)
//         {
//             Opps.Abastraction.Bullet b= new Opps.Abastraction.Bullet();
//             b.Start();
//             b.setNOT(99);
//             System.out.println(b.getNOT());
//         }
//
//     }

}