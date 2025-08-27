package models;

public class Series {
    private String name;
    private String release;
    private String runtime;
    private int seasons;

    public Series (Title title) {
        this.name = title.Title();
        this.release = title.Year();
        this.runtime = title.Runtime();
        this.seasons = Integer.parseInt(title.totalSeasons());
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Nome: " + name + "\nAno de lançamento: " + release + "\nDuração: " + runtime + "\nTemporadas: " + seasons;
    }
}

