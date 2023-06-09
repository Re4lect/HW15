import java.util.Scanner;

public class Main {
    public static final String CHARS_FOR_UNICODE_TEST = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя" +
            "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ -";

    public static void main(String[] args) {
        printFIO(testFullName(getFullName()));
    }

    private static String getFullName() {
        System.out.println("Введите ФИО через пробелы: ");
        return new Scanner(System.in).nextLine();
    }

    private static String testFullName(String text) {
        int spaceCounter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (!CHARS_FOR_UNICODE_TEST.contains(String.valueOf(text.charAt(i)))) {
                System.out.println("Введен неподдерживаемый символ!");
                System.exit(1);
            }
            if (String.valueOf(text.charAt(i)).contains(" ")) {
                spaceCounter++;
            }

        }
        if (spaceCounter != 2){
            System.out.println("Введено некорректное количество слов!");
            System.exit(2);
        }return text;
    }
    private static void printFIO(String fIO){
        System.out.println("Фамилия: "+fIO.substring(0,fIO.indexOf(" ")));
        System.out.println("Имя: "+fIO.substring(fIO.indexOf(" ")+1,fIO.lastIndexOf(" ")));
        System.out.println("Отчество: "+fIO.substring(fIO.lastIndexOf(" ")+1));

    }

}