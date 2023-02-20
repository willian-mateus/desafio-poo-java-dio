import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Willian Mateus");
        dev1.increverBootcamp(bootcamp);
        System.out.println("Conteúdos disponíveis para " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("==");
        System.out.println("Conteúdos concluídos por " + dev1.getNome() + ": " + dev1.getConteudosConcluidos());
        System.out.println("Conteúdos disponíveis para " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        System.out.println("========================");

        Dev dev2 = new Dev();
        dev2.setNome("Sara Muller");
        dev2.increverBootcamp(bootcamp);
        System.out.println("Conteúdos disponíveis para " + dev2.getNome() + ": " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("==");
        System.out.println("Conteúdos concluídos por " + dev2.getNome() + ": " + dev2.getConteudosConcluidos());
        System.out.println("Conteúdos disponíveis para " + dev2.getNome() + ": " + dev2.getConteudosInscritos());
        System.out.println("XP: " + dev2.calcularTotalXp());




    }
}