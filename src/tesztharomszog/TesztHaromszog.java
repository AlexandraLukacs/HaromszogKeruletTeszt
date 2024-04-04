package tesztharomszog;

import haromszogkerulet.Kerulet;

public class TesztHaromszog {

    
    public static void main(String[] args) {
        haromszogKeruletTesztesetek();
    }

    private static void haromszogKeruletTesztesetek() {
        azonosOldaluHaromszogTeszt();
        azonosBefogoHaromszogTeszt();
        derekszguHaromszogTeszt();
        nemSzerkeszthetoTeszt();
    }

    private static void azonosOldaluHaromszogTeszt() {
        System.out.println("azonos oldalú -> (2, 2, 2)");
        int kapott = Kerulet.haromszogKerulete(2, 2, 2);
        int vart = 6;
        
        assert kapott == vart:"NEM jó a teszt";
    }

    private static void azonosBefogoHaromszogTeszt() {
        System.out.println("azonos befofogó -> (3, 3, 4)");
        int kapott = Kerulet.haromszogKerulete(3, 3, 4);
        int vart = 10;
        
        assert kapott == vart:"NEM jó a teszt";
    }

    private static void derekszguHaromszogTeszt() {
        System.out.println("derekszogu -> ");
        int kapott = Kerulet.haromszogKerulete(3, 3, 4);
        int vart = 10;
        
        assert kapott == vart:"NEM jó a teszt";
    }
    
    private static void nemSzerkeszthetoTeszt() {
        System.out.println("nem szerkeszthető -> (1, 2, 3)");
        int kapott = Kerulet.haromszogKerulete(1, 2, 3);
        int vart = -1;
        
        assert kapott == vart:"NEM jó a teszt";
    }

    

    
    
    
    
}
