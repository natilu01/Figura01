
package CapaNegocio;

public class ClsPoligono {
    
    private double _lado;
    private double _numLados;

    public ClsPoligono(double _lado, double _numLados) {
        this._lado = _lado;
        this._numLados = _numLados;
    }

    public double lado() {
        return _lado;
    }

    public void lado(double _lado) {
        this._lado = _lado;
    }

    public double numLados() {
        return _numLados;
    }

    public void numLados(double _numLados) {
        this._numLados = _numLados;
    }
    public float Perimetro(){
        float perimetro;
        perimetro =(float)(_numLados * _lado);
        return perimetro;
    }
    public float Area(){
        float area, apotema;
        apotema =(float) (_lado/2*Math.tan(180));
        area=((Perimetro()*apotema)/2);
        return area;
    }
}
