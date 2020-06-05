package io.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class humanTest {

    @Test
    public void constructorTest(){
        // Given
        String first = "Francisco";
        String last = "Burgos";
        int energy = 50;

        // When
        Human testHuman = new Human(first, last); 
        String actualFirst = testHuman.getFirstName();
        String actualLast = testHuman.getLastName();
        int actualEnergy = testHuman.getEnergy();

        // Then
        Assert.assertEquals(first, actualFirst);
        Assert.assertEquals(last, actualLast);
        Assert.assertEquals(energy, actualEnergy);
    } 

    @Test
    public void eatTest()
    {
        // Given
        fruit pineapple = new fruit("Pneapple", 10);
        int expectedEnergy = 60;
        Human testHuman = new Human ("James", "Smith");

        // When
        testHuman.eat(pineapple);
        int actualEnergy = testHuman.getEnergy();
    
        // Then
        Assert.assertEquals(expectedEnergy, actualEnergy);
    }

    @Test
    public void workTest(){
        // Given
        Human testHuman = new Human("Frank", "Taveras");
        int expectedEnergy = 30;

        // When
        testHuman.work(2);
        int actualEnergy = testHuman.getEnergy();

        // Then
        Assert.assertEquals(expectedEnergy, actualEnergy);
    }

    @Test
    public void energyMaxTest(){
        //Given
        Human testHuman = new Human("Michael", "Rosario");
        fruit testFruit1 = new fruit("Dragon Fruit", 20);
        fruit testFruit2 = new fruit("Orange", 20);
        fruit testFruit3 = new fruit("Apple", 20);
        Human.maxEnergy = 100;

        // When
        testHuman.eat(testFruit1);
        testHuman.eat(testFruit2);
        testHuman.eat(testFruit3);
        int actualEnergy = testHuman.getEnergy();

        // Then
        Assert.assertEquals(100, actualEnergy);
    }

    @Test
    public void workMin(){
        // Given
        Human testHuman = new Human("Ashley", "Martines");
        
        // When
        testHuman.work(6);
        int actualEnergy = testHuman.getEnergy(); 

        // Then
        Assert.assertEquals(50, actualEnergy);
    }

    @Test
    public void maxEnergyChangeTest(){
        Human Human1 = new Human("John", "Batista");
       
        fruit testFruit1 = new fruit("Dragon Fruit", 20);
        fruit testFruit2 = new fruit("Orange", 20);
        fruit testFruit3 = new fruit("Apple", 20);
        
        Human.maxEnergy = 150;

        Human1.eat(testFruit1);
        Human1.eat(testFruit2);
        Human1.eat(testFruit3);

        int actualEnergy = Human1.getEnergy();

        Assert.assertEquals(110, actualEnergy);
        
    }
}