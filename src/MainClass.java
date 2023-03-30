import java.util.Scanner;

// Chiamare la classe col proprio cognome
public class MainClass
{
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		while(true)
		{
			stampaMenu();
			int scelta = Integer.parseInt(in.nextLine());
			switch(scelta)
			{
				//aggiungere, togliere casi a seconda delle proprie scelte
				case 1:
					//Inserire metodo statico
				break;
				case 2:
					//Inserire metodo statico
				break;
				case 3:
					//Inserire metodo statico
				break;
				default:
					System.out.println("Scelta errata, riprova!");

			}
		}
	}
	static void stampaMenu()
	{
		// Modificare il menù secondo le proprie scelte
		System.out.println("1 - Es n. * - Titolo es. *");
		System.out.println("2 - Es n. * - Titolo es. *");
		System.out.println("3 - Es n. * - Titolo es. *");
		System.out.println("4 - Es n. * - Titolo es. *");
		System.out.println("5 - Es n. * - Titolo es. *");
	}
	
	
	static void MinimoDiArray(int[] array, int minore, int indice) {
		for(int i = 0; i <10; i++) {
			int random = (int)(Math.random() * (5-(-5)+1)) + (-5);
			array[i]= random;
			
		}
		for(int i = 0; i <10; i++) {
			minore = array[0];
			if(array[i] < minore) {
				minore = array[i];
				indice = i;
				
			}
			System.out.println(minore + indice );
		}
	}
	static void ParoleMisteriose( ) {
		String[]array = {"a","b","c","d","e"};
		for(int i = 5; i>0; i--) {
		System.out.println("indovinare la parola, tentativi:" + i);
		String input = in.nextLine();
		for(int j = 5; j>0; j--){
			if(input == array[j]) {
				System.out.println("hai indovinato");
				break;
			}
		}
     }
}
	static void StampaPari(int Array[], int array[] ) {
		for(int i = 0; i <20; i++) {
			int random = (int)(Math.random() * (100-(1)+1)) + (1);
			Array[i]= random;
			System.out.println(Array[i]);
	}
		for(int j = 0; j <20; j++) {
			if(Array[j] % 2 == 0) {
				array[j]= array[j];
				System.out.println(Array[j]);
			}
			
		}
	
}
	static void ArrayDivisori(int Array[], int array[], int per2) {
		for(int i = 0; i <50; i++) {
			int random = (int)(Math.random() * (100-(1)+1)) + (1);
			Array[i]= random;
	}
		per2 = 0;
		for(int j = 0; j <50; j++) {
			
			int divisore = 2;
			if( Array[j] % divisore == 0) {
				
				divisore = divisore + 1;
				int numero = 0;
				numero = numero + 1;
				array[j] = numero;
				
			}
		}
		
		
		
				 
				 
			 
				 
				 
			 }
	
			

			
			

	static void zigzag(int array[]) {
		for(int i = 0; i <10; i++) {
		  int random = (int)(Math.random() * (11));
		  array[i] = random;
		  System.out.println(array[i]);
		}
		for(int j = 0; j <10; j++) {
			System.out.println(array[j] + array[10 - j]);
			
		}
		
		
	}
	static void LancioRisiko(int difensore[], int attaccante[], int temp, int somma, int somma1) {
		for (int s = 0; s < 3; s++)
        {
		    	  int random = (int)(Math.random() * ((6)+1));
		    	  difensore[s]= random;
		    	  attaccante[s]= random;
        }
		    	     for (int a = 0; a < difensore.length-1; a++)
		    	        {
		    	            for (int j = 0; j < difensore.length-1-a; j++)
		    	            {
		    	                if (difensore[j+1]<difensore[j])
		    	                {
		    	                    temp = difensore[j+1];
		    	                    difensore[j+1] = difensore[j];
		    	                    difensore[j] = temp;
		    	                }
		    	            }
		    	        }
		    	        for (int q = 0; q < attaccante.length; q++)
		    	        {
		    	            System.out.print(attaccante[q]+"; ");
		    	        }
		    	        for (int a = 0; a < attaccante.length-1; a++)
		    	        {
		    	            for (int j = 0; j < attaccante.length-1-a; j++)
		    	            {
		    	                if (attaccante[j+1]<attaccante[j])
		    	                {
		    	                    temp  = attaccante [j+1];
		    	                    attaccante[j+1] = attaccante[j];
		    	                    attaccante[j] = temp;
		    	                }
		    	            }
		    	        }
		    	      
		    	  

	 for(int f = 0; f <3; f++) {
	 somma = 0 ;
	 somma =+ somma + attaccante[f];
	 somma1 = 0;
	 somma1 =+ somma1 + difensore[f];
	 if(somma > somma1) {
		 System.out.println("l'attaccante guadagna un punto");
		 if(somma1 > somma) {
			 System.out.println("il difensore guadagna un punto"); 
		 }
		 
	 }
	}
	
}
	public static void Ordinamento(int Array[], int temp)
    {
        for (int i = 0; i < Array.length-1; i++)
        {
            for (int j = 0; j < Array.length-1-i; j++)
            {
                if (Array[j+1]<Array[j])
                {
                    temp = Array[j+1];
                    Array[j+1] = Array[j];
                    Array[j] = temp;
                }
            }
        }

    }
}

