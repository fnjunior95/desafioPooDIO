package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {


    @Override
    public String toString() {
        return "Curso [cargaHoraria=" + cargaHoraria + ", getTitulo()=" + getTitulo() + ", getDescricao()="
                + getDescricao() + "]";
    }

    private int cargaHoraria;

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;

    }

}
