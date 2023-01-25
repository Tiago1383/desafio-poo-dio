import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraia(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso javaScripty");
        curso2.setDescricao("Descrição curso JavaScripty");
        curso2.setCargaHoraia(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria em Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        //Conceito de Polimorfismo
        /*
        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();
         */

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devTiago = new Dev();
        devTiago.setNome("Tiago");
        devTiago.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devTiago.getConteudoInscritos());
        devTiago.progredir();
        System.out.println("...");
        System.out.println("Conteúdos Inscritos " + devTiago.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos " + devTiago.getConteudosConcluidos());
        System.out.println("XP: " + devTiago.calcularTotalXP());

        System.out.println("..................");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devJoao.getConteudoInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("...");
        System.out.println("Conteúdos Inscritos " + devJoao.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXP());
    }
}
