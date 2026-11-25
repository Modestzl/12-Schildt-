// Адаптация: имя ThrowsDemo заменено на ThrowsDemo09Bad из-за двух версий в каталоге 09.
// Эта программа содержит ошибку и компилироваться не будет.
class ThrowsDemo09Bad {
    static void throwOne() {
        System.out.println("Внутри throwOne().");
        throw new IllegalAccessException("демонстрация");
    }

    public static void main(String[] args) {
        throwOne();
    }
}
