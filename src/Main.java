import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args) {
        String kosik[] = {"kure", "brambora", "mleko", "rohlik", "tatranka", "maslo", "vejce", "banan" };
        int cena [] ={120, 2, 15, 2, 8, 42, 3, 30};
        int konecnacena = 0;
        if (args.length == 0){
            System.out.println("Produkty");
            for (int i =0; i < kosik.length; i++){
                System.out.println(i + " - " + kosik[i]+ " - " + cena[i] + "Kc");
            }
        }
        else {
            for (int i = 0; i < args.length; i++){
                if (Integer.parseInt(args[i]) <= kosik.length-1){
                    System.out.println(args[i] + " - " + kosik[Integer.parseInt(args[i])] + " - " + cena[Integer.parseInt(args[i])] + "Kc");
                    konecnacena += cena[Integer.parseInt(args[i])];
                }
                else {
                    System.out.println("produkt neexistuje " + args[i]);
                }
            }

            System.out.println("Cena je " + konecnacena +"Kc");

        }
    }
}
