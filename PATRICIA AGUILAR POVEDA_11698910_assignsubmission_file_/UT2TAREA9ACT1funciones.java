import java.util.InputMismatchException;
import java.util.Scanner;

public class UT2TAREA9ACT1funciones {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int seleccion;
        int salir = 1;

        do {        //bucle do while para preguntar si quiere seguir con el menú o salir
            try {           //try catch para capturar los errores introducidos por teclado
                do {        //bucle do while para preguntar el menú hatsa introducir entre el 1 y el 14
                    System.out.println("Elige que quieres hacer: ");
                    System.out.println(" ");

                    System.out.println("1-. Hacer una Potencia");
                    System.out.println("2-. Saber si un número es primo");
                    System.out.println("3-. Conocer el siguiente número primo");
                    System.out.println("4-. Darle la vuelta a un número");
                    System.out.println("5-. Saber si un número es capicua");
                    System.out.println("6-. Saber el número de digitos que tiene un número");
                    System.out.println("7-. Quitar el último dígito del número a seleccionar.");
                    System.out.println("8-. Quitar el primer dígito del número a seleccionar");
                    System.out.println("9-. Junta dos números");
                    System.out.println("10-. Elegir un trozo del número");
                    System.out.println("11-. Poner un dígito al final del número");
                    System.out.println("12-. Poner un dígito al principio del número");
                    System.out.println("13-. Saber según la posición, que dígito se encuentra en dicha posición");
                    System.out.println("14-. Saber la posición de un dígito dentro de un número seleccionado.");

                    System.out.println(" ");
                    System.out.println("Escribe el número correspondiente a lo que quieres hacer: ");

                    seleccion = sc.nextInt();
                    if (seleccion < 1 || seleccion > 14) { //if para que en el caso de no salir del bucle indicar que los valores válidos son de 1 a 14.
                        System.out.println("Debe introducir un valor entre el 1 y el 14, ambos inclusive");
                    }
                } while (seleccion < 1 || seleccion > 14);  //comprueba si seleccion es entre 1 o 14, para salir del bucle y entrar en el switch.
                switch (seleccion) {
                    case 1:
                        System.out.println("Ha seleccionado hacer una potencia, indice la base y después el exponente");
                        System.out.println("Escribe un número como base: ");
                        int base = sc.nextInt();
                        System.out.println("Escribe un número como exponente: ");
                        int exponente = sc.nextInt();
                        System.out.println(potencia(base, exponente));    //llamamos a la función potencia
                        System.out.println("Si quiere salir ponga 0, si quiere continuar use otro número");
                        salir = sc.nextInt();
                        break;
                    case 2:
                        System.out.println("Ha seleccionado saber si un número es primo");
                        System.out.println("Escribe el número que quieras comprobar si es primo: ");
                        int num = sc.nextInt();
                        boolean valor;
                        valor = esPrimo(num);       //llamamos a la función esPrimo
                        System.out.println(valor);
                        System.out.println("Si quiere salir ponga 0, si quiere continuar use otro número");
                        salir = sc.nextInt();
                        break;
                    case 3:
                        System.out.println("Ha seleccionado Conocer el siguiente número primo");
                        System.out.println("Escribe un número, te devolveremos el siguiente número primo más cercano: ");
                        int numero = sc.nextInt();
                        System.out.println(siguientePrimo(numero));     //llamamos a la función siguientePrimo
                        System.out.println("Si quiere salir ponga 0, si quiere continuar use otro número");
                        salir = sc.nextInt();
                        break;
                    case 4:
                        System.out.println("Ha seleccionado Darle la vuelta a un número");
                        System.out.println("Escribe el número al que le quieras dar la vuelta: ");
                        int darLaVuelta = sc.nextInt();
                        System.out.println(voltea(darLaVuelta));        //llamamos a la función voltea
                        System.out.println("Si quiere salir ponga 0, si quiere continuar use otro número");
                        salir = sc.nextInt();
                        break;
                    case 5:
                        System.out.println("Ha seleccionado Saber si un número es capicua");
                        System.out.println("Escribe el número que quieras saber si es capicúa: ");
                        int serCapicua = sc.nextInt();
                        System.out.println(esCapicua(serCapicua));      //llamamos a la función esCapicua
                        System.out.println("Si quiere salir ponga 0, si quiere continuar use otro número");
                        salir = sc.nextInt();
                        break;
                    case 6:
                        System.out.println("Ha seleccionado Saber el número de digitos que tiene un número");
                        System.out.println("Escribe el número del que quieras saber la cantidad de digitos: ");
                        int numDigitos = sc.nextInt();
                        System.out.println(digitos(numDigitos));        //llamamos a la función numDigitos
                        System.out.println("Si quiere salir ponga 0, si quiere continuar use otro número");
                        salir = sc.nextInt();
                        break;
                    case 7:
                        System.out.println("Ha seleccionado quitar el último dígito del número a seleccionar.");
                        System.out.println("Escribe el número del que quieras quitar el último dígito: ");
                        int quitarDetras = sc.nextInt();
                        System.out.println(quitaPorDetras(quitarDetras));   //llamamos a la función quitarDetras
                        System.out.println("Si quiere salir ponga 0, si quiere continuar use otro número");
                        salir = sc.nextInt();
                        break;
                    case 8:
                        System.out.println("Ha seleccionado Quitar por delante un digito al número seleccionado");
                        System.out.println("Escribe el número del que quieras quitar el primer dígito: ");
                        int quitarDelante = sc.nextInt();
                        System.out.println(quitaPorDelante(quitarDelante)); //llamamos a la función quitaDelante
                        System.out.println("Si quiere salir ponga 0, si quiere continuar use otro número");
                        salir = sc.nextInt();
                        break;
                    case 9:
                        System.out.println("Ha seleccionado Junta dos números");
                        System.out.println("Escribe el primer número a juntar: ");
                        int num1 = sc.nextInt();
                        System.out.println("Escribe el segundo número a juntar: ");
                        int num2 = sc.nextInt();
                        System.out.println(juntaNumeros(num1, num2));       //llamamos a la función juntaNumeros
                        System.out.println("Si quiere salir ponga 0, si quiere continuar use otro número");
                        salir = sc.nextInt();
                        break;
                    case 10:
                        System.out.println("Ha seleccionado Elegir un trozo del número");
                        System.out.println("Escribe el número del que quieres extraer un trozo: ");
                        int numEntero = sc.nextInt();
                        System.out.println("Escribe la primera posición del trozo que quieres extraer, el primer dígito está en la posición 0, y así sucesivamente: ");
                        int posic1 = sc.nextInt();
                        System.out.println("Escribe la última posición del trozo que quieres extraer: ");
                        int posic2 = sc.nextInt();
                        System.out.println(trozoDeNumero(numEntero, posic1, posic2));   //llamamos a la función trozoDeNumero
                        System.out.println("Si quiere salir ponga 0, si quiere continuar use otro número");
                        salir = sc.nextInt();
                        break;
                    case 11:
                        System.out.println("Ha seleccionado Poner un dígito al final del número");
                        System.out.println("Escribe el número al que quieras añadir un dígito al final: ");
                        int nume1 = sc.nextInt();
                        System.out.println("Escribe el dígito que quieras añadir al final: ");
                        int nume2 = sc.nextInt();
                        System.out.println(pegaPorDetras(nume1, nume2));        //llamamos a la función pegaPorDetras
                        System.out.println("Si quiere salir ponga 0, si quiere continuar use otro número");
                        salir = sc.nextInt();
                        break;
                    case 12:
                        System.out.println("Ha seleccionado Poner un dígito delante del número");
                        System.out.println("Escribe el número al que quieras añadir un dígito al principio");
                        int numero2 = sc.nextInt();
                        System.out.println("Escribe el dígito que quieras añadir al principio: ");
                        int numero1 = sc.nextInt();
                        System.out.println(pegarPorDelante(numero1, numero2));    //llamamos a la función pegarPorDelante
                        System.out.println("Si quiere salir ponga 0, si quiere continuar use otro número");
                        salir = sc.nextInt();
                        break;
                    case 13:
                        System.out.println("Ha seleccionado Saber según la posición, que dígito se encuentra en dicha posición");
                        System.out.println("Escribe el número del que quieras saber la posición de un dígito");
                        int numer1 = sc.nextInt();
                        System.out.println("Escribe la posición de la que quieras saber el dígito: ");
                        int numer2 = sc.nextInt();
                        System.out.println(DigitoN(numer1, numer2));        //llamamos a la función DigitoN
                        System.out.println("Si quiere salir ponga 0, si quiere continuar use otro número");
                        salir = sc.nextInt();
                        break;
                    case 14:
                        System.out.println("Ha seleccionado Saber la posición de un dígito dentro de un número seleccionado.");
                        System.out.println("Escribe el número del que quieras saber el dígito que se encuentra en X posición");
                        int nu1 = sc.nextInt();
                        System.out.println("Escribe el dígito del que quieras saber la posición: ");
                        int nu2 = sc.nextInt();
                        System.out.println(posicionDeDigito(nu1, nu2));     //llamamos a la función posicionDeDigito
                        System.out.println("Si quiere salir ponga 0, si quiere continuar use otro número");
                        salir = sc.nextInt();
                        break;
                }
            } catch (InputMismatchException e) {             //catch captura los errores
                System.out.println("Ha insertado un carácter no numérico");
            }
        } while(salir != 0);  //cuando salir sea 0 entonces saldrá del bucle y finaliza el programa.
    }




    public static int potencia(int base, int exponente) {
        int potencia = (int) Math.pow(base, exponente);    //Calcula la potencia de base y exponente
        return potencia;
    }


    public static boolean esPrimo(int dividendo) {

        int contador = 0;
        int divisor = 1;
        int esPrimo = 0;
        boolean primo = false;

        for (; dividendo >= divisor; divisor++) {   //bucle por para que mientras el dividendo sea mayor o igual que el divisor aumente divisor 1 más.
            if (dividendo % divisor == 0) {     //si el resto es 0, sumamos contador
                contador++;
            }
        }
        if (contador == 2) {
            esPrimo = dividendo;        //si contador es igual a 2, asignamos el valos del dividendo a la variable esPrimo
        }
        if (esPrimo != 0) {         //esPrimo está inicializada en 0, si cambia es porque ha pasado por el anterior if, por lo tanto es primo.
            primo = true;
        }
        return (primo);
    }

    public static int siguientePrimo(int n) {
        int valor = n;
        boolean sino;

        do{
           valor++;
           sino = esPrimo(valor);       //llamamos a la funcion esPrimo para comprobar si es primo, si es false sigue sumando hasta encontrar el siguiente primo
        }
        while (sino == false);

        return (valor);
    }

    public static int voltea (int invertir){

        int numInvertir = invertir;
        int resto;
        int resto2;

        numInvertir = Math.abs(numInvertir);    //Math.abs para usar el valor absoluto en caso de insertar un numero negativo
        resto = numInvertir % 10;               //cogemos el resto del numero entre 10, que será el ultimo numero del numero, este queda guardado
        numInvertir = numInvertir / 10;         //dividimos el numero entre 10 para ir quitando numeros de detrás

        while (numInvertir > 0) {
            resto2 = numInvertir % 10;
            resto = (resto * 10) + resto2;      //cogemos el resto y lo multiplicamos por 10 para luego sumarle el siguiente resto e ir guardando el numero.
            numInvertir = numInvertir / 10;
        }

        return (resto);
    }


    public static boolean esCapicua(int numCompara) {

        int valorAcomparar = numCompara;
        boolean SiEsCapicua = true;

        if (valorAcomparar == voltea(valorAcomparar)) {     //llamamos a la función voltea y compara ambos numeros
            SiEsCapicua = true;                             //si entra en el if es capicua
        }
        else{                                               //sino no es capicua.
            SiEsCapicua = false;
        }
        return (SiEsCapicua);
    }


    public static int digitos (int numDigitos) {        //Calcula la cantidad de digitos

        int numAcontar = numDigitos;
        int digitos = 0;

        numAcontar = Math.abs(numAcontar);          //Math.abs para usar el valor absoluto en caso de insertar un numero negativo

        while(numAcontar != 0) {
            numAcontar = numAcontar / 10;           //mientras el numero no sea 0 divide entre 10, lo que hace que en un entero
            digitos++;                              //se vaya restando y aumenta el contador de digitos por división.
        }
        return (digitos);
    }

    public static int quitaPorDetras (int quitaDetras){

        int numQuitaDetras = quitaDetras;

        numQuitaDetras = numQuitaDetras / 10;       //dividimos entre 10 una vez para quitar el último número

        return (numQuitaDetras);
    }

    public static int quitaPorDelante (int quitaDelante) {

        int numQuitaDelante = quitaDelante;

        numQuitaDelante = voltea(numQuitaDelante);          //llamamos a la función voltea para darle la vuelta al numero
        numQuitaDelante = quitaPorDetras(numQuitaDelante);  //llamamos a la función quitaPorDetras para quitar el último número
        numQuitaDelante = voltea(numQuitaDelante);          //volteamos de nuevo.

        return (numQuitaDelante);
    }

    public static int juntaNumeros (int PrimerNum, int SegundoNum){
        int numPrimero = PrimerNum;
        int numSegundo = SegundoNum;
        String primeraCadena = Integer.toString(numPrimero);
        String segundaCadena = Integer.toString(numSegundo);        //pasamos a string ambos numeros

        String sumaCadenas = (primeraCadena + segundaCadena);       //concatenamos ambas cadenas

        return Integer.parseInt((sumaCadenas));                     //devolvemos la cadena como int
    }


    public static int trozoDeNumero (int numero, int posic1, int posic2){

        int numeroUsar = numero;
        int posicion1 = posic1;
        int posicion2 = posic2;

        String numeroAusar = Integer.toString(numeroUsar);      //convertimos a string
        String trozoRecogido = numeroAusar.substring(posicion1, posicion2);     //sacamos la subcadena con ambas posiciones
        int trozoFinal = Integer.parseInt(trozoRecogido);       //devuelve int

        return (trozoFinal);
    }


    public static int pegaPorDetras (int PrimerNum, int SegundoNum) {

        int numPrimero = PrimerNum;
        int numSegundo = SegundoNum;
        numSegundo = InsertarSolo1Numero(numSegundo);           //llamamos a la función para que solo se pueda insertar del 0 al 9.

        String primeraCadena = Integer.toString(numPrimero);
        String ultimoCaracter = Integer.toString(numSegundo);       //convertimos a cadenas

        String ConjuntoCadenaChar = primeraCadena + ultimoCaracter; //concatenamos ambas
        int conjuntoCadChar = Integer.parseInt(ConjuntoCadenaChar); //devuelve int

        return (conjuntoCadChar);
    }

    public static int pegarPorDelante (int PrimerNum, int SegundoNum){

        int numPrimero = PrimerNum;
        int numSegundo = SegundoNum;
        numPrimero = InsertarSolo1Numero(numPrimero);           //llamamos a la función para que solo se pueda insertar del 0 al 9.

        String primeraCadena = Integer.toString(numPrimero);
        String ultimoCaracter = Integer.toString(numSegundo);       //convertimos a cadenas

        String ConjuntoCadenaChar = primeraCadena + ultimoCaracter;     //concatenamos ambas
        int conjuntoCadChar = Integer.parseInt(ConjuntoCadenaChar);     //pasamos a int

        return (conjuntoCadChar);
    }

    public static int DigitoN(int numEntero, int digitoElegir){

        int numeroEntero = numEntero;
        int digito = digitoElegir;
        digito = InsertarSolo1Numero(digito);           //llamamos a la función para que solo se pueda insertar del 0 al 9.

        String cadenaEntero = Integer.toString(numeroEntero);   //convertimos a string
        char posicionNum = cadenaEntero.charAt(digito);         //utilizamos charAt para saber que numero se encuentra en la posición que insertemos

        int posicNumFin = Integer.parseInt(String.valueOf(posicionNum));   //pasamos a int

        return (posicNumFin);
    }


    public static int posicionDeDigito(int numEntero, int posicionDeDigito){

        int numeroEntero = numEntero;
        int posicionDigito = posicionDeDigito;
        int digitoDevolver;

        String cadenaDeEntero = Integer.toString(numeroEntero);         //convertimos ambas string
        String digitoPosicion = Integer.toString(posicionDigito);
        digitoDevolver = cadenaDeEntero.indexOf(digitoPosicion);  //utilizamos IndexOf para saber en que posición está un número de la cadena
                                                                    //si no lo encuentra devuelve -1.

        return (digitoDevolver);
    }


    public static int InsertarSolo1Numero(int insertar){       //función para que solo se pueda insertar un número de 0 a 9.

        Scanner sc = new Scanner(System.in);
        int numInsertado = insertar;

        while (numInsertado < 0 || numInsertado > 9) {   //mientras el número sea menor que 0 o mayor que 9 seguirá pidiendo insertar el número.
            System.out.println("Debe insertar un numero entre 0 y 9, ambos inclusive, inténtelo de nuevo");
            numInsertado = sc.nextInt();
        }
        return (numInsertado);
    }

}








