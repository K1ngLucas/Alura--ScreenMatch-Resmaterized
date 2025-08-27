package functions;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.Movies;
import models.Series;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ExportFunction {
    public static void jsonExport(ArrayList<Series> seriesList, ArrayList<Movies> moviesList) throws IOException {
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();

        if (!seriesList.isEmpty() | !moviesList.isEmpty()) {
            Map<String, Object> exportLists = new HashMap<>();
            if (!seriesList.isEmpty()){
                exportLists.put("Series", seriesList);
            }
            if(!moviesList.isEmpty()){
                exportLists.put("Filmes", moviesList);
            }

            try (FileWriter newExportJson = new FileWriter("Minha Lista.json")) {
                newExportJson.write(gson.toJson(exportLists));
                newExportJson.close();
                System.out.println("Exportado para Json com Sucesso!!");
            }
        } else {
            System.out.println("Sua Lista esta vazia!");
            System.out.println("Adicione Filmes/Series e tente novamente!");
        }
    }
}
