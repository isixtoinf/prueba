public class funcionesej1 {
    public static void main(String[] args) {
        System.out.println(capicua(1221));
        System.out.println(esPrimo(11));
        System.out.println(esSigprimo(54));
        System.out.println(respot(4,6));
        System.out.println(digitos(8437247));
        System.out.println(vuelta(12345));
        System.out.println(digitn(123456,2));
        System.out.println(digitpos(9,123456789));
        System.out.println(mender(12345));
        System.out.println(meniz(12345));
        System.out.println(masder(12345,6));
        System.out.println(masizq(12345,6));
        System.out.println(numtroz(123456789,2,5));
        System.out.println(juntnum(132,568));
    }
    //1
    public static boolean capicua(int capi){

        int a =vuelta(capi);
        boolean b=false;
        if (capi==a){
            b =true;
        }return  b;
    }
    //2
        public static boolean esPrimo (int primo){

        if (primo==0||primo==1||primo==4){
            return false;
        }
        for (int x=2;x<primo/2;x++){
            if (primo % x==0){
                return false;
            }
        }
        return true;}

    //3
    public static int esSigprimo(int sigprimo){
        sigprimo++;
       for (int x=2;x<sigprimo;x++){

           if (sigprimo%x==0){
               sigprimo++;
           }
       }
        return sigprimo;
    }

    //4
    public static double respot (int base, int exponente) {

        double restpot1 = 0;
        restpot1 = Math.pow(base, exponente);
        return restpot1;
    }

    //5
    public static int digitos(int numero){

        int cont=1;
        for (;numero>=10;cont++){
            numero=numero/10;
        }
        return cont;
    }

    //6
    public static int vuelta(int volteado){
        int a=0;
        int b=0;
        while(volteado!=0){

        a=volteado%10;
        b=b*10+a;
        volteado/=10;
    } return b;
    }
    //7
    public static int digitn (int numero, int digito){

        String num= String.valueOf(numero);
        int digit= num.charAt(digito);
        String digito1=Character.toString(digit);
        int manuel=Integer.parseInt(digito1);
        return manuel;


    }

    //8
    public static int digitpos (int n, int numero){

        boolean encontrado=false;
        int pos=0;
        int a=vuelta(numero);

        while (encontrado==false){

            int digito=a%10;

            if (digito==n){
                return pos;
            }
            else {
                pos++;
                a=a/10;
            }
        }
        return pos;
    }

    //9
    public static int mender(int derech){
        return derech/10;
    }

    //10
    public static int meniz(int izq){

        int a=vuelta(izq);
        int b =a/10;
        int c =vuelta(b);
        return c;
    }

    //11
    public static int masder(int numd ,int mder){

        numd=numd*10;
        return numd+mder;
    }

    //12
    public static int masizq(int numi, int mizq){

        int a=vuelta(numi);
        a=(a*10)+mizq;
        int b =vuelta(a);
        return b;

    }

  //13

    public static int numtroz(int num, int pos1, int pos2){

        String a= String.valueOf(num);
        int trozo= Integer.parseInt(a.substring(pos1,pos2+1));
        return trozo;

        }

        //14
    public static int juntnum(int num1,int num2){

        String a = String.valueOf(num1);
        String b = String.valueOf(num2);
        int junto= Integer.parseInt(a+b);
        return junto;
    }
}