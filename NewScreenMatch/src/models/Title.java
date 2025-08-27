package models;

public record Title(String Title, String Year, String Runtime, String Type, String totalSeasons, boolean Response) {
    @Override
    public String toString() {
        if (Type().equalsIgnoreCase("Series")){
            return "===== INFORMAÇÕES =====\nNome: " + Title() + "\nAno de Lançamento: " + Year() + "\nDuração: " + Runtime() + "\nTemporadas: " + totalSeasons();
        } else {
            return "===== INFORMAÇÕES =====\nNome: " + Title() + "\nAno de Lançamento: " + Year() + "\nDuração: " + Runtime();
        }
    }
}

