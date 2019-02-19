import java.util.Objects;

public class LoyalityCard {

    private String code;

    private BarcodeFormat barcodeFormat;

    public LoyalityCard(String code, BarcodeFormat barcodeFormat) {
        this.code = code;
        this.barcodeFormat = barcodeFormat;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BarcodeFormat getBarcodeFormat() {
        return barcodeFormat;
    }

    public void setBarcodeFormat(BarcodeFormat barcodeFormat) {
        this.barcodeFormat = barcodeFormat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LoyalityCard)) return false;
        LoyalityCard that = (LoyalityCard) o;
        return Objects.equals(getCode(), that.getCode()) &&
                getBarcodeFormat() == that.getBarcodeFormat();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode(), getBarcodeFormat());
    }
}
