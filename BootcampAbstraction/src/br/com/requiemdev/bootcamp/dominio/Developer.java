package br.com.requiemdev.bootcamp.dominio;

import java.util.*;

public class Developer {
    private String name;
    private Set<Content> subscribedContent = new LinkedHashSet<>();
    private Set<Content> finishedContent = new LinkedHashSet<>();

    public void bootcampSubscribe(Bootcamp bootcamp) {
        this.subscribedContent.addAll(bootcamp.getContent());
        bootcamp.getSubscribedDevelopers().add(this);
    }

    public void advance() {
        Optional<Content> content = this.subscribedContent.stream().findFirst();
        if (content.isPresent()) {
            this.finishedContent.add(content.get());
            this.subscribedContent.remove(content.get());
        } else {
            System.err.println("You are not enrolled in any content!");
        }
    }

    public double calculateTotalXp() {
        Iterator<Content> iterator = this.finishedContent.iterator();
        double sum = 0;
        while (iterator.hasNext()) {
            double next = iterator.next().calculateXp();
            sum += next;
        }
        return sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getSubscribedContent() {
        return subscribedContent;
    }

    public void setSubscribedContent(Set<Content> subscribedContents) {
        this.subscribedContent = subscribedContents;
    }

    public Set<Content> getFinishedContent() {
        return finishedContent;
    }

    public void setFinishedContent(Set<Content> finishedContents) {
        this.finishedContent = finishedContents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Developer dev = (Developer) o;
        return Objects.equals(name, dev.name) && Objects.equals(subscribedContent, dev.subscribedContent)
                && Objects.equals(finishedContent, dev.finishedContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscribedContent, finishedContent);
    }
}
