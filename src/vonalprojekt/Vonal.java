package vonalprojekt;

public class Vonal {
    private int hossz, eltolas;
    private String szin, tipus;

    public Vonal() {
        this(1);
    }
    
    
    
    public Vonal(int hossz) {
        this(hossz, "fekete");
    }

    public Vonal(int hossz, String szin) {
        this(hossz, szin, "szimpla");
    }

    
    
    public Vonal(int hossz, String szin, String tipus) {
        this(hossz, 0, szin, tipus);
    }
    
    public Vonal(int hossz, int eltolas, String szin, String tipus) {
        setHossz(hossz);
        setEltolas(eltolas);
        this.szin = szin;
        this.tipus = tipus;
    }

    @Override
    public String toString() {
        return "Vonal{" + "hossz=" + hossz + ", eltolas=" + eltolas + ", szin=" + szin + ", tipus=" + tipus + '}';
    }

    private void setHossz(int hossz) {
        if(hossz < 1){ hossz = 1; }
        this.hossz = hossz;
    }

    public void setEltolas(int eltolas) {
        if(hossz < 0){ hossz = 0; }
        this.eltolas = eltolas;
    }
    
    
    
    public void rajzol(){
        for (int i = 0; i < eltolas; i++) {
            System.out.print(" ");
        }
        
        char jel;
        if (tipus.equals("pont")) {
            jel = '.';
        }else if(tipus.equals("szaggatott")) {
            jel = '-';
        }else if(tipus.equals("dupla")) {
            jel = '=';
        }else {
            jel = '_';
        }
        
        final String RESET = "\033[0m";
        String konzolSzin = RESET;
        if (szin.equals("piros")) {
            konzolSzin = "\u001B[31m";
        }else if(szin.equals("kék")) {
            konzolSzin = "\u001B[34m";
        }else if(szin.equals("sárga")) {
            konzolSzin = "\u001B[33m";
        }else {
            konzolSzin = "\u001B[30m";
        }
        System.out.print(konzolSzin);
            
        for (int i = 0; i < hossz; i++) {
            System.out.print(jel);
        }
        System.out.printf(" (%d)\n\n", hossz);
        System.out.println(RESET);
    }
}
