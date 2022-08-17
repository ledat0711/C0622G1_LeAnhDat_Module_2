import java.util.LinkedList;
import java.util.Scanner;

public class LongestConsecutiveString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        System.out.print("Nhập chuỗi: ");
        String string = input.nextLine();
        for (int i = 0; i < string.length(); i++) {
            if (list.size() > 1 && list.contains(string.charAt(i))) {    //Đáp ứng điều kiện tăng dần.
                list.clear();
            }
            list.add(string.charAt(i));
            if (list.size() > max.size()) { // Đáp ứng điều kiện dài nhất
                max.clear();
                max.addAll(list);
            }
        }
        for (Character ch : max) {
            System.out.print(ch);
        }
        System.out.println();
    }
}

