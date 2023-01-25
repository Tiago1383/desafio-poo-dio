package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    private int cargaHoraia;

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraia;
    }

    public Curso() {
    }

    public int getCargaHoraia() {
        return cargaHoraia;
    }

    public void setCargaHoraia(int cargaHoraia) {
        this.cargaHoraia = cargaHoraia;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" +  getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraia=" + cargaHoraia +
                '}';
    }
}
