import java.time.LocalDate;

import br.com.requiemdev.bootcamp.dominio.Bootcamp;
import br.com.requiemdev.bootcamp.dominio.Course;
import br.com.requiemdev.bootcamp.dominio.Developer;
import br.com.requiemdev.bootcamp.dominio.Mentoring;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setTitle("Java course");
        course1.setDescription("Java course description");
        course1.setWorkload(8);

        Course course2 = new Course();
        course2.setTitle("JS course");
        course2.setDescription("JS course description");
        course2.setWorkload(4);

        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("Java mentoring");
        mentoring.setDescription("Java mentoring description");
        mentoring.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Java Developer Bootcamp");
        bootcamp.setDescription("Java Developer Bootcamp description");
        bootcamp.getContent().add(course1);
        bootcamp.getContent().add(course2);
        bootcamp.getContent().add(mentoring);

        Developer devLinderman = new Developer();
        devLinderman.setName("Linderman");
        devLinderman.bootcampSubscribe(bootcamp);
        System.out.println("Linderman's subscribed content:" + devLinderman.getSubscribedContent());
        devLinderman.advance();
        devLinderman.advance();
        System.out.println("-");
        System.out.println("Linderman's subscribed content:" + devLinderman.getSubscribedContent());
        System.out.println("Linderman's finished content:" + devLinderman.getFinishedContent());
        System.out.println("XP:" + devLinderman.calculateTotalXp());

        System.out.println("-------");

        Developer devJoao = new Developer();
        devJoao.setName("Joao");
        devJoao.bootcampSubscribe(bootcamp);
        System.out.println("joao's subscribed content:" + devJoao.getSubscribedContent());
        devJoao.advance();
        devJoao.advance();
        devJoao.advance();
        System.out.println("-");
        System.out.println("joao's subscribed content:" + devJoao.getSubscribedContent());
        System.out.println("joao's finished content:" + devJoao.getFinishedContent());
        System.out.println("XP:" + devJoao.calculateTotalXp());

    }

}
