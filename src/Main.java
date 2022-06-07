import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Interaction_window();
    }

    public static String number_hello(String number_as_string){
        String result = "";
        try {
            int int_number = Integer.parseInt(number_as_string);
            if (int_number > 7) {
                result = "Привет";
                System.out.println(result);
            }
        }
        catch (NumberFormatException e){
            result = "Допускается только ввод целых чисел!";
            System.out.println(result);
        }
        return result;
    }

    public static String name_hello(String name){
        String expected_name = "Вячеслав";
        String result;
        if (Objects.equals(name, expected_name)) {
            result = "Привет, "+expected_name;
            System.out.println(result);
        }
        else {
            result = "Нет такого имени";
            System.out.println(result);
        }
        return result;
    }

    public static String find_dividable_by_three(String all_numbers_string){
        String head = "Числа кратные 3: ";
        ArrayList<Integer> all_numbers_array = string_to_int_array_by_comma(all_numbers_string);
        ArrayList<String> only_dividable_by_three = new ArrayList<>();
        System.out.println(head);
        for (int number : all_numbers_array) {
            if (number % 3 == 0) {
                System.out.println(number);
                only_dividable_by_three.add(String.valueOf(number));
            }
        }
        String joined_only_dividable_by_three = String.join(", ", only_dividable_by_three);
        return head+joined_only_dividable_by_three;
    }

    public static ArrayList<Integer> string_to_int_array_by_comma(String string){
        String[] separated_strings = string.trim().split("\\s*,\\s*");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String str_number : separated_strings){
            try {
                numbers.add(Integer.parseInt(str_number));
            }
            catch (NumberFormatException e){
                System.out.println(str_number+" - невозможно конвертировать в int!");
            }
        }
        return numbers;
    }

}
