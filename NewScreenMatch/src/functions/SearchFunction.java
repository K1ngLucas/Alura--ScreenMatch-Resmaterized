package functions;

import models.Title;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class SearchFunction {
    public static Title search(String titleName) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String address = "https://www.omdbapi.com/?t=" + titleName.replace(" ", "+") + "&apikey=5920735";

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(address)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            //System.out.println(json);

            Title newTitle = gson.fromJson(json, Title.class);

            if (newTitle.Response()) {
                return newTitle;
            } else {
                return null;
            }

        } catch (Exception e) {
            System.out.println("Error");
            return null;
        }
    }
}
