package udemy.buchalka.begin;

public class ControlFlowStatesments {
    public static void printNumberInWord(int number){
        switch (number){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999){
            return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        }else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }
        else {
            switch(month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;
                case 4: case 6: case 9: case 11:
                    return 30;
                case 2:
                    return isLeapYear(year) ? 29 : 28;
                default:
                    return -1;
            }
        }
    }

    public static boolean isOdd(int num) {
        return num > 0 && num % 2 != 0;
    }
    public static int sumOdd (int min, int max) {
        if (min < 0 || max < 0 || min > max) {
            return -1;
        }
        int sum = 0;
        for ( int i = min; i <= max; i++){
            sum += isOdd(i) ? i : 0;
        }
        return sum;
    }

    public static boolean isPalindrome(int num) {
        if (num % 10 == 0) return false;
        int reverse = 0;
        int abs = Math.abs(num);
        while (true) {
            reverse *= 10;
            reverse += Math.abs(num % 10);
            num = num / 10;
            if (reverse >= abs) {
                break;
            }
        }
        return reverse == abs;
    }

    public static int sumFirstAndLastDigit(int num) {
        if (num < 0) return -1;
        int div = 10;
        int lDigit = num % div;
        int fDigit = num;
        while (true) {
            int prev = fDigit;
            fDigit = num / div;
            div *= 10;
            if (fDigit == 0 ) {
                fDigit = prev;
                break;
            }
        }
        return fDigit + lDigit;
    }

    public static int getEvenDigitSum (int num) {
        if (num < 0) return -1;
        int sum = 0;
        while (true) {
            int rem = num % 10;
            sum += (rem % 2 == 0) ? rem : 0;
            num = num / 10;
            if (num < 10) {
                sum += (num % 2 == 0) ? num : 0;
                break;
            }
        }
        return sum;
    }

    public static boolean hasSharedDigit (int a, int b) {
        if (a < 10 || b < 10 || a > 99 || b > 99) return false;
        int[] arr = new int[4];
        //boolean found = favoriteBands.contains(favoriteToFind);
        int remA = a % 10;
        int numA = a / 10;
        int remB = b % 10;
        int numB = b / 10;
        return (remB == remA || remB == numA || numB == remA || numB == numA);
    }

    public static boolean isValid (int a) {
        return a >= 10 && a <= 1000;
    }

    public static boolean hasSameLastDigit (int a, int b, int c) {
        if (!isValid(a) || !isValid(b) || !isValid(c)) return false;
        return a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10;
    }

    public static int getGreatestCommonDivisor (int a, int b) {
        // Euclid's division algorithm
        if (a < 10 || b < 10) return -1;
        while (a % b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return b;
    }
    public static void printFactors (int a) {
        if (a < 1) {
            System.out.println("Invalid Value");
        }
        int i = 1;
        String res = "";
        while ( i <= a) {
            if (a % i == 0) {
                res += " " + i;
            }
            i++;
        }
        System.out.println(res);
    }

    public static boolean isPerfectNumber(int num){
        if (num < 1) return false;
        int i = 1;
        int sum = 0;
        while ( i < num) {
            if (num % i == 0) {
                sum += i;
            }
            i++;
        }
        return sum == num;
    }

    public static void numberToWords(int number) {
        if (number < 0) System.out.println("Invalid Value");
        int digitCount = getDigitCount(number);
        number = reverse(number);
        for (int i = digitCount; i > 0; i--) {
            switch (number % 10) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Zero");
            }
            number /= 10;
        }
    }

    public static int reverse(int number) {
        int reverseNum = 0;
        while (number != 0) {
            reverseNum *= 10;
            reverseNum += (number % 10);
            number /= 10;
        }
        return reverseNum;
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        int digitCount = 0;
        while (number != 0) {
            digitCount++;
            number /= 10;
        }
        if (digitCount == 0) digitCount++;
        return digitCount;
    }

    public  static boolean canPack (int bigCount, int smallCount, int goal) {
        // 1 bigCount - 5 kilo
        // 1 smallCount - 1 kilo
        // goal - amount in kilos
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if(goal > ((bigCount * 5) + smallCount)) {
            return false;
        }

        if((goal % 5) > smallCount) {
            return false;
        }
        return true;
    }

    public static boolean isPrime(int number) {
        if (number < 3) {
            return true;
        }

        // check if n is a multiple of 2
        if (number % 2 == 0) {
            return false;
        }

        // if not, then just check the odds
        for (var i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int getLargestPrime(int number) {
        if (number >= 2) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    number /= i;
                    i--;
                }
            }
            return number;
        }
        return -1;
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            // a loop which prints a new line (a row)
            System.out.println();
            System.out.println();
            for (int i = 0; i < number; i++) {
                // a loop which prints * and a space
                for (int j = 0; j < number; j++) {

                    // i == 0 top
                    // (i == number - 1) bottom
                    // (j == number - 1) right
                    //  j == 0 left

                    if (i == 0 || (i == number - 1) || j == 0 || (j == number - 1) || (i == j) || ((j + 1) == number - (i + 1) + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        //System.out.println(canPack(1, 1, 8));
        //printFactors(6);
        System.out.println(getLargestPrime(217));
    }
}
