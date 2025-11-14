package criacionais.singleton;

import java.util.ArrayList;

public class PessoaManager {
    static private PessoaManager instance;
    private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    private PessoaManager(){};

    static public synchronized PessoaManager getInstance(){
        if ( instance == null ) instance = new PessoaManager();
        return instance;
    }

    public boolean add(Pessoa pessoa){
        if ( pessoa != null ){
            pessoas.add(pessoa);
            return true;
        }
        return false;
    }

    public ArrayList<Pessoa> getLista() throws CloneNotSupportedException {
        ArrayList<Pessoa> novaLista = new ArrayList<Pessoa>();
        for ( Pessoa p : pessoas ){
            novaLista.add(p.clone());
        }
        return novaLista;
    }
}
