package Main;

import java.util.Arrays;
import java.util.List;
import Desafio.*;

public class TesteEncontrarUnicos {
    
    public static void main(String[] args) {

        EncontraNumerosUnicos buscador = new EncontraNumerosUnicos();
        
        List<Integer> entrada = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> resultado = buscador.encontraNumerosUnicos(entrada);

        System.out.print("Lista de entrada: ");
        System.out.println(entrada);
        System.out.println("==================");
        System.out.print("Lista de saida: ");
        System.out.println(resultado);
    }
}
