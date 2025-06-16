
package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// REST endpoint that sums a comma-separated list of numbers and returns the result in JSON format, handling all input safely.
@RestController
public class CalculatorController {
    
    @GetMapping("/calculator/add")
    public Map<String, Object> add(@RequestParam(value = "numberList", required = false) String numbers) {
        Map<String, Object> response = new HashMap<>();
        int sum = 0;
        
        // handle null or empty input.
        if (numbers == null || numbers.trim().isEmpty()) {
            response.put("error", "No input provided. Please provide numbers separated by commas, e.g. /calculator/add?numberList=1,5,4");
            return response;
        }

        try {
            // sums a comma-separated list of numbers.
            sum = Arrays.stream(numbers.split(","))
                    .map(String::trim)
                    .filter(s -> !s.isEmpty())
                    .mapToInt(Integer::parseInt)
                    .sum();
            response.put("sum", sum);
            response.put("message", "Sum calculated successfully.");
        } catch (NumberFormatException e) {
            // handle invalid input.
            response.put("error", "Not Valid Input . Please provide only numbers separated by commas, e.g./calculator/add?numberList=1,5,4");
        }
        return response;
    }
}
