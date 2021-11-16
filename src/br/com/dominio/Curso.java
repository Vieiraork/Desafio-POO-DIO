package br.com.dominio;

public class Curso {
    private String titulo;
    private String descricap;
    private Integer cargaHoraria;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricap() {
        return descricap;
    }

    public void setDescricap(String descricap) {
        this.descricap = descricap;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricap='" + descricap + '\'' +
                ", cargaHoraria='" + cargaHoraria + '\'' +
                '}';
    }
}
