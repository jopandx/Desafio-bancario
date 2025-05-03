import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class desafioCajero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String NomCliente = "Pepito luz";
        double Saldo = 500;
        String Tipocuenta = "Ahorro";
        double montoRetiro = 0;
        double montoDeposito = 0;
        int opciones = 0 ;

        System.out.printf("+++++++++++++++++++++++++++++++\n\n");
        System.out.printf("Nombre del Cliente: " + NomCliente +
                "\nTipo de cuenta: " + Tipocuenta + "\nSaldo disponible: " + Saldo);
        System.out.printf("\n\n+++++++++++++++++++++++++++++++");
        System.out.printf("\n**     Elija una opcion      **");

        String menu = """
                
                1: Consultar saldo
                2: Retiro
                3: Deposito
                9: Salir
                """;

        while (opciones !=9){
            System.out.println(menu);
            opciones = teclado.nextInt();

            switch (opciones){
                case 1:
                    System.out.printf("Su saldo es: "+Saldo);
                    break;
                case 2:
                    System.out.printf("Ingrese el monto que desea retirar: ");
                    montoRetiro = teclado.nextInt();
                    if (montoRetiro > Saldo){
                        System.out.printf("Saldo insuficiente");
                    }else {
                        Saldo = Saldo - montoRetiro;
                        System.out.printf("Su saldo actual es: "+Saldo);
                    }
                    break;
                case 3:
                    System.out.printf("Ingrese el monto a depositar: ");
                    montoDeposito =teclado.nextInt();
                    Saldo = Saldo + montoDeposito;
                    System.out.printf("Su saldo actual es: "+Saldo);


            }

        }



    }



}
