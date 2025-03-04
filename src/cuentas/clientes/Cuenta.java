package cuentas.clientes;

/*
* @author Iasmina Adriana Maghiar
* @version 2
* @since 1
*/

public class Cuenta {

// Atributos
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

//Constructor sin parámetros.
    public Cuenta()
    {
        nombre ="";
        cuenta="";
        saldo=1;
        tipoInteres=0;
    }
//Constructor con parámetros.
    public Cuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInteres=tipo;
    }

    /*
    * Estado
    * @return saldo
    */
    public double estado()
    {
        return saldo;
    }
    
    /*
    * Método ingresar
    * @throws Exception
    * @return void
    */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /*
    * Método retirar
    * @throws Exception
    * @return void
    */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    /*
    * Getter nombre
    * @return nombre
    */
    public String getNombre() {
        return nombre;
    }

    /*
    * Setter nombre
    * @return void
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*
    * Getter cuenta
    * @return cuenta
    */
    public String getCuenta() {
        return cuenta;
    }

    /*
    * Setter cuenta
    * @return void
    */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /*
    * Getter saldo
    * @return saldo
    */
    public double getSaldo() {
        return saldo;
    }

    /*
    * Setter saldo
    * @return void
    */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /*
    * Getter tipo interes
    * @return tipoInteres
    */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /*
    * Setter tipo interes
    * @return void
    */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
    
}
