package Lessions;

public class Lession4 {
    public static void main(String[] args){
        int f=0;
        int fact = Fact(5);
        System.out.println(fact);
    }
    public static int Fact(int number){
        int end=1;
        if(number%2==0){
            end=2;
        }
        int pr=1;
        while(number>=end){
            pr=pr*number;
            number=number-2;
        }
        return pr;
    }
}
