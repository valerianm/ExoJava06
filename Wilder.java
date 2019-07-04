public class Wilder {
    private String name;
    private boolean aware;
    public Wilder(String name, boolean aware) {
        this.name = name;
        this.aware = aware;
    }
    public String getName() {
        return this.name;
    }
    public boolean getAware() {
        return this.aware;
    }

    public void setName (String name) {
        this.name = name;
    }
    public void setAware (boolean aware) {
        this.aware = aware;
    }
    public String whoAmI() {
        if (this.getAware()) {
            return "Je m'appelle "+ this.getName() +" et je suis aware";
        }
        else {
            return "Je m'appelle "+ this.getName() +" et je ne suis pas aware";
        }
    }
}