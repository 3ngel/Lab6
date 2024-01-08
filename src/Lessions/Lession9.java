package Lessions;

import java.util.Arrays;

public class Lession9 {
    public static void main(String[] args){
        char[] mass = new char[]{'a','b','c','d'};
        System.out.println(Arrays.toString(mass));
        char[] newmass = Gh(mass);
        System.out.println(Arrays.toString(newmass));
    }
    public static char[] Gh(char[] mass){
        char[] newmass= new char[mass.length];
        for (int i=0; i< mass.length;i++){
            newmass[i]=mass[mass.length-1-i];
        }
        return newmass;
    }
}
