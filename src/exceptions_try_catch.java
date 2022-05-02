public class exceptions_try_catch {
    public static void main(String[] args) throws Throwable {
        int a = 10;
        int b = 20;
        int c = -5;
        System.out.println("Area is " + area(a, c));

    }

    public static int area(int width, int height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Отрицательные числа, ширина =" + width + " высота = " + height);
        }
        return width * height;
    }

}
