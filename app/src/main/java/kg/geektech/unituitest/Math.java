package kg.geektech.unituitest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Math {

    public String add(String a, String b) {
        String aa = a.trim();
        String bb = b.trim();

        if (aa.isEmpty()) {
            aa = "0";
        }
        if (bb.isEmpty()) {
            bb = "0";
        }

        if (onlyNum(aa) && onlyNum(bb)) {
            return String.valueOf(Integer.parseInt(aa) + Integer.parseInt(bb));
        } else {
            return "Введите цифры";
        }
    }

    public String sub(String a, String b) {
        String aa = a.trim();
        String bb = b.trim();

        if (aa.isEmpty()) {
            aa = "0";
        }
        if (bb.isEmpty()) {
            bb = "0";
        }

        if (onlyNum(aa) && onlyNum(bb)) {
            return String.valueOf(Integer.parseInt(aa) - Integer.parseInt(bb));
        } else {
            return "Введите цифры";
        }
    }

    public String mult(String a, String b) {
        String aa = a.trim();
        String bb = b.trim();

        if (aa.isEmpty()) {
            aa = "0";
        }
        if (bb.isEmpty()) {
            bb = "0";
        }
        if (onlyNum(aa) && onlyNum(bb)) {
            return String.valueOf(Integer.parseInt(aa) * Integer.parseInt(bb));
        } else {
            return "Введите цифры";
        }
    }

    public String div(String a, String b) {
        String aa = a.trim();
        String bb = b.trim();

        if (aa.isEmpty()) {
            aa = "0";
        }
        if (bb.isEmpty() || bb.equals("0")) {
            return "Нельзя делить на ноль";
        }
        if (onlyNum(aa) && onlyNum(bb)) {
            return String.valueOf(Integer.parseInt(aa) / Integer.parseInt(bb));
        } else {
            return "Введите цифры";
        }
    }

    public String reverseWords(String str) {
        String[] array = str.split(" ");
        List<String> list = Arrays.asList(array);
        Collections.reverse(list);

        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s).append(" ");
        }
        return sb.toString().trim();
    }

    public boolean onlyNum(String str) {
        try{
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
