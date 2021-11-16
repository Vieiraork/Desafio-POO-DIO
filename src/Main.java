import br.com.dominio.Curso;
import br.com.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricap("Curso POO em Java");
        curso.setCargaHoraria(10);
        System.out.println(curso);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria em Java");
        mentoria.setDescricao("Métodos getter e setter");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);
    }
}
