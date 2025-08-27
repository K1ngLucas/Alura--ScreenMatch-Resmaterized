package functions;

import models.Movies;
import models.Series;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import static functions.ExportFunction.jsonExport;
import static functions.MatchFunction.match;

public class MyListFunctions {
    static ArrayList<Series> seriesArrayList = new ArrayList<>();
    static ArrayList<Movies> moviesArrayList = new ArrayList<>();

    public static void myList() throws IOException {
        Scanner scanner = new Scanner(System.in);

        seriesArrayList.sort(Comparator.comparing(Series::getName));
        moviesArrayList.sort(Comparator.comparing(Movies::getName));

        int serieNum = 1;
        int movieNum = 1;

        if (!seriesArrayList.isEmpty()){
            System.out.println("======= SERIES ======");
            for (Series item : seriesArrayList) {
                System.out.println(serieNum);
                System.out.println(item);
                serieNum++;
            }
        }

        if(!moviesArrayList.isEmpty()){
            System.out.println("====== FILMES ======");
            for (Movies item : moviesArrayList) {
                System.out.println(movieNum + ":");
                System.out.println(item);
                movieNum++;
            }
        }

        if (seriesArrayList.isEmpty() && moviesArrayList.isEmpty()){
            System.out.println("Adicione Filmes/Series a sua Lista!");
        }

        String myListMenu = """
                ====== MINHA LISTA ======
                1. Adiconar Filme/Serie
                2. Exportar para Json
                3. Menu Principal
                """;

        System.out.println(myListMenu);
        int num = scanner.nextInt();

        while (num != 3) {
            switch (num) {
                case 1: {
                    match();
                    num = 3;
                    break;
                }
                case 2: {
                    jsonExport(seriesArrayList, moviesArrayList);
                    num = 3;
                    break;
                }
                default: {
                    System.out.println(myListMenu);
                    num = scanner.nextInt();
                }
            }
        }
    }

    public static void addSerieList(Series newSerie) {
                seriesArrayList.add(newSerie);
    }

    public static void addMovieList(Movies newMovie) {
                moviesArrayList.add(newMovie);
    }
}
