package algoritmosOrdenacaoBusca;

public class Main {
	
	
	static int[] vetor = new int[10];
	
	public static void main(String args[])
	{
		
		int[] v;
		
		initVetor();
		printVetor(vetor);
		estaOrdenado(vetor);
		
		v = bubbleSort(vetor);
		printVetor(v);
		estaOrdenado(v);
		
		v = insertionSort(vetor);
		printVetor(v);
		estaOrdenado(v);
	}
	
	static void initVetor()
	{
		vetor[0]=51;
		vetor[1]=64;
		vetor[2]=21;
		vetor[3]=38;
		vetor[4]=41;
		vetor[5]=1;
		vetor[6]=10;
		vetor[7]=5;
		vetor[8]=97;
		vetor[9]=54;
			
	}
	
	static boolean estaOrdenado(int[] v)
	{
		
		for (int i=1; i<v.length; i++)
		{
			if (v[i] < v[i-1])
			{
				System.out.println("Vetor NÃO está ordenado.\n");
				return false;
			}
		}
		
		System.out.println("Vetor está ordenado.\n");
		return true; 
	}
	
	static void printVetor(int[] v)
	{
		for (int i=0; i<v.length; i++)
		{
			System.out.print(v[i] + ",");
		}
		System.out.print("\n");
	}
	
	
	static int[] bubbleSort(int[] v)
	{
		System.out.println("BubbleSort");
		
		int aux=0;
		
		for (int i=v.length-1; i>0; i--)
		{
		
			for (int j=0; j<i;j++)
			{
				
				if(v[j]>v[j+1])
				{
					aux = v[j];
					v[j]=v[j+1];
					v[j+1]=aux;	
				}
				
			}
			
		}
		
		return v;
		
	}
	static int[] insertionSort(int[] v)
	{
		System.out.println("InsertionSort");
		int eleito, j;
		
		for (int i=1; i<v.length; i++)
		{
			eleito = v[i];
			j = i-1;
			
			while(j>=0 && eleito < v[j])
			{
				//substituo
				v[j+1] = v[j];
				j--;
			}
			
			//mais um pra corrigir o --
			v[j+1] = eleito;
						
		}
		
		return v;
	}
	
	
}
