import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Main {
  public static void main (String []args) {
    ArrayList <String> nomes = new ArrayList <String> ();

    Scanner x = new Scanner (System.in);
    String carro;
    
    System.out.println("Escolha 4 carros para correr: ");
    for (int i = 0; i < 4; i++) {
      carro = x.nextLine();
      nomes.add(carro);
    }
  
    ArrayList <Integer> v = new ArrayList <Integer> ();

    v.add(112);
    v.add(118);
    v.add(111);
    v.add(116);
  
    Collections.sort(v, Collections.reverseOrder());
    
    System.out.println("\nAté o momento, os carros estão na seguinte ordem: ");
  
    for(int i = 0; i < nomes.size(); i++) {
      System.out.println("\n" + (i+1) + "º lugar " + nomes.get(i) + ": " + v.get(i) + " km/h");
    }
    

  Random random = new Random();
      int num = random.nextInt(nomes.size());
      String vencedor = nomes.get(num);

      System.out.println("\nMas algo inesperado aconteceu... " );
      System.out.println("\nO vencedor foi: " + vencedor);

  }

}
