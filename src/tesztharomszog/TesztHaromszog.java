package tesztharomszog;

import haromszogkerulet.Kerulet;

public class TesztHaromszog {

    
    public static void main(String[] args) {
        haromszogKeruletTesztesetek();
    }

    private static void haromszogKeruletTesztesetek() {
        azonosOldaluHaromszogTesztek();
        haromszogKeruletNegativTeszt();
        haromszogKeruletNegativPozitivTeszt();
        haromszogKeruletNullTeszt();
    }
    
    
    private static void haromszogKeruletNegativTeszt() {
        System.out.println("Negatív számok");
        int kapott = Kerulet.haromszogKerulete(-1, -2, -3);
        int vart = -6;
        
        assert kapott == vart:"NEM jó a teszt";
    }
    
    private static void haromszogKeruletNegativPozitivTeszt() {
        System.out.println("Negatív, pozitív számok");
        int kapott = Kerulet.haromszogKerulete(-1, 2, -3);
        int vart = -2;
        
        assert kapott == vart:"NEM jó a teszt";
    }
    
    private static void haromszogKeruletNullTeszt() {
        System.out.println("Nulla");
        int kapott = Kerulet.haromszogKerulete(0, 0, 0);
        int vart = 0;
        
        assert kapott == vart:"NEM jó a teszt";
    }

    private static void azonosOldaluHaromszogTesztek() {
        azonosOldaluHaromszogpozitivTesztek();
    }

    private static void azonosOldaluHaromszogpozitivTesztek() {
        System.out.println("azonos oldalú: pozitív -> ");
        int kapott = Kerulet.haromszogKerulete(2, 2, 2);
        int vart = 6;
        
        assert kapott == vart:"NEM jó a teszt";    
    }
    
    
    
}
