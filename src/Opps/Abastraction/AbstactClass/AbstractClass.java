package Opps.Abastraction.AbstactClass;


abstract class Vehical{
   abstract void Start() ;

}

class Bullet extends Vehical {
    public void Start() {
        System.out.println("Start with kick");
    }

    public static void main(String[] args) {
        Bullet b = new Bullet();
        b.Start();

    }
}
