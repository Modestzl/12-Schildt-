// Страница 261 книги (PDF 262). Два стека фиксированного размера.
class IFTest {
    public static void main(String[] args) {
        FixedStack08 mystack1 = new FixedStack08(5);
        FixedStack08 mystack2 = new FixedStack08(8);

        // Поместить несколько чисел в стеки.
        for (int i = 0; i < 5; i++) mystack1.push(i);
        for (int i = 0; i < 8; i++) mystack2.push(i);

        // Извлечь эти числа из стеков.
        System.out.println("Стек в mystack1:");
        for (int i = 0; i < 5; i++)
            System.out.println(mystack1.pop());

        System.out.println("Стек в mystack2:");
        for (int i = 0; i < 8; i++)
            System.out.println(mystack2.pop());
    }
}
