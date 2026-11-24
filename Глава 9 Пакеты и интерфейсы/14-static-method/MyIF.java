// Страница 271 книги (PDF 272). Версия интерфейса со статическим методом.
public interface MyIF {
    int getNumber();

    default String getString() {
        return "Стандартная строка";
    }

    static int getDefaultNumber() {
        return 0;
    }
}
