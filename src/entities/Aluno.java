package entities;

public class Aluno {
    private String name;
    private Double nota;

    public String getName() {
        return name;
    }

    public Double getNota() {
        return nota;
    }

    public Aluno(String name, Double nota) {
        this.name = name;
        this.nota = nota;

    }
}
