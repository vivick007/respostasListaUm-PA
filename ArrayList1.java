import java.util.ArrayList;

public class Corrida {
	public static void main (String []args) {
		ArrayList <String> nomes = new ArrayList <String> ();
	
		nomes.add("Ferrari");
		nomes.add("Mercedes");
		nomes.add("Porsche");
		
		//ArrayList <String> posicao  = new ArrayList <String> ();
		
		//posicao.add("2º");
		//posicao.add("1º");
		//posicao.add("3º");
		
		ArrayList <Integer> v = new ArrayList <Integer> ();
		
		v.add(112);
		v.add(118);
		v.add(111);
		
		System.out.println(nomes);
		System.out.println(v);
		
		for(int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i) + v.get(i) + "\n");
		}
	
	
	
	}

}
