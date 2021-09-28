public class FizzAndBuzz {
    public static String caculatorFizzBuzz(int number){
        String result = "";
        int max = 100;
        int min = 0;
        if (number < max && number >= min){
            boolean fizz = number%3 == 0 || findNumber(number) == 3;
            boolean buzz = number%5 == 0 || findNumber(number) == 5;
            boolean fizzbuzz = (number%3 == 0 && number%5 == 0) || number == 35 || number == 53;
            if (fizzbuzz){
                result = "fizzbuzz";
            }
            else if (buzz){
                result = "buzz";
            }
            else if (fizz){
                result = "fizz";
            }
            else {
                if (number < 10){
                    result = readNumberTo9(number);
                }
                else {
                    result = readNumberTo99(number);
                }
            }
        }
        else {
            result = "số không hợp lệ";
        }
        return result;
    }
    public static int findNumber(int number){
        int fizz = 3;
        int buzz = 5;
        int divisible = number%10;
        int divisble2 = (number - divisible)/10;
        if (divisible == fizz || divisble2 == fizz){
            return fizz;
        }
        else if (divisible == buzz || divisble2 == buzz){
            return buzz;
        }
        else{
            return 0;
        }

    }
    public static String readNumberTo9(int number){
        switch (number){
            case 0: return "khong";
            case 1: return "mot";
            case 2: return "hai";
            case 3: return "ba";
            case 4: return "bon";
            case 5: return "nam";
            case 6: return "sau";
            case 7: return "bay";
            case 8: return "tam";
            case 9: return "chin";
            default: return "not number";
        }
    }
    public static String readNumberTo99(int number){
        int divisible = number%10;
        int divisble2 = (number - divisible)/10;
        if (divisble2 == 1){
            return "Muoi "+readNumberTo9(divisible);
        }
        else {
            return readNumberTo9(divisble2) + " "+readNumberTo9(divisible);
        }
    }
}