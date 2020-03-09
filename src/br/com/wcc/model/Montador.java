package br.com.wcc.model;

import java.util.List;
import java.util.Random;

/**
 * Montador
 */
public class Montador implements Produto{

    Random random = new Random();
    private int valorTamanho = random.nextInt(49);
    
    private List<ComponenteEnum> componentes;

    @Override
    public void montar(){
        
        ComponenteEnum[] valorEnum = ComponenteEnum.values();
        System.out.println(random.nextInt(valorEnum.length-1));

            Placa[] placaLista = new Placa[random.nextInt(19)];
            for(int j = 0; j < placaLista.length; j++){
                for(int i = 0; i < valorTamanho; i++){
                    componentes.add(valorEnum[random.nextInt(valorEnum.length-1)]);
                }
                placaLista[j] = new Placa(valorTamanho, componentes);
                placaLista[j].imprimePlaca();
                componentes.clear();
        }
          
    }
}