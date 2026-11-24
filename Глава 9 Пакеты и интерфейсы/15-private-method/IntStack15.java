// Страница 272 книги (PDF 273). Общий код двух default-методов скрыт в private.
// Еще одна версия IntStack15, имеющая закрытый метод интерфейса,
// который используется двумя стандартными методами.
interface IntStack15 {
    void push(int item); // сохранить элемент
    int pop();          // извлечь элемент

    // Стандартный метод, возвращающий массив, который
    // содержит верхние n элементов в стеке.
    default int[] popNElements(int n) {
        // Возвратить запрошенные элементы.
        return getElements(n);
    }

    // Стандартный метод, возвращающий массив, который содержит
    // следующие n элементов в стеке после пропуска skip элементов.
    default int[] skipAndPopNElements(int skip, int n) {
        // Пропустить указанное количество элементов.
        getElements(skip);
        // Возвратить запрошенные элементы.
        return getElements(n);
    }

    // Закрытый метод, который возвращает массив, содержащий
    // верхние n элементов в стеке.
    private int[] getElements(int n) {
        int[] elements = new int[n];
        for (int i = 0; i < n; i++) elements[i] = pop();
        return elements;
    }
}
