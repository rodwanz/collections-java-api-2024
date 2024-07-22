package list.PesquisaComList;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livroPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro la: livroList) {
                if (la.getAutor().equalsIgnoreCase(autor)){
                    livroPorAutor.add(la);
                }
            }
            return livroPorAutor;
        }else{
            throw new RuntimeException("A lista esta vazia");
        }
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro lia: livroList) {
                if (lia.getAnoPublicacao() >= anoInicial && lia.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(lia);
                }
            }
            return livrosPorIntervaloAnos;
        }else{
            throw new RuntimeException("A lista esta vazia");
        }
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for (Livro pt: livroList) {
                if (pt.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = pt;
                    break;
                }
            }
            return livroPorTitulo;
        }else{
            throw new RuntimeException("A lista esta vazia");
        }
    }
}
