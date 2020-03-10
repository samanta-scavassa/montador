package br.com.wcc.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Montador
 */
public class Montador implements Montagem{

    Random random = new Random();
    
    private List<ComponenteEnum> componentes;

    @Override
    public void montar(){
        
        componentes = new ArrayList<>();
        ComponenteEnum[] valorEnum = ComponenteEnum.values();
        System.out.println(random.nextInt(valorEnum.length-1));

            Placa[] placaLista = new Placa[random.nextInt(19)];
            for(int j = 0; j < placaLista.length; j++){
                int valorTamanho = random.nextInt(49);
                for(int i = 0; i < valorTamanho; i++){
                    componentes.add(valorEnum[random.nextInt(valorEnum.length-1)]);
                }
                placaLista[j] = new Placa(valorTamanho, componentes);
                System.out.println("Placa " + (j+1) + ":\n");
                placaLista[j].imprimeComponentes();
                componentes.clear();
        }
          
    }
}