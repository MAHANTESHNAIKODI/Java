package Leetcode;

public class Pwskilss {
    public static void   main(String[] args) {
        int a=10;
        int b= a++;

        System.out.println(a);
        System.out.println(b);

        int num=10;
        num+=5;
        System.out.println(num);
        
        int age = 18;
        if(age>18){
            System.out.println("Voter");
        } else if (age>16 && age<18) {
            System.out.println( "emerging");
        }
        TernaryOpertor();
        WriteSwitch();
        DoWhie();
        checkBloodDonationEligiblity(18,75);


    }

    public static long TernaryOpertor() {
            int a= 10;
            long b= 15;
            long result =  (a>b) ? a:b;
            long result1= a<b?(a<11?a:b):(a>b?a:b);
        System.out.println(result1);
        System.out.println(result);
        return result1;


    }
    public static void WriteSwitch(){
        int age=10;
        switch (age){
            case 10:
                System.out.println("10 1");
                break;

            case 20:
                System.out.println("15");
                break;
            case 30:
                System.out.println("hello");
                break;

        }

    }
    public static void DoWhie(){
        int i=0;
        do{
            System.out.println("Hi");
            i++;

        }while (i<3);
    }

    public static String checkBloodDonationEligiblity(int age, int weight) {
        if(age<=18){
            return "UnderAge";
        }
        if(age>=18 && weight<=50){
            return "NotEligible";
        }
        if (age>=18 && weight >= 50){
            return "Eligible";
        }
        return "InValid";
    }

}
