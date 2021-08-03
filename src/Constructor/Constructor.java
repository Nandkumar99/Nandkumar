package Constructor;

public class Constructor {
    String name;

   public Constructor(String name){
        this.name=name;
    }

    public static void main(String[] args) {
        Constructor e1 = new Constructor("Nandkumar");
        Constructor e2 = new Constructor("Deepak");

        System.out.println(e1.name);
        System.out.println(e2.name);
    }
}

