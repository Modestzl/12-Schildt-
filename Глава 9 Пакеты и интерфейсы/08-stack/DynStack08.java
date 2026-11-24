// Страницы 261-262 книги (PDF 262-263). Стек с удвоением массива.
// Реализовать "расширяемый" стек.
class DynStack08 implements IntStack08 {
    private int[] stck;
    private int tos;

    // Разместить в памяти и инициализировать стек.
    DynStack08(int size) {
        stck = new int[size];
        tos = -1;
    }

    // Поместить элемент в стек.
    public void push(int item) {
        // Если стек полон, тогда создать стек большего размера.
        if (tos == stck.length - 1) {
            int[] temp = new int[stck.length * 2]; // удвоить размер
            for (int i = 0; i < stck.length; i++) temp[i] = stck[i];
            stck = temp;
            stck[++tos] = item;
        } else
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
