package org.calculator;

import org.calculator.service.AdditionService;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdditionTest {

    AdditionService additionService = new AdditionService();

    @Test
    void executeAddition() {
        assertEquals(3, additionService.calculate(1,2));
    }

}