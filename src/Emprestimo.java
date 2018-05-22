/** ESTA CLASSE NÃO PODE SER ALTERADA
 *  E NÃO PRECISA SER ENTREGUE.
 * @author Marcel
 */
import java.util.Date;

public class Emprestimo {
    private Usuario usuario;
    private Obra obra;
    private Date dataEmprestimo;
    private Date dataDevolucao;

    public Emprestimo(Usuario usuario, Obra obra) {
        this.setUsuario(usuario);
        this.setObra(obra);
        this.dataEmprestimo = new Date();
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    private void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Obra getObra() {
        return obra;
    }

    private void setObra(Obra obra) {
        if (obra == null){
            throw new IllegalArgumentException("Obra não identificada para empréstimo");
        }
        obra.emprestar(this);
        this.obra = obra;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void encerrar() {
        this.obra.devolver(this);
        this.dataDevolucao = new Date();
    }
    
}
