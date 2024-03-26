public class CountNumberOfString {
    public static void main(String[] args) {
        int no = 123456789;
        int count =0;
        while(no>0)
        {
            no=no/10;
            count++;
        }
        System.out.println("Number Of Digit is :"+count);
        }
}
