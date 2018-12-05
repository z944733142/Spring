import com.aop.AopDemo01;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ThrowsTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AopDemo01 demo = applicationContext.getBean("demo", AopDemo01.class);
        try {
            demo.ExceptionTest();
        } catch (Exception e) {
//            e.printStackTrace();
        }
    }
}
