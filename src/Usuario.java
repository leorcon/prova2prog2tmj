
/**
 *
 * @author Leonardo Rafael Conceição
 */
public class Usuario {
    private String nome;
    private int identificacao;
    
    public Usuario(String nome, int identificacao) {
        this.setNome(nome);
        this.setIdentificacao(identificacao);
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        if (nome == null
            || nome.isEmpty()){
            throw new IllegalArgumentException("Nome do usuário inválido.");
        }
        else {
            this.nome = nome;
        }
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(int identificacao) {
        if (identificacao < 0 
            || identificacao > 999999){
            throw new IllegalArgumentException("Número de identificação inválido.");
        }
        this.identificacao = identificacao;
    }
    
}
