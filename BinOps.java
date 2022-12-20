public class BinOps {
    public String sum(String a, String b) {
        Integer a1 = Integer.parseInt(a, 2);
        Integer b1 = Integer.parseInt(b, 2);
        Integer sum = a1 + b1;
        return Integer.toBinaryString(sum);
    }

    public String mult(String a, String b) {
        Integer a1 = Integer.parseInt(a, 2);
        Integer b1 = Integer.parseInt(b, 2);
        Integer mult = a1 * b1;
        return Integer.toBinaryString(mult);
    }

}
