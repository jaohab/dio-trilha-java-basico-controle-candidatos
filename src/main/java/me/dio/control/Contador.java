package src.main.java.me.dio.control;

import java.util.ArrayList;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
		list.add(scan.nextInt());
		System.out.println("Digite o segundo parâmetro");
        list.add(scan.nextInt());

        scan.close();

        try {

            contar(list.get(0), list.get(1));
            
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois ) {
            throw new ParametrosInvalidosException();
        } else {
            for (int i = 0; i < (parametroDois - parametroUm); i++) {
                System.out.println("Imprimindo o número " + (i+1));
            }
        }
    }
    
}
