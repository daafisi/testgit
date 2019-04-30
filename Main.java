import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        System.out.println("Hello World!");
        System.out.println("wie geht es dir?");
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        System.out.println(input + " ist okay.");
        reader.close();
        if (input.equals("gut")){
            System.out.println("Mir geht es auch gut.");
        }
        for (int i = 0 ; i < 10 ; i++){
            System.out.println("" + i + " Flaschen Bier auf dem Regal, faellt eine runter sind es nur noch " + i );
        }
    }
    
}