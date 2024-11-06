package com.ChallengeConversorMonedaAlura.modelos;

import com.ChallengeConversorMonedaAlura.modelo.MonedaAPI;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversion {
    public MonedaAPI consultaMoneda (String tipoMonedaInicial, String tipoMonedaFinal) throws IOException, InterruptedException {
        String direccion = "https://v6.exchangerate-api.com/v6/b07b4200c7a3f4d95de5e14b/pair/" + tipoMonedaInicial + "/" + tipoMonedaFinal;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        return new Gson().fromJson(json, MonedaAPI.class);
    }
}
