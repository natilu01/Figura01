
package CapaNegocio;

public class ClsCuadrilatero {
    private float _largo;
    private float _ancho;
    
   public ClsCuadrilatero(){
       _largo=1;
       _ancho=1;
   } 
   public ClsCuadrilatero(float largo,float ancho){
       _largo=(largo==0)?1:largo;
       _ancho=(ancho==0)?1:ancho;
   }
   public ClsCuadrilatero(ClsCuadrilatero a){
       this._largo=a._largo;
       this._ancho=a._ancho;
   }

    public double Largo() {
        return _largo;
    }

    public void Largo(float largo) {
        this._largo = largo;
    }

    public double Ancho() {
        return _ancho;
    }

    public void Ancho(float ancho) {
        this._ancho = ancho;
    }
    public boolean esRectangulo(){
        boolean es;
        if(_largo>_ancho||_ancho>_largo){
            es=true;
        }
        else{
            es=false;
        }
        return es;
    }
    public String Tipo(){
        String tipo;
        if(this.esRectangulo()==true){
            tipo="Es Rectangulo";
        }
        else{
            tipo="Es Cuadrado";
        }
        return tipo;
    }
    public float perimetro(){
        float resp;
        if(this.esRectangulo()==true){
            resp=2*(_largo+_ancho);
        }
        else{
            resp=resp=2*(_largo+_ancho);;
        }
        return resp;
    }
    public float area(){
        float resp;
        if(this.esRectangulo()==true){
            resp=_largo*_ancho;
        }
        else{
            resp=0;
        }
        return resp; 
    }
}
