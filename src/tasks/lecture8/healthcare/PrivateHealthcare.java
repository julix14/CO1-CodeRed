package tasks.lecture8.healthcare;

public class PrivateHealthcare implements Healthcare {
    private String providerName;

    @Override
    public String getType() {
        return "Private";
    }
}
