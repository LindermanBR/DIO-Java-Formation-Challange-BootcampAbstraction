package br.com.requiemdev.bootcamp.dominio;

public abstract class Content {

    protected static final double DEFAULT_XP = 10d;

    private String title;
    private String description;

    public abstract double calculateXp();

    public String getTitle() {
        return title;
    }

    public void setTitle(String titulo) {
        this.title = titulo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String descricao) {
        this.description = descricao;
    }
}
