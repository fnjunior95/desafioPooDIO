package br.com.dio.desafio.dominio.curso;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
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
    }
}
