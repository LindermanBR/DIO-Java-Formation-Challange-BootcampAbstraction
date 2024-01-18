package br.com.requiemdev.bootcamp.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String name;
    private String description;
    private final LocalDate startDate = LocalDate.now();
    private final LocalDate finishDate = startDate.plusDays(45);
    private Set<Developer> subscribedDevelopers = new HashSet<>();
    private Set<Content> content = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getFinishDate() {
        return finishDate;
    }

    public Set<Developer> getSubscribedDevelopers() {
        return subscribedDevelopers;
    }

    public void setSubscribedDevelopers(Set<Developer> devsInscritos) {
        this.subscribedDevelopers = devsInscritos;
    }

    public Set<Content> getContent() {
        return content;
    }

    public void setContent(Set<Content> content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description)
                && Objects.equals(startDate, bootcamp.startDate) && Objects.equals(finishDate, bootcamp.finishDate)
                && Objects.equals(subscribedDevelopers, bootcamp.subscribedDevelopers)
                && Objects.equals(content, bootcamp.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, startDate, finishDate, subscribedDevelopers, content);
    }
}
