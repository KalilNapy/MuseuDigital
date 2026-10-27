package MuseuDigital;

import java.util.Arrays;
import java.util.Objects;

public class Artista {
    private String nome;
    private String bio;
    private String[] tipos;
    private int numVendas;

    public Artista(String nome, String bio, String[] tipos, int numVendas) {
        this.bio = bio;
        this.nome = nome;
        this.tipos = tipos;
        this.numVendas = numVendas;
    }

    public String getNome() {
        return nome;
    }

    public String getBio() {
        return bio;
    }

    public String[] getTipos() {
        return tipos;
    }

    public int getNumVendas() {
        return numVendas;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public String toString() {
        return "Artista{" +
                "nome='" + nome + '\'' +
                ", bio='" + bio + '\'' +
                ", tipos=" + Arrays.toString(tipos) +
                ", numVendas=" + numVendas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Artista artista = (Artista) o;
        return Objects.equals(nome, artista.nome);
    }
}
