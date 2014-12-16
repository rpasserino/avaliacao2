/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utfpr.ct.dainf.if62c.avaliacao;

/**
 *
 * @author a1615327
 */
public class PoligonalFechada extends Poligonal{

    public PoligonalFechada(int nv){
        super(nv);
    }
    
    @Override
    public double getComprimento(){ 
        return super.getComprimento()+get(getN()-1).dist(get(0));
    }
}
