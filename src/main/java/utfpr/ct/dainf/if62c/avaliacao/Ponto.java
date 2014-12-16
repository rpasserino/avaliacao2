package utfpr.ct.dainf.if62c.avaliacao;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Segunda avaliação parcial 2014/2.
 * @author 
 */
public class Ponto {
    private double x, y, z;
    
    public Ponto(){
        
    }
    
    public Ponto(double x, double y, double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public String getNome(){
        return getClass().getSimpleName();
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }    
    public double getZ(){
        return z;
    }    
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    } 
    public void setZ(double z){
        this.z = z;
    }

    @Override
    public int hashCode(){
        int hash = 3;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.x) ^ (Double.doubleToLongBits(this.x) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.y) ^ (Double.doubleToLongBits(this.y) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.z) ^ (Double.doubleToLongBits(this.z) >>> 32));
        return hash;
    }
    
    @Override
    public String toString(){
        return String.format("%s(%f,%f,%f)", getNome(), x, y, z);
    }
    
    @Override
    public boolean equals(Object obj){
        boolean e = false;
        if (obj!=null && obj instanceof Ponto){
            Ponto p = (Ponto) obj;
            e = x == p.x && y == p.y && z == p.z;
        }
        return e;
    }
    
    public double dist(Ponto p){
        return Math.sqrt(Math.pow(p.x-x,2)+Math.pow(p.y-y,2)+Math.pow(p.z-z,2));
    } 
}
