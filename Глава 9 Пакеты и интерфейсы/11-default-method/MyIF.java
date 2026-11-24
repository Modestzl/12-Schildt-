// Страница 267 книги (PDF 268). Обычный и стандартный методы.
public interface MyIF {
    int getNumber();

    default String getString() {
        return "Стандартная строка";
    }
}
