
/**
 *
 * @author Leonardo Rafael Conceicao
 */
public class GerenciarEmprestimo {

    private ListaEspera le;
    private Obra o;
    
    public GerenciarEmprestimo(Obra o) {
        this.o = o;
        this.le = new ListaEspera(o);
    }

    public Emprestimo emprestar(Usuario u, Obra o) {
        if (o.estaEmprestada()) {
            le.add(u);
            throw new IllegalArgumentException("Obra já emprestada, usuário colocado na fila de espera");
        } else {
            if (le.getPrimeiro() != null) {
                if (le.getPrimeiro() == u) {
                    le.remover(u);
                    le.update();
                    return new Emprestimo(u, o);
                }
                throw new IllegalArgumentException("Obra reservada para outro usuário");
            }
            le.update();
            return new Emprestimo(u, o);
        }
    }

    public void devolver(Emprestimo e) {
        e.encerrar();
        le.update();
    }
}
