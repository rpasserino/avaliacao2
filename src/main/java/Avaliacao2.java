
import utfpr.ct.dainf.if62c.avaliacao.Poligonal;
import utfpr.ct.dainf.if62c.avaliacao.PoligonalFechada;
import utfpr.ct.dainf.if62c.avaliacao.PontoXZ;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Segunda avaliação parcial 2014/2.
 * @author 
 */
public class Avaliacao2 {

    public static void main(String[] args) {
        Poligonal pol = new PoligonalFechada(3);
        
        pol.set(0, new PontoXZ(-3, 2));
        pol.set(1, new PontoXZ(-3, 6));
        pol.set(2, new PontoXZ(0, 2));
        
        double com = pol.getComprimento();
        System.out.printf("Comprimento da poligonal = %f%n", com);
    }
    
}
