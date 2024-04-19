package pl.pjatk.paw;
import org.springframework.stereotype.Component;


@Component
public class MySecondClass {



    public MySecondClass(MyFirstClass myFirstClass) {
        System.out.println("MySecondClass");
        myFirstClass.printHelloMessage();
    }
}
