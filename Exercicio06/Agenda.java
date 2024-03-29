package Exercicio06;

import java.util.*;

public class Agenda {

    private List<Contatos> allcont;

    public Agenda() {allcont = new ArrayList<>();}

    public void addContato( Contatos contato) {allcont.add(contato);}

    public Contatos buscarContato(String nome){
        for(Contatos c : allcont){
            if(c.getNome().equals(nome)){
                return c;
            }
        }
        return null;
    }


}
