package io.codedifferently;

import org.junit.Test;

import org.junit.Assert;

public class fruitTest {
    
    @Test

    public void constructerTest()
    {
        // Given
        String type = "tomato";
        int energy = 20;

        // When
        fruit testFruit = new fruit(type, energy);
        String actualType = testFruit.getType();
        int actualEnergy = testFruit.getEnergy();

        // Then
        Assert.assertEquals(type, actualType);
        Assert.assertEquals(energy, actualEnergy);       
    }
}