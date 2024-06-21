package br.com.dio.desafio.dominio.curso;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java Basico");
        curso1.setDescricao("Aprenda os conceitos basicos de Java");
        curso1.setCargaHoraria(10);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java Intermediario");
        curso2.setDescricao("Aprenda os conceitos intermediarios de Java");
        curso2.setCargaHoraria(10);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Aprenda Java");
        mentoria.setDescricao("Aprenda Java com especialistas");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);

        Conteudo conteudo = new Curso();
        conteudo.setTitulo("Aprenda Java");
        conteudo.setDescricao("Aprenda Java com especialistas");
        System.out.println(conteudo);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        System.out.println(bootcamp);

        Dev dev = new Dev();
        dev.setNome("Lucas");
        System.out.println("Conteudos Inscritos: " + dev.getConteudosInscritos());
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + dev.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + dev.getConteudosConcluidos());
        dev.progredir();
        System.out.println("Conteudos Inscritos: " + dev.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + dev.getConteudosConcluidos());
        System.out.println("XP: " + dev.calcularTotalXp());
        dev.progredir();
        System.out.println("XP: " + dev.calcularTotalXp());


        
    }
}
