package Lessions;

public class Lession2 {
    public  static void main(String[] args){
        Test t = new Test();
        t.Print();
        t.Print();
        t.Print();
        t.Print();
    }
    static class Test{
        int t =0;
        void Print(){
            System.out.println(this.t);
            t++;
        }
    }
}
