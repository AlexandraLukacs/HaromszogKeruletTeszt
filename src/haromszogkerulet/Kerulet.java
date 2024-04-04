package haromszogkerulet;

public class Kerulet {
    public static void main(String[] args) {
        
    }
    
    public static int haromszogKerulete(int a, int b, int c) {
        if (a+b <= c || a+c <= b || b+c <= a){
            return -1;
        }else{
            return a + b + c;
        }
    }
    
}
