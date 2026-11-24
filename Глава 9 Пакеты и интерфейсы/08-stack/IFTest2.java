// Страница 262 книги (PDF 263). Рост двух динамических стеков.
class IFTest2 {
    public static void main(String[] args) {
        DynStack08 mystack1 = new DynStack08(5);
        DynStack08 mystack2 = new DynStack08(8);

        // Эти циклы заставляют увеличиваться каждый стек.
        for (int i = 0; i < 12; i++) mystack1.push(i);
        for (int i = 0; i < 20; i++) mystack2.push(i);

        System.out.println("Стек в mystack1:");
        for (int i = 0; i < 12; i++)
            System.out.println(mystack1.pop());

        System.out.println("Стек в mystack2:");
        for (int i = 0; i < 20; i++)
            System.out.println(mystack2.pop());
    }
}
