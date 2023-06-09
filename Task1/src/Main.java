public class Main {
    //todo Напишите код который распечатает букву и ее код для всех букв русского алфавита формат вывода:
    // А-123
    // Б-321...
    // Коды даны для примера и не соответствуют действительности. Учитывайте, что нужно распечатать коды букв в двух регистрах!
    public static final String CHARS_FOR_UNICODE_TEST = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя" +
            "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    public static void main(String[] args) {
        //todo код писать тут
        for (int i = 0; i < CHARS_FOR_UNICODE_TEST.length(); i++) {
            System.out.println(CHARS_FOR_UNICODE_TEST.charAt(i)+" == "+(int) CHARS_FOR_UNICODE_TEST.charAt(i));
        }
    }
}