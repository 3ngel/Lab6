package Lessions;
import java.util.Arrays;
public class Lession1 {
    public static void main(String[] args){
        Test t = new Test();
        char[] s={'g',' ', 'h'};
        t.Met(s);
        t.Met('f');
        System.out.println(t.two);
        System.out.println(t.one);
    }
    static class Test{
        char one;
        String two="";
        public void Met(char o){
            one=o;
        }
        public void Met(String o){
            two=o;
        }
        public void Met(char[] j){
            if(j.length==1){
                one=j[0];
            }
            else{
                for(int i=0; i<j.length;i++){
                    two = two+j[i];
                }
            }
        }
    }
}
