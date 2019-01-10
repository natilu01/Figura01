
package CapaNegocio;

public class ClsCirculo {
    private float _radio;
//constructor
    public ClsCirculo(float _radio) {
        this._radio = _radio;
    }
//getter y setter
    public float radio() {
        return _radio;
    }

    public void radio(float _radio) {
        this._radio = _radio;
    }
    //metodos
    public float perimetro (){
        float perimetro;
        perimetro=(float)(2*Math.PI*_radio);
        return perimetro;
    }
    public float area (){
        float area;
        area = (float)(Math.PI* Math.pow(_radio,2));
        return area;  
    }
    
}
// arbol de navegacion de menus para el pry factura
//sabiendo en el objeto cliente item y factura