import java.util.Map;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        int opcionUsuario;
        Double cantidad=(0.00);
        while(true){
            String menu= """
                ***************************************************
                                CONVERSOR DE MONEDAS
                ***************************************************
                               BIENVENIDOS ELIJA UNA OPCIÓN:                
                1. Dolar ==> Peso argentino                
                2. Peso argentino ==> Dolar
                3. Dolar ==> Real brasileño
                4. Real brasileño ==> Dolar
                5. Dolar ==> Peso colombiano
                6. Peso colombiano ==> Dólar 
                7. Dolar ==> Peso argentino                
                8. Peso argentino ==> Dolar
                9. Salir
                ***************************************************           
                """;

            System.out.println(menu);
            opcionUsuario=lectura.nextInt();
            if(opcionUsuario==9){
                break;
            }
            System.out.println("introduzca la cantidad a convertir: ");
            cantidad=lectura.nextDouble();


            ConsultaMonedaAPI consultaMonedaAPI=new ConsultaMonedaAPI();
            String monedaOrigen="";
            String monedaDestino="";

            switch (opcionUsuario){
                case 1:
                    monedaOrigen="USD";
                    monedaDestino="MXN";
                    break;
                case 2:
                    monedaOrigen="MXN";
                    monedaDestino="USD";
                    break;
                case 3:
                    monedaOrigen="USD";
                    monedaDestino="BRL";
                    break;
                case 4:
                    monedaOrigen="BRL";
                    monedaDestino="USD";
                    break;
                case 5:
                    monedaOrigen="USD";
                    monedaDestino="COP";
                    break;
                case 6:
                    monedaOrigen="COP";
                    monedaDestino="USD";
                    break;
                case 7:
                    monedaOrigen="USD";
                    monedaDestino="ARS";
                    break;
                case 8:
                    monedaOrigen="ARS";
                    monedaDestino="USD";
                    break;
            }
            Moneda moneda=consultaMonedaAPI.buscarMoneda(monedaOrigen);
            ConversorMoneda conversor=new ConversorMoneda();
            String resultado= conversor.convertirMoneda((Map<String,Double>) moneda.conversion_rates(),
                    monedaOrigen,monedaDestino,cantidad);
            System.out.println(resultado);
        }
    }
}
