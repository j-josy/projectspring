package br.com.josseanevendetti.projectspring.model;

    public class Car {

    private String cadastro;
    private String list;
    private int codigo;
    private String placa;
    private String remover;
    private Genre genre;

}

    public String getCadastro() {
        return this.cadastro;
    }

    public void setCadastro(String cadastro) {
        this.cadastro = cadastro;
    }

    public String getList() {
        return this.list;
    }

    public void setList(String list) {
        this.list = list;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getRemover() {
        return this.remover;
    }

    public void setRemover(String remover) {
        this.remover = remover;
    }

    public Genre getGenre() {
        return this.genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

