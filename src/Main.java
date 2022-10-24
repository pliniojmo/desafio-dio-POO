import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição do curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPlinio = new Dev();
        devPlinio.setNome("Plínio");
        devPlinio.inscreverBootcap(bootcamp);
        System.out.println("Conterúdos Inscritos Plínio: "+ devPlinio.getConteudosInscritos());
        devPlinio.progredir();
        devPlinio.progredir();
        System.out.println("--");

        System.out.println("Conterúdos Inscritos Plínio: "+ devPlinio.getConteudosInscritos());
        System.out.println("Conterúdos Concluídos Plínio: "+ devPlinio.getConcludosConcluidos());
        System.out.println("XP: "+devPlinio.calcularXp());
        System.out.println("--------------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcap(bootcamp);
        System.out.println("Conterúdos Inscritos Camila: "+ devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("--");
        System.out.println("Conterúdos Inscritos Camila: "+ devCamila.getConteudosInscritos());
        System.out.println("Conterúdos Concluídos Camila: "+ devCamila.getConcludosConcluidos());
        System.out.println("XP: "+devCamila.calcularXp());

    }
}
