package pl.pjatk.paw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
public class MyThirdClass {
   public MyThirdClass(ApplicationContext applicationContext) {
       MyFirstClass myFirstClass = applicationContext.getBean("myFirstClass",MyFirstClass.class);
       MySecondClass mySecondClass = applicationContext.getBean("myFirstClass",MySecondClass.class);

       myFirstClass.printCompMethName();
   }
}
