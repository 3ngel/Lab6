package Lessions;

import java.util.Arrays;

public class Lession10 {
    public static void main(String[] args){
        int[] mass =Gh(1,2,3,4,-1, 5,6,7,8,100);
        System.out.println(Arrays.toString(mass));
    }
    public static int[] Gh(int... args){
        int[] min__max=new int[2];
        int min = args[0];
        int max= args[0];
        for (int arg: args){
            if(min>arg){
                min=arg;
            }
            if(max<arg){
                max=arg;
            }
        }
        min__max[0]=max;
        min__max[1]=min;
        return min__max;
    }
}
