package Constructor;

public class directValues {   // intiliaze values directly
    String name;

    public static void main(String[] args) {
        directValues e1 = new directValues();
        e1.name = "deepak";

        directValues e2 = new directValues();
        e2.name = "Nandkumar";

        System.out.println(e1.name);
        System.out.println(e2.name);
    }
}
// suppose there is 1000 employes then we have to add 1000 extra lines

