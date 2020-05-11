package homework.week5;

public class MonsterAdministration {
    public static final Scanner scanner = new Scanner(System.in);
    public int maxNumberElements = Scanner.nextInt();
    public int[] numbersByUser = new int[maxNumberElements];
    public static final ELEMENT_NOT_FOUND =-1;
    //Masiv ot chisla izvejdane na broi ot polzvatel

    //Izvod na menu s opcii
    public static void main(String[] args){
        System.out.println("Vavedete kolko chisla ste vavejdate:\n" + scanner);
        System.out.println("Vavedete celi chisla za masiva:\n ");
        System.out.println("Kakvo iskate da napravite? Vavedete saotvetstvasht nomer:\n" +
                "1. Сортиране на въведените числа във възходящ ред \n" +
                "2. Сортиране на въведените числа в низходящ ред \n" +
                "3. Търсене на позиция на конкретно число \n" +
                "4. Разбъркване на числа \n" +
                "5. Изчисляване на сбора на всички числа \n" +
                "6. Намиране на най-голямото число \n" +
                "7. Намиране на най-малкото число \n" +
                "8. Намиране средно-аритметично на числата \n" +
                "9. Проверка за симетричност на масива от числа \n" +
                "10. Обръщане на масива от числа \n" +
                "11. Визуализирай въведените числа \n" +
                "12. Изход ");

        int userChoise = Scanner.nextInt();
        switch (userChoise){
            case 1:
                sortVazhodyashtRed();
                break;
            case 2:
                sortNizhodyashtRed();
                break;
            case 3:
                tarseneKonkretnoChislo();
                break;
            case 4:
                razbarkaniSluchainiChisla();
                break;
            case 5:
                sborNaChisla();
                break;
            case 6:
                naiGolyamoChislo();
                break;
            case 7:
                naiMalkoChislo();
                break;
            case 8:
                srednoAritmetichnoNaChislata();
                break;
            case 9:
                isMasivSymetric();
                break;
            case 10:
                obrshtaneNaMasiv();
            case 11:
                sborNaChisla();
            case 12:
                izhod();
                break;
            default:
                System.out.println("Invalid! Try again!");
                break;
        }

    }
    // Sortizane nizhodyasht red
    public static void sortNizhodyashtRed(int[] numbersByUser){
        int number;
        int length = numbersByUser.length;
        for(int i = 1; i<length; i++) {
            for (int n = length - 1; n >= i; n--) {
                if(numbersByUser[n-1]< numbersByUser[n]){
                    number = numbersByUser[n];
                    numbersByUser[n] = numbersByUser[n-1];
                    numbersByUser[n-1] = number;
                }
            }
        }
    }

    // Sortirane vazhodyasht red
    public static void sortVazhodyashtRed(int[] numbersByUser){
        int number;
        int length = numbersByUser.length;
        for(int i = 1; i<length; i++){
            for(int n = length-1; n>= i; n--){
                if(numbersByUser[n-1] > numbersByUser[n]){
                    number = numbersByUser[n-1];
                    numbersByUser[n-1] = numbersByUser[n];
                    numbersByUser[n] = number;
                }
            }
        }
    }

    // Tarsene na konkretno chislo
    public static int tarseneKonkretnoChislo(int[] numbersByUser, int tarsenNomer){
        int tarsenNomer = Scanner.nextInt();
        int tarsenElementenIndex = = binarySearch(elementToFind, 0, array.length - 1);

        if (foundElementIndex == ELEMENT_NOT_FOUND) {
            System.err.print("Елементът не е намерен!\n");
        } else {
            System.out.printf(
                    "Елементът е намерен на позиция: %d\n",
                    (foundElementIndex + 1));
        }
    }
    public static int binarySearch(int elementToFind, int leftIndex, int rightIndex) {
        int left = leftIndex;
        int right = rightIndex;
        int middle = (left + right) / 2;

        while (left <= right) {
            if (elementToFind == numbersByUser[middle]) {
                return middle;
            } else if (elementToFind < array[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }

            middle = (left + right) / 2;
        }

        return ELEMENT_NOT_FOUND;
    }
}

    // Razbarkvane na chisla
    public static int razbarkaniSluchainiChisla(int[] randomMasiv){
        Random randomNums = new Random();
        int [] randomMasiv = new int[10];
        for (int i=0; i<randomMasiv.length; i++){
            randomMasiv[i] = randomNums.nextInt();
            System.out.println(randomMasiv[i]);
        }
    }

    // Izkarvane sbor na vsichki chisla
    public static int sborNaChisla(int[] numbersByUser, int suma){
       int suma += i;
       System.out.println("Sborat na chislata ot masiva e:\n" + suma);
    }

    // Namirane na nai-golyamo chislo
    public static int naiGolyamoChislo(int[] numbersByUser, int bigestNumber){
        int length = numbersByUser.length;
        int bigestNumber = numbersByUser[0];
        for (int i=0; i<=length; i++){
            if (numbersByUser[i]> bigestNumber){
                bigestNumber = numbersByUser[i];
            }
        }
        System.out.println("Nai-golyamoto chislo e:\n" + bigestNumber);
    }

    // Namirane na nai-malko chislo
    public static int naiMalkoChislo(int[] numbersByUser, int smallestNumber){
        int length = numbersByUser.length;
        int smallestNumber = numbersByUser[0];
        for (int i=0; i<=length; i++){
            if (numbersByUser[i]<smallestNumber){
                smallestNumber = numbersByUser[i];
            }
        }
        System,out.println("Nai-malkoto chislo e:\n" + smallestNumber);
    }

    // Namirane na sredno aritmetichno
    public static double srednoAritmetichnoNaChislata(int[] numbersByUser, double srednoAritmetichno, int sum){
        int sum += i;
        double srednoAritmetichno = sum/2;
        System.out.println("Sredno aritmetichno na chislata v masiva e:\n" + srednoAritmetichno);
    }

    // Proveri dali M e simetrichen I izvedi saobshtenie + elem na masiva
    public static boolean isMasivSymetric(int[] numbersByUser, int element, int i){
        return isSymetric(numbersByUser, element, 0);
    }
    private static boolean isSymetric(int[]numbersByUser, int element, int i){
        if (i> element/2){
            return true;
            System.out.println("Masivat e simetrichen!\n");
        }
        if (numbersByUser[i] != numbersByUser[element-1-i]){
            return false;
            System.out.println("Masivat ne e simetrichen!\n" + i);
        }
        return isSymetric(numbersByUser, element, i+1);
    }

    // Obrashtane na masiv
    public static void obrshtaneNaMasiv(int[] numbersByUser){

    }

    // Izvejdane na chisla
    public static void printNumbersByUser(int[] numbersByUser){
        int length = numbersByUser.length;
        for(int i = 0; i<=length; i++) {
            System.out.println("Chislata, koite ste vaveli sa:\n" + i);
        }
    }

    // Izhod
    public static void izhod(){
        System.out.println("Exiting...\nHave a horribly nice day >:D!");
        break;
    }
}
