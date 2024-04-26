package cadUser;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("deprecation")
@ManagedBean
@RequestScoped
public class PessoaBean {
    private Pessoa pessoa = new Pessoa();
    private static List<Pessoa> lista = new ArrayList<>();

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String adicionarPessoa() {
        lista.add(pessoa);
        pessoa = new Pessoa();
        return "";
    }

    public List<Pessoa> getLista() {
        return lista;
    }
}

