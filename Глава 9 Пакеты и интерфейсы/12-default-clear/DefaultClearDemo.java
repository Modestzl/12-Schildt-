// ДОПОЛНЕНИЕ для запуска интерфейса со страницы 269 (PDF 270).
// FixedStack повторяет реализацию со страниц 260-261 без изменений алгоритма.
class DefaultClearDemo {
    public static void main(String[] args) {
        IntStack stack = new FixedStack(2);
        stack.push(10);
        stack.clear();
        // Стандартный clear() только печатает сообщение: элемент ещё в стеке.
        System.out.println(stack.pop());
    }
}
