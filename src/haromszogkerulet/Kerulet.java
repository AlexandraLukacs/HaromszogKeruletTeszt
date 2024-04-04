package haromszogkerulet;

public class Kerulet {
    public static void main(String[] args) {
        haromszogKerulete(2, -1, 2);
    }
    
    public static int haromszogKerulete(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0 ){
            return -1;
        }else{
            int kerulet = a + b + c;
            return kerulet;
        }
    }
    
}
