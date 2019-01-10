
package CapaNegocio;

public class ClsTriangulo {
     private int _lado1;
   private int _lado2;
   private int _lado3;
   
  public ClsTriangulo(){
      _lado1=1;
      _lado2=1;
      _lado3=1;
  } 
  public ClsTriangulo(int la1,int la2,int la3){
      _lado1=(la1==0)?1:la1;
      _lado2=(la2==0)?1:la2;
      _lado3=(la3==0)?1:la3;
  }
  public ClsTriangulo(ClsTriangulo a){
      _lado1=a._lado1;
      _lado2=a._lado2;
      _lado3=a._lado3;
  }

    public int Lado1() {
        return _lado1;
    }

    public void Lado1(int lado1) {
        this._lado1 = lado1;
    }

    public int Lado2() {
        return _lado2;
    }

    public void Lado2(int lado2) {
        this._lado2 = lado2;
    }

    public int Lado3() {
        return _lado3;
    }

    public void Lado3(int lado3) {
        this._lado3 = lado3;
    }
    
    public boolean estriangulo(){
        boolean es=false;
        if(_lado1+_lado2>_lado3){
            es=true;
        }
        else{
            if(_lado1+_lado3>_lado2){
                es=true;
            }
            else{
                if(_lado2+_lado3>_lado1){
                    es=true;
                }
            }
        }
        return es;
    }
    public String Tipo(){
        String tipo=" ";
        if(this.estriangulo()==true){
            if(_lado1==_lado2&&_lado1==_lado3&&_lado2==_lado3){
                tipo+="Equilatero";
            }
            if(_lado1==_lado2&&_lado1!=_lado3){
                tipo+="Isoceles";
            }
            if(_lado1==_lado3&&_lado1!=_lado2){
                tipo+="Isoceles";
            }
            if(_lado2==_lado3&&_lado2!=_lado1){
                tipo+="Isoceles";
            }
            if(_lado1!=_lado2&&_lado1!=_lado3&&_lado2!=_lado3){
                tipo+="Escaleno";
            }
            if((Math.pow(_lado1,2)+Math.pow(_lado2, 2))==Math.pow(_lado3, 2)){
                tipo+="Rectangulo";
            }
            if((Math.pow(_lado1,2)+Math.pow(_lado3, 2))==Math.pow(_lado2, 2)){
                tipo+="Rectangulo";
            }
            if((Math.pow(_lado2,2)+Math.pow(_lado3, 2))==Math.pow(_lado1, 2)){
                tipo+="Rectangulo";
            }
        }
        else{
            tipo+="No es triangulo";
        }
        return tipo;
    }
    public int perimetro(){
        int resp;
        if(this.estriangulo()==true){
            resp=_lado1+_lado2+_lado3;
        }
        else{
            resp=0;
        }
        return resp;
    }
    public float area(){
        float resp;
        float sp;
        sp=(this.perimetro()/2);
        float area=(sp)*((sp-_lado1))*(sp-_lado2)*(sp-_lado3);
        if(this.estriangulo()==true){
            resp=(float)Math.sqrt(area);
        }
        else{
            resp=0;
        }
        return resp;
    }
}
