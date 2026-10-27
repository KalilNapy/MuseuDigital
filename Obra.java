package MuseuDigital;

public class Obra {
    private String titulo;
    private String tipo;
    private Artista artista;
    private int edicoesDisponiveis;
    private double valor;
    private int[] caracteristicas;

    public Obra(String titulo, String tipo, Artista artista, int edicoesDisponiveis, double valor, int[] caracteristicas) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.artista = artista;
        this.edicoesDisponiveis = edicoesDisponiveis;
        this.valor = valor;
        this.caracteristicas = caracteristicas;

    }

    public String getTitulo() {
        return titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public Artista getArtista() {
        return artista;
    }

    public int getEdicoesDisponiveis() {
        return edicoesDisponiveis;
    }

    public double getValor() {
        return valor;
    }

    public int[] getCaracteristicas() {
        return caracteristicas;
    }
    
}
