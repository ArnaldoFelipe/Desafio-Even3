package Buscabinaria;
public class BuscaBinaria {
    
    public int buscar(int[] listaOrdenada, int valorProcurado){
        int inicio = 0;
        int fim = listaOrdenada.length -1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;
            
            if (listaOrdenada[meio] == valorProcurado){
                return meio;
            }

            if (listaOrdenada[meio] < valorProcurado) {
                inicio = meio + 1; 
            } else {
                fim = meio - 1; 
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
        BuscaBinaria buscador = new BuscaBinaria();

        int[] lista = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};

        // Cenário 1: Procurar um número que existe na lista (por exemplo, 23)
        int valorAProcurar1 = 23;
        System.out.println("Procurando o valor: " + valorAProcurar1);
        
        int indiceEncontrado1 = buscador.buscar(lista, valorAProcurar1);
        
        if (indiceEncontrado1 != -1) {
            System.out.println("SUCESSO: Valor " + valorAProcurar1 + " encontrado no índice: " + indiceEncontrado1);
        } else {
            System.out.println("FALHA: Valor " + valorAProcurar1 + " não encontrado.");
        }

        System.out.println("==============================");

        // Cenário 2: Procurar um número que não existe na lista (por exemplo, 100)
        int valorAProcurar2 = 100;
        System.out.println("Procurando o valor: " + valorAProcurar2);
        
        int indiceEncontrado2 = buscador.buscar(lista, valorAProcurar2);
        
        if (indiceEncontrado2 != -1) {
            System.out.println("SUCESSO: Valor " + valorAProcurar2 + " encontrado no índice: " + indiceEncontrado2);
        } else {
            System.out.println("FALHA: Valor " + valorAProcurar2 + " não encontrado. " + -1);
        }
    }
}
