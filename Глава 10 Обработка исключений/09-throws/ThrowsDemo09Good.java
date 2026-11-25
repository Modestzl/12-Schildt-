// Адаптация: имя ThrowsDemo заменено на ThrowsDemo09Good из-за двух версий в каталоге 09.
// Теперь программа компилируется.
class ThrowsDemo09Good {
    static void throwOne() throws IllegalAccessException {
        System.out.println("Внутри throwOne().");
        throw new IllegalAccessException("демонстрация");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Перехвачено " + e);
        }
    }
}
