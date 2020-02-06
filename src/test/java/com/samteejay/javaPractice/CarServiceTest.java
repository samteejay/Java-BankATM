package test.java.com.samteejay.javaBook;

import main.java.com.samteejay.javaBook.CarService;
import org.junit.Test;

public class CarServiceTest {
    @Test
    public void shouldDemonstrateLogging() {
        CarService carService = new CarService();
        carService.process( "BMW" );

    }
}

