package br.com.wcc.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Montador
 */
public class Montador implements Montagem{

    //Cria novo objeto da classe Random
    Random random = new Random();

    //Cria lista de ComponenteEnum
    private List<ComponenteEnum> componentes;

    @Override
    public void montar(){
        
        //inicializa lista de ComponenteEnum
        componentes = new ArrayList<>();
        //pega valores do ComponenteEnum e atribui à variável valorEnum
        ComponenteEnum[] valorEnum = ComponenteEnum.values();

            //criar array de placas
            Placa[] placaLista = new Placa[random.nextInt(19)];
            //for para criar pastas de acordo com tamanho do array
            for(int j = 0; j < placaLista.length; j++){
                //define um tamanho aleatório de 0 a 49
                int valorTamanho = random.nextInt(49);
                //for para criar componentes de acordo com tamanho aleatório recebido
                for(int i = 0; i < valorTamanho; i++){
                    //adiciona componentes à lista de ComponenteEnum da placa em questão
                    componentes.add(valorEnum[random.nextInt(valorEnum.length-1)]);
                }
                //cria nova placa recebendo valor e componentes criados
                placaLista[j] = new Placa(valorTamanho, componentes);
                //imprime número da placa criada
                System.out.println("Placa " + (j+1) + ":\n");
                //chama função para imprimir componentes
                placaLista[j].imprimeComponentes();
                //limpa a lista de componentes para criar outros na próxima placa
                componentes.clear();
        }
          
    }
}