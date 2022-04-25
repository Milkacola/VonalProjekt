package vonalprojekt;

public class VonalProgram {

    public static void main(String[] args) {
        Vonal v0 = new Vonal();
        System.out.println(v0);
        v0.rajzol();
        
        Vonal v1 = new Vonal(10);
        System.out.println(v1);
        v1.rajzol();
        
        Vonal v2 = new Vonal(5, "piros");
        System.out.println(v2);
        v2.rajzol();
        
        Vonal v3 = new Vonal(5, 0, "fekete", "pont");
        System.out.println(v3);
        v3.rajzol();
        
        Vonal v4 = new Vonal(3, 0, "sárga", "dupla");
        System.out.println(v4);
        v4.rajzol();
        
        Vonal v5 = new Vonal(2, 0, "kék", "szaggatott");
        System.out.println(v5);
        v5.rajzol();
        
        System.out.println("Tesztelés hibás esetekre:");
        Vonal hibas1 = new Vonal(-5);
        System.out.println(hibas1);
        hibas1.rajzol();
        
        Vonal hibas2 = new Vonal(-5, "szaggatott", "kék");
        System.out.println(hibas2);
        hibas2.rajzol();
        
        Vonal hibas3 = new Vonal(-5, "szaggatott", "kék");
        System.out.println(hibas3);
        hibas3.rajzol();
    }
    
}
