package testData;

//Caio Rodrigo Teodoro Santos

import java.io.*;
import java.util.*;

public class testData {
	public static void main (String[] args) throws IOException {
		
		try {
			InputStream is = new FileInputStream("alunos.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			ArrayList <Double> notas = new ArrayList<Double>();
			
			for (String a; (a = br.readLine()) != null; ) {
				String aluno[] = a.split(";");
				Double notaAluno = Double.parseDouble(aluno[2]);
				notas.add(notaAluno);
			}
			
			
			Double media = 0.0;
			for (int i = 0; i < notas.size(); i++) {
				media += (notas.get(i) / notas.size()) ;
			}
			
			System.out.println("Média das notas => " + media);
			
			for (int i = 0; i < notas.size(); i++) {
				if (notas.get(i) >= media) {
					System.out.println("Nota maior que a média => " + notas.get(i));
				}
			}
			
			is.close();
			System.out.println("Fim do programa.");
			
		} catch (IOException ex) {
			System.out.println("Erro na abertura do arquivo.");
		}
		
	}
	
}
