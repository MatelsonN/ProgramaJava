package br.com.matelson.screenmatch.principal;

import br.com.matelson.screenmatch.modelos.Filme;
import br.com.matelson.screenmatch.modelos.Serie;
import br.com.matelson.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args){
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Filme favorito = new Filme("The Matrix", 1999);
        favorito.avalia(9);
        Filme outro = new Filme("John Wick", 2014);
        outro.avalia(8);
        Serie lost = new Serie("Lost", 2000);
        Serie serie = new Serie("La Casa de Papel", 2017);


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(favorito);
        lista.add(outro);
        lista.add(lost);
        lista.add(serie);
        for (Titulo item: lista) {
            System.out.println("Nome: " + item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação.");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados:");
        Collections.sort(lista); //o método Collections.sort realiza a ordenação
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);

    }
}
