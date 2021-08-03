package Constructor;

class WhyCon {
    String name="Nandkumar";

// intiliaze object by reference variable

    public static void main(String[] args){
        WhyCon e1= new WhyCon();
        WhyCon e2= new WhyCon();

        System.out.println(e1.name);
        System.out.println(e2.name);
    }
}
