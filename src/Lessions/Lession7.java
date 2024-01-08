package Lessions;

import java.util.Arrays;

public class Lession7 {
    public static void main(String[] args){
        char[] mass = new char[]{'d','b','c','d'};
        int[] g = Fr(mass);
        System.out.println(Arrays.toString(g));
    }
    public static int[] Fr(char[] mass){
        int[] m = new int[mass.length];
        for (int i=0;i< mass.length; i++){
            m[i]=(int)mass[i];
        }
        return m;
    }
}
