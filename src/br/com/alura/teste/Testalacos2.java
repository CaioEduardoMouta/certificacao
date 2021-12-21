package br.com.alura.teste;

public class Testalacos2 {
    public static void main(String[] args) {

//        int externo = 4;
//        externo: for(int i = 1; i < 10; i++){
//            tabuada: System.out.println("tabuada do" + i);
//           interno: for(int j = 1; j < 10; j++) {
//                if(i * j == 25) break externo;
//                System.out.println(i + " * " + j + " = "+(i*j));
//            }
//        }

        for(int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                case 1:
                    System.out.println("Caso" + i);
                    break;
                case 2:
                    System.out.println("Certo " + i);
                    continue;
                case 3:
                    System.out.println("Chegueo no 3");
                    break;
                default:
                    System.out.println("Estranho");
            }
        }

        System.out.println();

        for(int j = 1; j < 10; j++) {
            if(j == 8) break;
            if(j == 5) continue;
            System.out.println(j);
        }

        int i = 0;
        while (i < 10) {
            i++;
            if (i == 5)
                break;
                System.out.println("i = " + i);
        }
        System.out.println("fora do while");
    }
}