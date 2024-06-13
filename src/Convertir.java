import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

public class Convertir {

    // dolar a argentino
    //dolar a brasileno
    //dolar a colombiano
    BuscarMoneda buscarMoneda = new BuscarMoneda();
    String usd;

    public double dollarBrasil(){

        try {
            usd = buscarMoneda.buscar("USD");
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Monedas monedas = gson.fromJson(usd, Monedas.class);
        double op = monedas.conversionRates().usd() * monedas.conversionRates().brl();
        return op;
    }

    public double brasilDollar(){

        try {
            usd = buscarMoneda.buscar("BRL");
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Monedas monedas = gson.fromJson(usd, Monedas.class);
        double op = monedas.conversionRates().brl() * monedas.conversionRates().usd();
        return op;
    }

    public double dollarColmbia(){

        try {
            usd = buscarMoneda.buscar("USD");
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Monedas monedas = gson.fromJson(usd, Monedas.class);
        double op = monedas.conversionRates().usd() * monedas.conversionRates().cop();
        return op;
    }

    public double colombiaDollar(){

        try {
            usd = buscarMoneda.buscar("COP");
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Monedas monedas = gson.fromJson(usd, Monedas.class);
        double op = monedas.conversionRates().cop() * monedas.conversionRates().usd();
        return op;
    }

    public double dollarChile(){

        try {
            usd = buscarMoneda.buscar("USD");
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Monedas monedas = gson.fromJson(usd, Monedas.class);
        double op = monedas.conversionRates().usd() * monedas.conversionRates().clp();
        return op;
    }

    public double chileDollar(){

        try {
            usd = buscarMoneda.buscar("CLP");
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Monedas monedas = gson.fromJson(usd, Monedas.class);
        double op = monedas.conversionRates().clp() * monedas.conversionRates().usd();
        return op;
    }


}
