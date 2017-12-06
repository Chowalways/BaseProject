package com.github.Chowalways;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class testsTest {
    @Test
    public void getType() throws Exception {
        // Arrange
        tests triangle = new tests (5, 10, 5);

        // Act
        String result = triangle.getType();

        // Assert
        Assert.assertEquals("Not a triangle", result);
    }

}
