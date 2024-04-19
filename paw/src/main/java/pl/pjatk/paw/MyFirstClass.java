package pl.pjatk.paw;
import org.springframework.stereotype.Component;


@Component
public class MyFirstClass {


    public void printHelloMessage(){
        System.out.println("Halo boss");
    }
    public void printCompMethName(){
        System.out.println("Dupaaa");
    }

    public MyFirstClass() {
        System.out.println("MyFirstClass");
    }

}


