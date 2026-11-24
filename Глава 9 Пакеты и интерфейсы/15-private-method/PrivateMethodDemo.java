// ДОПОЛНЕНИЕ для запуска интерфейса со страницы 272 (PDF 273).
// DynStack повторяет реализацию со страниц 261-262.
import java.util.Arrays;

class PrivateMethodDemo {
    public static void main(String[] args) {
        IntStack stack = new DynStack(2);
        for (int i = 1; i <= 8; i++) stack.push(i);

        System.out.println(Arrays.toString(stack.popNElements(3)));
        System.out.println(Arrays.toString(stack.skipAndPopNElements(2, 2)));
        System.out.println(stack.pop());
    }
}
