// Страницы 259-260 книги (PDF 260-261).
// Пример вложенного интерфейса.
// Класс A07 содержит член-интерфейс.
class A07 {
    // Вложенный интерфейс.
    public interface NestedIF {
        boolean isNotNegative(int x);
    }
}

// Класс B07 реализует вложенный интерфейс.
class B07 implements A07.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}

class NestedIFDemo {
    public static void main(String[] args) {
        // Использовать ссылку на вложенный интерфейс.
        A07.NestedIF nif = new B07();

        if (nif.isNotNegative(10))
            System.out.println("10 не является отрицательным");
        if (nif.isNotNegative(-12))
            System.out.println("Это выводиться не будет");
    }
}
