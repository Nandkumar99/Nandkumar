package Opps.Encapsulation;

class Employee {

    private int IVMarks;

    public void setMarks(int NB) {
        IVMarks = NB;
    }

    public int getMarks() {
        return IVMarks;
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.setMarks(99);
        System.out.println(e.getMarks());
    }
}
