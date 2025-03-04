package cuentas.clientes;

/*
* @author Iasmina Adriana Maghiar
* @version 2
* @since 1
*/

public class Main {
    /*
    * Método main
    * @param args Parámetro args
    */
    public static void main(String[] args) {
        operativa_cuenta(1);
    }
    
    /*
    * Operativa de la cuenta
    * @param cantidad Parámetro cantidad
    * @throws Exception
    */
    private static void operativa_cuenta(float cantidad) {
        Cuenta cuenta1;
        double saldoActual;

        cuenta1 = new Cuenta("Rafael Nadal Parera","1000-2365-85-1230456789",2500,0);
        
        System.out.println("El saldo actual es:"+ cuenta1.estado() );

        try {
            cuenta1.retirar(2300);
            System.out.println("El saldo actual es:"+ cuenta1.estado() );
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
            System.out.println("El saldo actual es:"+ cuenta1.estado() );
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
