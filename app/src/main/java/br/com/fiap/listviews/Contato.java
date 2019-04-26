package br.com.fiap.listviews;

public class Contato {

    private String nome;
    private String telefone;
    private int imagem;
    private String sobre;

    public Contato(String nome, String telefone, int imagem, String sobre) {
        this.nome = nome;
        this.telefone = telefone;
        this.imagem = imagem;
        this.sobre = sobre;
    }

    public Contato() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getSobre() {
        return sobre;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }
}
