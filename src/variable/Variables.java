package variable;

import com.sun.org.apache.xpath.internal.operations.Variable;
    public class Variables {
        int a= 10;
        static int b=20;

        public static void main(String args[]) {
            Variables var=new Variables();
            var.Add();
            var.multiply();
        }

        static void Add(){
            int c =30;
            int d;
            Variables var=new Variables();
            d= var.a+b+c;
            System.out.println(d);
        }

        void multiply(){
            int e =40;
            int f;
            f=a*b*e;
            System.out.println(f);
        }

    }
// local vairable
// global variable
// instance variable