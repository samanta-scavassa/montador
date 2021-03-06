package br.com.wcc.model;

import java.util.List;

/**
 * Placa
 */
public class Placa {

    private final int tamanho;

    private List<ComponenteEnum> componentes;

    //construtor
    public Placa(int tamanho, List<ComponenteEnum> componentes){
        this.tamanho = tamanho;
        this.componentes = componentes;
    }
    

    public int getTamanho() {

        return tamanho;
    }

    public List<ComponenteEnum> getComponentes() {
        return componentes;
    }

    public void setComponentes(List<ComponenteEnum> componentes) {

        this.componentes = componentes;
    }

    public void imprimeComponentes(){
        //forEach para imprimir cada componente da lista
        componentes.forEach(componente ->{
            System.out.println(componente.toString());
        });
            
        
    }
    
    
}