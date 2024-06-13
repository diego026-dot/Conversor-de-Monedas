import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class BuscarMoneda {

    public String buscar (String m) throws IOException, InterruptedException {
        String direccion = "https://v6.exchangerate-api.com/v6/41ea69382b48d9eea6f5c7fc/latest/"+ m;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());


        return response.body();



    }

}
