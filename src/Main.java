import br.com.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Curso POO em Java");
        curso.setCargaHoraria(10);
        System.out.println(curso);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria em Java");
        mentoria.setDescricao("Métodos getter e setter");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java mobile");
        bootcamp.setDescricao("Mobile developer com Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        System.out.println();

        Dev dev1 = new Dev();
        dev1.setNome("William");
        dev1.inscreverBootcamp(bootcamp);
        dev1.progredir();
        System.out.println("Conteúdos inscritos William: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos William: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calculaXp());

        Dev dev2 = new Dev();
        dev2.setNome("Paula");
        dev2.inscreverBootcamp(bootcamp);
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteúdos inscritos Paula: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Paula: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calculaXp());
    }
}
