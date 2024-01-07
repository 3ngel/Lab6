package Lessions;

public class Lession5 {
    public static void main(String[] args){
        int g=GHt(4);
        System.out.println(g);
    }
    public static int GHt(int numb){
        int g=0;
        for (int i=0;i<=numb;i++){
            g=g+i*i;
        }
        return g;
    }
}
