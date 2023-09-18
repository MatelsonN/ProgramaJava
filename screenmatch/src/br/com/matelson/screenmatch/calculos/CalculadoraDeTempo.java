package br.com.matelson.screenmatch.calculos;

import br.com.matelson.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Filme f) {
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s) {
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }

    // Polimorfismo.
    public void inclui(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
