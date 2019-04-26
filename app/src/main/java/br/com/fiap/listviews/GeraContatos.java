package br.com.fiap.listviews;

import java.util.ArrayList;
import java.util.List;

public class GeraContatos {

    public static List<Contato> geraContatos() {
        List<Contato> contatos = new ArrayList<>();

        Contato contato1 = new Contato("Yuri","1234-1234", R.drawable.homem1, "Hello I'm Yuri Breion");
        Contato contato2 = new Contato("Guilherme","1234-5645", R.drawable.homem2, "Hello I'm Guilherme Fodao");
        Contato contato3 = new Contato("Ricardo","1234-2323", R.drawable.homem3, "Hello I'm Ricardo Putanheiro");
        Contato contato4 = new Contato("Anna","1234-9876", R.drawable.mulher1, "Hello I'm Anna Lindinha!");
        Contato contato5 = new Contato("Carolina","1234-123", R.drawable.mulher2, "Hello I'm Carolina Going Crazy");
        Contato contato6 = new Contato("Mara","1234-4343", R.drawable.mulher3, "Hello I'm Mara the rational");

        contatos.add(contato1);
        contatos.add(contato2);
        contatos.add(contato3);
        contatos.add(contato4);
        contatos.add(contato5);
        contatos.add(contato6);

        return contatos;
    }
}
