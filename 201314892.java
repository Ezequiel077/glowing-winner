   public static void ejercicio1(){

        Scanner s = new Scanner(System.in, "ISO-8859-1");
        int op;
        do{

            System.out.println("Ingrese un valor:");
            op = s.nextInt();


        }while(op<=0);

        System.out.println("Suma de pirmos"+ "   " + SumImpares(op));

        int contpa = 0;
        int acupa = 0;

        contpa = op;
        if (op % 2 ==0) {

            acupa = contpa + op;
            contpa++;

        }
        System.out.println("Promedio de pares:" + "    " + Prom(acupa, contpa));







    }

    public static boolean ejercicio2(int[] A,int[] B, int indice){

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if ((A[i]-indice)==B[j]) {

                    return true;

                }

            }

        }
        return false;


    }

    public static void ejercicio3(int indice){

        int x=0;
        for (int i = 0; i < indice; i++) {
            if (i%2==0) {
                x=x+2;
                System.out.print(" "+ x+ " ");
                if (indice<=x) {
                    break;
                }
            }
            if (i%2!=0) {
                x=x+3;
                System.out.print(" "+x+ " ");
                if (indice<=x) {
                    break;
                }
            }
        }

    }

    public static void ejercicio4() {
        Scanner s = new Scanner(System.in);
        String x;

        System.out.println("Ingrese frase:");
        x = s.next();
        char[] invertir = x.toCharArray();
        int I;

        for (I = x.length() - 1; I >= 0; I--) {

            System.out.print("" + invertir[I]);

        }




    }


    public static int SumImpares(int n){

        if(n==1){

            return 1;
        }else{

            return n + SumImpares(n-2);
        }



    }

    public static int Prom(int x, int y){
        int z = 0;

        z = x/y;

        return z;

    }
