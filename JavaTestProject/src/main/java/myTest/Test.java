package myTest;

public class Test {


    public static void main(String args[]) {
        System.out.println("\n Hello World !!");
        // what is injection
        /*
        What is this x: in println statement
        need to check
         */

        int no1 = 5, no2 = 7;
        double ans;
        ans = no1 + no2;
        System.out.println("\n Addition is:" + ans);
        ans = ans / no1;
        System.out.println("\n Division is:" + ans);

        char c = 'Y';
        boolean flag = true;

        if (flag) {
            System.out.println("\n I am in If, I am Char C:=" + c);
        }

        String name = new String("Poorva Gokhale");
        String name1 = new String("Anish Gokhale");

        // method call
        boolean stringTrueFlg = testString(name, name1);
        System.out.println("\n String compare result is:"+stringTrueFlg);

        // polymorph
        int flg1 = testString(name);
        System.out.println("\n Polymorphed int return Function called as value is:"+flg1);

        if (!(name.equals(name1))) {
            System.out.println("\n My Son is:" + name1);
        }

        System.out.println("\n My Name is:" + name);


        /*
        private : class only
        public: any class
        protected: same package any class
        */

        int[] arr1;
        arr1 = new int[5];
        int[] arr2 = {1, 2, 3, 4, 5};

        for (int i = 0; i < 5; i++) {
            arr1[i] = arr2[i];
            System.out.println("Value in arrays:arr1: " + arr1[i] + " arr2:" + arr2[i]);
        }

    Test test1 = new Test();
    }

    public Test(){
        System.out.println("\n New Object of class myTest.Test : test1 got created and default constructor called..");
    }
    static boolean testString(String name, String name1) {
        if(name.equals(name1))
            return true;
        else return false;
    }

    static int testString(String name){
            return name.length();

    }
}