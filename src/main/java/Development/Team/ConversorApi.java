package Development.Team;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.SQLOutput;

public class ConversorApi {
    public static String urlBase = "https://v6.exchangerate-api.com/v6/e043f71bfad43513fff81033/pair";

    public static double ConversorApis(Conversor conversor) throws IOException {
        String urlFinal = String.format("%s/%s/%s/%.2f", urlBase, conversor.getBaseCode(), conversor.getTargetCode(), conversor.getMount());

        URL url = new URL(urlFinal);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonObject jsonobj = root.getAsJsonObject();

        return Double.parseDouble(jsonobj.get("conversion_result").getAsString());

    }
}
