

import java.util.Scanner;;
public class Calc {
    /**
     * @param args
     */
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ola. Por gentileza informe sua operação.");
        String x = scan.nextLine();

        if( x.equals("somar")){
            System.out.println("informe o primeiro numero:");
            int num1 = scan.nextInt();
            System.out.println("informe o segundo numero :");
            int num2 = scan.nextInt();
            sum(num1, num2);
  
        }else if(x.equals("subtrair")){
            System.out.println("informe o primeiro numero:");
            int num1 = scan.nextInt();
            System.out.println("informe o segundo numero :");
            int num2 = scan.nextInt();
            menus(num1, num2);
        }else if(x.equals("multiplicação")){
            System.out.println("informe o primeiro numero:");
            int num1 = scan.nextInt();
            System.out.println("informe o segundo numero :");
            int num2 = scan.nextInt();
            vezes(num1, num2);
        }else if (x.equals("divisão")){
             System.out.println("informe o primeiro numero:");
            int num1 = scan.nextInt();
            System.out.println("informe o segundo numero :");
            int num2 = scan.nextInt();
            div(num1, num2);
        } else{
            System.out.println("Função invalida: ");
        }

        System.out.println("Obrigado por usar até a proxima");

    }


    /**
     * @param x
     * @param y
     */
    static void sum(int x , int y){
        System.out.println(x+y);

    }
    
    static void menus(int x, int y){
        System.out.println(x-y);
    }

    static void vezes (int x , int y){
        System.out.println(x*y);
    }

    static void div (int x , int y){
        System.out.println(x/y);
    }
}
