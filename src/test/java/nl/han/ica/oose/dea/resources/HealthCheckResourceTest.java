package nl.han.ica.oose.dea.resources;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HealthCheckResourceTest {

    private static final String EXPECTED = "Up & Running";

    @Test
    void isHealthy() {
        //Arrange
        var HealthCheckResource = new HealthCheckResource();
        //Act
        var result = HealthCheckResource.healthy();
        //Assert
        Assertions.assertEquals(result,EXPECTED);
    }
}