package Opps.classobjectmethod;

public class Animal {

    public void sleep() { // 1st method
        System.out.println("i am sleeping");
    }

    public static void main(String args[]) { // main method
        System.out.println("1");
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();

      Animal1 birds = new Animal1();
          birds.run();
      }


    public void eat() { // 2nd method
        System.out.println("i am eating");
    }
}
    class  Animal1 {

    public void run() { // 3rd method
            System.out.println("i am running");
        }
    }

