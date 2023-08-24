package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int epsidiosPorTemporada;
    private int minutosPorEpisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public int getEpsidiosPorTemporada() {
        return epsidiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public void setEpsidiosPorTemporada(int epsidiosPorTemporada) {
        this.epsidiosPorTemporada = epsidiosPorTemporada;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
}
