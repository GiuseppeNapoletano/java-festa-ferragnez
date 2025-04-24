import java.util.Scanner;


public class CheckGuest {

    public static void main(String[] args) {
        String listaInvitati[] = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Come ti chiami?");
        String nomeInvitato = scanner.nextLine();

        System.out.println(nomeInvitato);

        scanner.close();

        boolean trovato = false;

        for (int i = 0; i < listaInvitati.length; i++) {
            String elementoCorrente = listaInvitati[i];
            System.out.println(elementoCorrente);
            if (elementoCorrente.equals(nomeInvitato)) {
                trovato = true;
                break;
            }

        }
        
        String messaggio = "Non puoi entrare!";
        if (trovato == true) {
            messaggio = "Puoi entrare!";
        }
         System.out.println(messaggio);



        

    }
}