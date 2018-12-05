import com.Factory.PeopleFactory;
import com.Factory.StaticPeopleFactory;
import com.aop.AopDemo01;
import com.pojo.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

//        People pp = new People();
        ApplicationContext  applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
// --------------------------------------------------AOP---------------------------------------------
        AopDemo01  aopDemo01 = applicationContext.getBean("aopdemo", AopDemo01.class);
        AopDemo01  aopDemo02 = new AopDemo01();
        aopDemo02.Method1();

        aopDemo01.Method1();
        aopDemo01.Method3();

// ------------------------------------------------- IOC -----------------------------------------------------------
        // 构造器构造
//        People people= applicationContext.getBean("peo", People.class);
//        System.out.println(people);
//        for(String string :applicationContext.getBeanDefinitionNames())
//        {
//            System.out.println(string);
//        }
        // 实例工厂
//        PeopleFactory peopleFactory = new PeopleFactory();
//        peopleFactory.newInstance(1);
        //静态工厂
//        StaticPeopleFactory.newInstance(1);

        // 配置applicationContext.xml Spring 实例工厂创建对象
//        applicationContext.getBean("peopleFactory");

        // 配置applicationContext.xml Spring 静态工厂创建对象
//        applicationContext.getBean("staticPeopleFactory");
    }
}
