import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void ukol1() {
        System.out.println("Hello world!");
    }

    public static void ukol2() {
        String uzivatel = "Karel";
            System.out.println(uzivatel);
    }

    public static void ukol3() {
        int pocetLekci = 10;
            System.out.println(pocetLekci);
    }

    public static void ukol4() {
        double cena = 10.0;
           System.out.println(cena);
    }

    public static void ukol5() {
        double celkovaCena =(0);
            for (int i = 0; i <= 10; i++) {
                celkovaCena += 0.1;
                System.out.println(celkovaCena);
            }

    }

    public static void ukol6() {
        BigDecimal cena = BigDecimal.valueOf(0.0);
            cena = cena.add(BigDecimal.valueOf(0.1));
                System.out.println(cena);
    }

    public static void ukol7() {
        int vykonMotoru = 120;
            System.out.println ("Vykon motoru je: "+vykonMotoru+" kW.");
    }

    public static void ukol8() {
        int velikostKosile = 37;
            System.out.println("Velikost košile je: "+velikostKosile+ ".");
    }

    public static void ukol9() {
        System.out.println("Metoda *skoro* bez chybičky!");
    }

    public static void main(String[] args) {
        String jmenoPrijmeni = "Ondřej Klíma";
        LocalDate date = LocalDate.now();
        Number pocetSmluv = 28;
        Number mnozstviMrkve = 250;
        String mesto = "Brno";
        String registracniZnackaVozidla = "9B8 6790";
        Number spotrebaFiremnihoVozidla = 6.9;
        String adresaIP4 = ("198.567.76.42");
        System.out.println("Jméno a příjmení prodjce:" +jmenoPrijmeni);
        System.out.println("Datum narození prodejce:" +date);
        System.out.println("Počet dosud sjednných smluv:" +pocetSmluv);
        System.out.println("Celkové množství prodané mrkve v tunách:" +mnozstviMrkve+ "tun");
        System.out.println("Název města kde prodejce sídlí:" +mesto);
        System.out.println("Registrační značka vozidla:" +registracniZnackaVozidla);
        System.out.println("Spotřeba firrmního vozidla v litec na 100 km:" +spotrebaFiremnihoVozidla+ "l/100 km");
        System.out.println("IP adresa verze 4 firmního počítače:" +adresaIP4);
        ukol1();

        ukol2();
        ukol3();
        ukol4();
        ukol5();
        ukol6();
        ukol7();
        ukol8();
        ukol9();
    }
}
