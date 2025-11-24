package Development.Team;

import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ConversorApp {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println(
                    """
                    ******************************************************
                    Sea bienvenido al conversor de monedas 
                    
                    1) Dólar => Peso Argentino
                    2) Peso Argentino => Dólar
                    3) Dólar => Real Brasileño
                    4) Real Brasileño => Dólar
                    5) Dólar => Peso Colombiano
                    6) Peso Colombiano => Dólar
                    7) Salir
                    
                    Elija una opción válida:
                    ******************************************************
                    """
            );

            String option = scanner.nextLine();

            if (option.equals("7")) {
                System.out.println("Saliendo del programa...");
                break;
            }
            if(Integer.parseInt(option) < 1 || Integer.parseInt(option) > 6){
                System.out.println("Opción inválida. Intente nuevamente.");
                continue;
            }

            System.out.print("Ingrese el monto a convertir: ");
            double monto = scanner.nextDouble();
            scanner.nextLine();

            Conversor conversor = new Conversor();

            switch (option) {
                case "1" -> { // USD → ARS
                    conversor.setBaseCode("USD");
                    conversor.setTargetCode("ARS");
                }
                case "2" -> { // ARS → USD
                    conversor.setBaseCode("ARS");
                    conversor.setTargetCode("USD");
                }
                case "3" -> { // USD → BRL
                    conversor.setBaseCode("USD");
                    conversor.setTargetCode("BRL");
                }
                case "4" -> { // BRL → USD
                    conversor.setBaseCode("BRL");
                    conversor.setTargetCode("USD");
                }
                case "5" -> { // USD → COP
                    conversor.setBaseCode("USD");
                    conversor.setTargetCode("COP");
                }
                case "6" -> { // COP → USD
                    conversor.setBaseCode("COP");
                    conversor.setTargetCode("USD");
                }
                default -> {
                    System.out.println("Opción inválida. Intente nuevamente.");
                    continue;
                }
            }

            conversor.setMount(monto);

            System.out.println("Convirtiendo...");

            // Llamada a la API
            double resultado = ConversorApi.ConversorApis(conversor);

            System.out.printf("Resultado: %.2f %s%n",
                    resultado, conversor.getTargetCode());
            System.out.println();
        }
    }
}