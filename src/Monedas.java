import com.google.gson.annotations.SerializedName;

import java.util.List;

public record Monedas(
       @SerializedName("conversion_rates") Moneda conversionRates
) {
}
