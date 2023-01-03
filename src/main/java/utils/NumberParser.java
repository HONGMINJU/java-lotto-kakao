package utils;

import java.util.List;
import java.util.stream.Collectors;

public class NumberParser {
    public static List<Integer> splitAndParse(String input) {
        List<String> result = List.of(input.split(", "));
        return result
                .stream()
                .map(NumberParser::parse)
                .collect(Collectors.toList());
    }

    public static Integer parse(String input) {
        int number = 0;
        try {
            number = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("로또 숫자는 숫자만 가능합니다. 숫자만 입력해주세요.");
        }
        return number;
    }
}