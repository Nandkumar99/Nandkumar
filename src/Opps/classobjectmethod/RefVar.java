package Opps.classobjectmethod;

public class RefVar {

    String colour;
    int age;
    public static void main(String[] args){

        RefVar refVar= new RefVar();
        refVar.colour="black";
        refVar.age=10;
        System.out.println(refVar.colour+" "+ refVar.age);
    }
}
