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
        list.add(new Aluno("Matheus", 6.0));
        list.add(new Aluno("Roberta", 7.0));
        list.add(new Aluno("Cintia", 9.0));



        for (Aluno aluno : list) {
            System.out.println();
            System.out.println(
                     "Esse é: " + aluno.getName() +
                             " e sua nota é: "+ aluno.getNota() );

            if (aluno.getNota() < 6) {
                System.out.println("Você está reprovado");
            }else {
                System.out.println("Você foi aprovado!");
            }
        }

    }

}
