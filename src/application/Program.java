package application;

import entities.Aluno;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args){
        List<Aluno> list = new ArrayList<>();

        list.add(new Aluno("Maria", 10.0));
        list.add(new Aluno("Henrique", 10.0));
        list.add(new Aluno("Clara", 4.0));
        list.add(new Aluno("Mateus", 6.0));
        list.add(new Aluno("Roberta", 7.0));
        list.add(new Aluno("Cintia", 9.0));
        list.add(new Aluno("Gabriel", 8.5));
        list.add(new Aluno("Lucas", 5.0));
        list.add(new Aluno("Beatriz", 9.5));
        list.add(new Aluno("Rafael", 3.5));
        list.add(new Aluno("Julia", 6.0));
        list.add(new Aluno("Pedro", 7.5));
        list.add(new Aluno("Amanda", 4.5));
        list.add(new Aluno("Felipe", 8.0));
        list.add(new Aluno("Larissa", 5.5));
        list.add(new Aluno("Bruno", 10.0));

        int aprovados = 0;
        int reprovados = 0;


        for (Aluno aluno : list) {
            System.out.println();
            System.out.println(
                     "Esse é: " + aluno.getName() +
                             " e sua nota é: "+ aluno.getNota() );

            if (aluno.getNota() < 6) {
                reprovados++;
                System.out.println("Você está reprovado");
            }else {
                aprovados++;
                System.out.println("Você foi aprovado!");
            }

        }
        System.out.println("Total de aprovados: " + aprovados);
        System.out.println("Total de reprovados: " + reprovados);

    }

}
