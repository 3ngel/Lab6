package Lessions;

import java.util.Arrays;

public class Lession6 {
    public static void  main(String[] args){
        int[] mass = new int[]{1,2,3,4,5,6,7,8};
        int n = 6;
        int[] gh= Dryt(mass, n);
        System.out.println(Arrays.toString(gh));
    }
    public static int[] Dryt(int[] mass, int number){
        if(number>=mass.length){
            return mass;
        }
        int[] newmass= new int[number];
        for (int i=0; i<number;i++){
            newmass[i]=mass[i];
        }
        return newmass;
    }
}
