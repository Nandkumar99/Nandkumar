package Opps.Polymorphism.RunTime;

 class Nandkumar {

void show(){
    System.out.println("1");
           }
 }

 class Sonali extends Nandkumar{
     void show(){
         System.out.println("2");
                }

 public static void main(String[] args){
         Nandkumar nandkumar=new Nandkumar();
         nandkumar.show();

         Sonali sonali=new Sonali();
         sonali.show();

 }

 }


