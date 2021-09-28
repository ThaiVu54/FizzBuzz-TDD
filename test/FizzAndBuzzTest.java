import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FizzAndBuzzTest {

    @Test
    void testCaculatorFizzBuzz() {
        int number = 15;
        String expected = "fizzbuzz";
        String result = FizzAndBuzz.caculatorFizzBuzz(number);
        assertEquals(expected, result);
    }
    @Test
    void testCaculatorFizz() {
        int number = 13;
        String expected = "fizz";
        String result = FizzAndBuzz.caculatorFizzBuzz(number);
        assertEquals(expected, result);
    }
    @Test
    void testCaculatorFizz1() {
        int number = 3;
        String expected = "fizz";
        String result = FizzAndBuzz.caculatorFizzBuzz(number);
        assertEquals(expected, result);
    }
    @Test
    void testCaculatorBuzz() {
        int number = 5;
        String expected = "buzz";
        String result = FizzAndBuzz.caculatorFizzBuzz(number);
        assertEquals(expected, result);
    }
    @Test
    void testCaculatorBuzz1() {
        int number = 51;
        String expected = "buzz";
        String result = FizzAndBuzz.caculatorFizzBuzz(number);
        assertEquals(expected, result);
    }
    @Test
    void testCaculatorNotFizzBuzz() {
        int number = 41;
        String expected = "bon mot";
        String result = FizzAndBuzz.caculatorFizzBuzz(number);
        assertEquals(expected, result);
    }
    @Test
    void testCaculatorNotFizzBuzz1() {
        int number = 11;
        String expected = "Muoi mot";
        String result = FizzAndBuzz.caculatorFizzBuzz(number);
        assertEquals(expected, result);
    }
    @Test
    void testCaculatorNotFizzBuzz2() {
        int number = 28;
        String expected = "hai tam";
        String result = FizzAndBuzz.caculatorFizzBuzz(number);
        assertEquals(expected, result);
    }
}