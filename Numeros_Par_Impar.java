
    package numeros_par_impar;
    import java.util.Scanner;

    public class Numeros_Par_Impar {


        public static void main(String[] args) {
            int numero;
            System.out.println("insira o numero");
            Scanner input = new Scanner(System.in);
            numero= input.nextInt();
            if (numero % 2 ==0)
                System.out.println("o numero inserido é par");
            else 
                System.out.println("o numero inserido é impar");

        }

    }
