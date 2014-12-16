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
public class Poligonal{
    private final Ponto2D[] vertices;
    private Ponto2D plano;
    
    public Poligonal(int nv){
        if (nv<2)
            throw new RuntimeException("Poligonal deve ter ao menos 2 vértices");
        vertices = new Ponto2D[nv];
    }
    
    public int getN(){
        return vertices.length;
    }
    
    public Ponto2D get(int i){
        Ponto2D v = null;
        if (i>=0 && i < vertices.length)
            v = vertices[i];
        return v;
    }
    
    public void set(int i,Ponto2D v){
        if (plano == null) 
            plano = v;
        if (plano.getClass() != v.getClass())
            throw new RuntimeException("Vértices devem estar no mesmo plano");
        if (i >= 0 && i < vertices.length)
            vertices[i] = v;
    }
    
    public double getComprimento(){
        double comp=0;
        for (int i=0; i< vertices.length-1; i++) {
            comp += vertices[i].dist(vertices[i+1]);
        }
        return comp;
    }
}
