// АДАПТАЦИЯ обсуждения со страницы 270 книги (PDF 271).
// Полного листинга там нет. Здесь собран запускаемый пример с Alpha.super.reset().
interface Alpha {
    default void reset() {
        System.out.println("Alpha.reset()");
    }
}

interface Beta {
    default void reset() {
        System.out.println("Beta.reset()");
    }
}

class MyClass13 implements Alpha, Beta {
    // Без собственного reset() возникает конфликт двух стандартных методов.
    public void reset() {
        System.out.println("MyClass.reset()");
        Alpha.super.reset();
        Beta.super.reset();
    }
}

class DefaultConflictDemo {
    public static void main(String[] args) {
        new MyClass13().reset();
    }
}
