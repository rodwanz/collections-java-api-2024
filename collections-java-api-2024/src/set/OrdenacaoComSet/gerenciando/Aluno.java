package set.OrdenacaoComSet.gerenciando;

import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
    private String nome;
    private long matricula;
    private double media;

    public Aluno(String nome, long matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return Objects.equals(getNome(), aluno.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome = '" + nome + '\'' +
                ", matricula = " + matricula +
                ", nota = " + media +
                '}';
    }
    @Override
    public int compareTo(Aluno aluno) {
        return nome.compareTo(aluno.getNome());
    }
}
