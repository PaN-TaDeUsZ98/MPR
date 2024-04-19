package pl.pjatk.paw;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sandbox")
public class ControllerClass {

    @GetMapping("/halo")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/zmiana")
    public ResponseEntity<Car> getCarModel() {
        Car car = new Car("Skoda", "Octavia", 2004);
        return ResponseEntity.ok(car);
    }

    @GetMapping("/placeholder/dupa")
    @ResponseBody
    public String getHello(@RequestParam String variable) {
        return variable;
    }

    @PostMapping("/model")
    public ResponseEntity<Car> createCar(@RequestBody Car car) {
        return ResponseEntity.ok(car);
    }
}
