// ДОПОЛНЕНИЕ для запуска интерфейса со страницы 269 (PDF 270).
// FixedStack12 повторяет реализацию со страниц 260-261 без изменений алгоритма.
class DefaultClearDemo {
    public static void main(String[] args) {
        IntStack12 stack = new FixedStack12(2);
        stack.push(10);
        stack.clear();
        // Стандартный clear() только печатает сообщение: элемент ещё в стеке.
        System.out.println(stack.pop());
    }
}
