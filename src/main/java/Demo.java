import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.HorseService;
import service.RaceService;

public class Demo {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        HorseService horse = (HorseService) context.getBean("horse");
        RaceService race=context.getBean("race", RaceService.class);
        System.out.println(race);
    }
}
