package set.PesquisaComSet.listando;

public class Tarefas {
    private String descricao;
    private boolean concluida;

    public Tarefas(String descricao, boolean concluida) {
        this.descricao = descricao;
        this.concluida = concluida;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isOncluida() {
        return concluida;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setConcluida(boolean oncluida) {
        this.concluida = oncluida;
    }

    @Override
    public String toString() {
        return "Tarefas{" +
                "descricao = '" + descricao + '\'' +
                ", concluida = " + concluida +
                '}';
    }
}
