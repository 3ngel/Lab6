package Lessions;

import java.util.Arrays;

public class Lession3 {
    public static void main(String[] args){
        Test t = new Test();
        t.Numbers(1,2,3,4,5,6,7,8);
    }
    static class Test{
        int MaxNumber(int[] args){
            int max=args[0];
            for(int i=0; i<args.length; i++){
                if(args[i]>max){
                    max=args[i];
                }
            }
            return max;
        }
        int MinNumber(int[] args){
            int min=args[0];
            for(int i=0; i<args.length; i++){
                if(args[i]<min){
                    min=args[i];
                }
            }
            return min;
        }
        int MediumNumber(int[] args){
            int medium=0;
            int summ =0;
            for(int i=0; i<args.length; i++){
                summ+=args[i];
            }
            double t = summ/args.length;
            medium = (int) Math.round(t);
            return medium;
        }
        void Numbers(int...args){
            int[] numbers = new int[args.length];
            int i=0;
            for(int arg: args){
                numbers[i]=arg;
                i++;
            }
            int max = MaxNumber(numbers);
            int min = MinNumber(numbers);
            int medium = MediumNumber(numbers);
            System.out.println("Максимальное значение: "+max+" Минимальное значение: "+min+" Среднее арифметическое: "+medium);
        }
    }
}
