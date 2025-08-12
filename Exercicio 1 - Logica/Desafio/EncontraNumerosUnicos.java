package Desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EncontraNumerosUnicos {
    
    public List<Integer> encontraNumerosUnicos(List<Integer> numeros){
        List<Integer> unicos = new ArrayList<>();
        for (Integer num : numeros){
            if(Collections.frequency(numeros, num) == 1){
                unicos.add(num);
            }
        }

        return unicos;
    }
}
