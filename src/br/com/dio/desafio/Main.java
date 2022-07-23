package br.com.dio.desafio;

import br.com.dio.desafio.dominio.*;
import com.sun.jdi.BooleanType;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descrição curso javascript");
        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso();
        curso3.setTitulo("curso web developer");
        curso3.setDescricao("descrição web developer");
        curso3.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("mentoria de C");
        mentoria2.setDescricao("descrição mentoria C");
        mentoria2.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("Bootcamp web e c");
        bootcamp2.setDescricao("Descrição Bootcamp c e web");
        bootcamp2.getConteudos().add(curso3);
        bootcamp2.getConteudos().add(mentoria2);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Camila" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteúdos inscritos Camila" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Camila" + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        Dev novoDev = new Dev();
        novoDev.setNome("Pedro");
        System.out.println("Conteúdos inscritos Pedro" + novoDev.getConteudosInscritos());
        novoDev.inscreverBootcamp(bootcamp2);
        System.out.println("Conteúdos inscritos Pedro" + novoDev.getConteudosInscritos());
        novoDev.cancelarMatricula(bootcamp2);
        System.out.println("Conteúdos inscritos Pedro" + novoDev.getConteudosInscritos());

        /*System.out.println("------------");
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Joao" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdos inscritos Joao" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Joao" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());*/

        /*
        System.out.println(curso);
        System.out.println(curso2);
        System.out.println(mentoria);*/
    }
}
