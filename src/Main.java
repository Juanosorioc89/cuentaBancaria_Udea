public class Main {
    public static void main (String[] Args){
        Cuenta miCuenta = new Cuenta("1234", "ahorro", 150000);
        System.out.println("saldo minimo: "+miCuenta.getSaldoMinimo());
        miCuenta.consignar(100000);
        System.out.println("saldo minimo: "+miCuenta.getSaldoActual());
        miCuenta.retirar(250000);
        System.out.println("saldo minimo: "+miCuenta.getSaldoActual());
        System.out.print(miCuenta.toString());
        System.out.print("------------------");


    }

}
