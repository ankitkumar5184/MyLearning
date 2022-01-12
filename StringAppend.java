public class StringAppend {
    public static void main(String[] args)
    {
        StringBuilder sbf1 = new StringBuilder("Do one thing daily");
        System.out.println("String Builder 1 = " + sbf1);

        StringBuilder sbf2 = new StringBuilder(" kumar");
        System.out.println("String Builder 2 = " + sbf2);

        // Here it appends String Builder2 to String Builder1
        sbf1.append(sbf2);

        System.out.println("After appending the result is = "+ sbf1);
    }
}