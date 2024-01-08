package Lessions;

public class Lession8 {
    public static void main(String[] args){
        int[] mass =  new int[]{1,2,3,4,5,6,7,8,9};
        int m = Fr(mass);
        System.out.println(m);
    }
    public static int Fr(int[] args){
        int medium=0;
        int summ =0;
        for(int i=0; i<args.length; i++){
            summ+=args[i];
        }
        double t = summ/args.length;
        medium = (int) Math.round(t);
        return medium;
    }
}
