package functions;
import java.io.IOException;
import java.util.Scanner;

import static functions.MatchFunction.match;
import static functions.MyListFunctions.myList;

public class MenuFunction {
    public static void screenMatchMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String mainMenu = """
            ===== MENU PRINCIPAL =====
            1 - Buscar Filme/Série
            2 - Minha Lista
            3 - Sair
            Escolha uma opção:
            """;

        System.out.println("******** Bem-vindo ao ScreenMatch! ********");
        System.out.println(mainMenu);
        int num = scanner.nextInt();

        while (num != 3) {
            switch (num){
                case 1: {
                    match();
                    System.out.println(mainMenu);
                    num = scanner.nextInt();
                    break;
                }
                case 2: {
                    myList();
                    System.out.println(mainMenu);
                    num = scanner.nextInt();
                    break;
                }
                default: {
                    System.out.println("Opção Ivalida!");
                    System.out.println(mainMenu);
                    num = scanner.nextInt();
                    break;
                }
            }
        }

        System.out.println("Obrigado por ultilizar o ScreenMacth!");
        System.out.println("*******************************************");

    }
}
