
/* Create un nuovo progetto java chiamato java-password-generator
Aggiungete una classe PasswordGenerator che contiene un metodo main
Il programma deve fare quanto segue:
- chiedere all'utente e salvare in opportune variabili il
	- nome
	- cognome
	- colore preferito
	- data di nascita di un utente suddivisa in giorno, mese e anno in numero
- generare (e stampare a video) una password concatenando nome, cognome, colore preferito e somma di giorno, mese e anno di nascita, separate dal carattere -
 */
//Gitignore is not working properly... Non mi funziona ci ho provato fino alla fine ma poi ho pushato esausta.💔

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) throws Exception {
         
            // Ho aggiunto il try e questo elemento perchè mi dava errore senza (ma non ricordo il motivo devo chiedere se ho capito c'entrano le risorse...)
        try (Scanner scanner = new Scanner(System.in)) {
            
            // Chiedi il nome
            System.out.println("Inserisci il tuo nome:");
            String fName = scanner.nextLine();
            // Chiedi il cognome
            System.out.println("Inserisci il tuo cognome:");
            String lName = scanner.nextLine();
            // Chiedi il colore preferito
            System.out.println("Inserisci il tuo colore preferito:");
            String fColor = scanner.nextLine();
            // Chiedi la data di nascita
            System.out.println("Inserisci il tuo giorno di nascita (numero):");
            int bDay = scanner.nextInt();
            // Chiedi la data di nascita
            System.out.println("Inserisci il tuo mese di nascita (numero):");
            int bMonth = scanner.nextInt();
             // Chiedi anno di nascita
            System.out.println("Inserisci il tuo anno di nascita (numero):");
            int bYear = scanner.nextInt();
            // Calcola la somma di giorno, mese e anno di nascita
            int bAdd = bDay + bMonth + bYear;
            // Genera la password
            String passWord = fName + "-" + lName + "-" + fColor + "-" + bAdd;
            // Risultato
            System.out.println("La tua password generata è:");
            System.out.println(passWord);
        }
    }
}

