// Повторное использование реализации из 08-stack для отдельного примера.
// Страницы 260-261 книги (PDF 261-262). Стек фиксированного размера.
// Реализация IntStack12, использующая хранилище фиксированной длины.
class FixedStack12 implements IntStack12 {
    private int[] stck;
    private int tos;

    // Разместить в памяти и инициализировать стек.
    FixedStack12(int size) {
        stck = new int[size];
        tos = -1;
    }

    // Поместить элемент в стек.
    public void push(int item) {
        if (tos == stck.length - 1) // использовать член length
            System.out.println("Стек полон.");
        else
            stck[++tos] = item;
    }

    // Извлечь элемент из стека.
    public int pop() {
        if (tos < 0) {
            System.out.println("Стек опустошен.");
            return 0;
        } else
            return stck[tos--];
    }
}
