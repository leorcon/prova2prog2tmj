
import java.util.ArrayList;

/**
 *
 * @author Leonardo Rafael Conceição
 */
public class Principal {

    public static void main(String args[]) {
        // Não se pode alterar o trecho abaixo         
        Autor a1 = new Autor("GAMMA", "Erich", 1948);
        Autor a2 = new Autor("Helm", "RiCHard", 1952);
        Autor a3 = new Autor("Johnson", "RALPH", 1950);
        Autor a4 = new Autor("Vlissides", "John", 1954);

        Usuario u1 = new Usuario("João", 1000);
        Usuario u2 = new Usuario("Maria", 2000);
        Usuario u3 = new Usuario("Pedro", 3000);

        // ALTERAÇÕES PERMITIDAS A PARTIR DESTE PONTO
        Obra o1 = new Obra("Design Patterns", "Elements of reusable object-Oriented Software",
                "Addison-Wesley", "New Jersey", 1995);
        o1.addAutor(a1);
        o1.addAutor(a2);
        o1.addAutor(a3);
        o1.addAutor(a4);

        Obra o2 = new Obra("Use a cabeça!", "padrões de projetos",
                "Alta Books", "Rio de Janeiro", 2007);
        o2.addAutor(new Autor("FREEMAN", "Eric", 1965));
        o2.addAutor(new Autor("Freeman", "ELISABETH", 1968));
        o2.addAutor(new Autor("Kathy", "SieRRa", 1970));
        o2.addAutor(new Autor("Bert", "Bates", 1970));

        
        GerenciarEmprestimo gerenciarObra1 = new GerenciarEmprestimo(o1);
        Emprestimo emp1 = gerenciarObra1.emprestar(u1, o1);
        Emprestimo emp2 = gerenciarObra1.emprestar(u2, o1);
        Emprestimo emp3 = gerenciarObra1.emprestar(u3, o1);
        gerenciarObra1.devolver(emp1);
    }
}
