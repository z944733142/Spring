import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.aop.AopDemo01;

public class ArroundTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext02.xml");
        AopDemo01 demo = applicationContext.getBean("aspectJdemo" , AopDemo01.class  );
        demo.Method1();
    }
}
