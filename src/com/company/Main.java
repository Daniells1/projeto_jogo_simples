package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pontos = 0;
        System.out.println("Bem vindo! Pressione S para continuar.");
        String string =scanner.nextLine();
        if (string.equals("s"))
        {
            System.out.println("Qual a capital do Brasil?");
            string =scanner.nextLine();
            if(string.equals("Brasilia")) {
                pontos++;
                System.out.println("Você pontuou!");
                System.out.println("Você deseja continuar?(s) ou desistir (d)?");
                string = scanner.nextLine();
                if(string.equals("s")){
                    //
                    System.out.println("Em qual continente fica o Brasil?");
                    string = scanner.nextLine();
                    if(string.equals("america do sul")){
                        pontos++;
                        System.out.println("Você pontuou!");

                        System.out.println("Você deseja continuar?(s) ou desistir (d)?");
                        string = scanner.nextLine();
                        if(string.equals("s")){
                            System.out.println("Qual melhor escola de t.i do Brasil?");
                            string = scanner.nextLine();
                            if(string.equals("danki code")){
                                pontos++;
                                System.out.println("Você ganhou!");
                                System.out.println("Sua pontuação final foi de:"+pontos);

                            }else {
                                System.out.println("Game over!Sua pontuação foi de" + pontos);
                            }

                        }else{
                            System.out.println("Game over!Sua pontuação foi de"+pontos);

                        }
                    }else{
                        System.out.println("Game over!Sua pontuação foi de"+pontos);

                    }
                }else{
                    System.out.println("Game over!Sua pontuação foi de"+pontos);

                }

            }else {
                System.out.println("Game over!Sua pontuação foi de"+pontos);

            }
        }else{
            System.out.println("Acabou o jogo...Você pontuou 0");
        }

    }
}