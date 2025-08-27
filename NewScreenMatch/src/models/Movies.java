package models;

public class Movies {
    String name;
    String release;
    String runtime;
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
