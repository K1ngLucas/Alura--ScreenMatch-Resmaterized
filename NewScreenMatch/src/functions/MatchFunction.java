package functions;

import models.Movies;
import models.Series;
import models.Title;

import java.util.Scanner;

import static functions.MyListFunctions.addMovieList;
import static functions.MyListFunctions.addSerieList;
import static functions.SearchFunction.search;

public class MatchFunction {
    public static void match() {
        Scanner scanner = new Scanner(System.in);
        Scanner numScanner = new Scanner(System.in);
        String matchMenu = """
            ======== MENU ========
            1 - Buscar Filme/Série
            2 - Adiconar a Lista
            3 - Menu Principal
            Escolha uma opção:
            """;

        int num = 1;

        try{
            while (num == 1) {

                System.out.println("Digite o nome do filme/série:");
                String newSearch = scanner.nextLine();

                Title newTitle = search(newSearch);

                if (newTitle != null) {
                    System.out.println(newTitle);
                    System.out.println(matchMenu);
                    num = numScanner.nextInt();

                    switch (num) {
                        case 1: {
                            break;
                        }
                        case 2: {
                            if (newTitle.Type().equals("movie")) {
                                Movies newMovie = new Movies(newTitle);
                                addMovieList(newMovie);
                                System.out.println(newTitle.Title() + " Adicionado a Minha Lista!");
                            } else {
                                Series newSeries = new Series(newTitle);
                                addSerieList(newSeries);
                                System.out.println(newTitle.Title() + " Adicionado a Minha Lista!");
                            }
                            num = 3;
                        }
                        case 3: {
                            break;
                        }
                        default: {
                            System.out.println("Opção inválida!");
                            num = 3;
                        }
                    }

                } else {
                    System.out.println("Filme/Serie não encontrado!");
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
