
import com.aop.aspectJ.AspectJDemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectJTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext02.xml");
        AspectJDemo aspectJdemo = applicationContext.getBean("aspectJdemo", AspectJDemo.class);
        try {
            aspectJdemo.Method1();
        } catch (Exception e) {
//            e.printStackTrace();
        }
    }
}
