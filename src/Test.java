public class Test {
    public static void main(String[] args) throws Exception {
        String str = Bulk.duplicate("12", 5) + "2";
        System.out.println(str);
        System.out.println(Bulk.remove(str, '2'));
        System.out.println(Bulk.remove(str, "22"));
    }
}
