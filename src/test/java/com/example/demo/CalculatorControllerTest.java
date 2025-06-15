package com.example.demo;
import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorControllerTest {
   private final CalculatorController controller = new CalculatorController();

   //Tests that the CalculatorController calculates correctly the sum for valid input.
   @Test
   void testValidSum(){
        Map<String, Object> response =  controller.add("6,-6,0,5");
        assertEquals(5,response.get("sum"));
        assertEquals("Sum calculated successfully.", response.get("message"));
   }

   //Tests that the CalculatorController calculates correctly the sum for valid input.
   @Test
   void testInvalidInput(){
        Map<String, Object> response =  controller.add("6,-6,bilel,5");
        assertNull(response.get("sum"));
        assertEquals("Not Valid Input . Please provide only numbers separated by commas, e.g./calculator/add?listofnumbers=1,5,4", response.get("error"));
   }

   //Tests that the CalculatorController calculates correctly the sum for valid input.
   @Test
   void testNoInput(){
        Map<String, Object> response =  controller.add(null);
        assertNull(response.get("sum"));
        assertEquals("No input provided. Please provide numbers separated by commas, e.g. /calculator/add?listofnumbers=1,5,4", response.get("error"));
   }

   //Tests that the CalculatorController calculates correctly the sum for valid input.
   @Test
   void testEmptyInput(){
        Map<String, Object> response =  controller.add("");
        assertNull(response.get("sum"));
        assertEquals("No input provided. Please provide numbers separated by commas, e.g. /calculator/add?listofnumbers=1,5,4", response.get("error"));
   }
}
