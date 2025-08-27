package models;

public class Movies {
    private String name;
    private String release;
    private String runtime;
    public Movies (Title title) {
        this.name = title.Title();
        this.release = title.Year();
        this.runtime = title.Runtime();
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Nome: " + name + "\nAno de lançamento: " + release + "\nDuração: " + runtime;
    }
}

