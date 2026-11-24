// Страницы 262-263 книги (PDF 263-264). Две реализации через один IntStack.
class IFTest3 {
    public static void main(String[] args) {
        IntStack mystack;
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);

        mystack = ds;
        for (int i = 0; i < 12; i++) mystack.push(i);

        mystack = fs;
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
