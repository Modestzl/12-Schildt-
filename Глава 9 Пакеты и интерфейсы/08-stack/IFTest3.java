// Страницы 262-263 книги (PDF 263-264). Две реализации через один IntStack08.
/* Создать переменную ссылки на интерфейс и организовать
   через нее доступ к стекам.
*/
class IFTest3 {
    public static void main(String[] args) {
        IntStack08 mystack; // создать переменную ссылки на интерфейс
        DynStack08 ds = new DynStack08(5);
        FixedStack08 fs = new FixedStack08(8);

        mystack = ds; // теперь работаем с динамическим стеком через mystack
        // Поместить несколько чисел в стеки.
        for (int i = 0; i < 12; i++) mystack.push(i);

        mystack = fs; // загрузить в стек с фиксированным размером
        for (int i = 0; i < 8; i++) mystack.push(i);

        mystack = ds;
        System.out.println("Значения в стеке с динамическим размером:");
        for (int i = 0; i < 12; i++)
            System.out.println(mystack.pop());

        mystack = fs;
        System.out.println("Значения в стеке с фиксированным размером:");
        for (int i = 0; i < 8; i++)
            System.out.println(mystack.pop());
    }
}
