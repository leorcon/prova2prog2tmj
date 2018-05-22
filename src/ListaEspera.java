
import java.util.ArrayList;

/**
 *
 * @author Leonardo Rafael Conceicao
 */
public class ListaEspera {
    private ArrayList<Usuario> usuarios = new ArrayList();
    private Obra o;
    
    public ListaEspera(Obra o){
        this.o = o;
    }
    
    public void add(Usuario u){
        usuarios.add(u);
    }
    
    public Usuario getPrimeiro(){
        return usuarios.get(1);
    }
    
    public void remover(Usuario u){
        usuarios.remove(u);
    }
    
    public void update(){
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.getNome() + o.getTitulo());
        }
    }
}
