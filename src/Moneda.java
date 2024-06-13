import com.google.gson.annotations.SerializedName;

public record Moneda(
        @SerializedName("USD") float usd,
        @SerializedName("CLP") double clp,
        @SerializedName("COP") double cop,
        @SerializedName("BRL") double brl,
        @SerializedName("BOB") double bob

) {
}
