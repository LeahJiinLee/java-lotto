package calculator.model;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    private String userInput;
    private String delimiter;

    public Parser(String userInput) {
        this.userInput =checkInputNullOrZero(userInput);
        this.delimiter = findDelimiter();
    }
    private String checkInputNullOrZero(String userInput){
        if (userInput==null ||userInput.equals("")){
            return "0";
        }
        return userInput;
    }

    private String findDelimiter() {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(userInput);
        if (m.find()) {
            this.userInput = m.group(2);
            return m.group(1);
        }
        return ",|:";
    }
    public List<Token> parseInput() {
        String[] parseResult = userInput.split(delimiter);
        Token token = new Token(parseResult);

        return token.getTokens();
    }

    public String getUserInput() {
        return userInput;
    }

    public String getDelimiter() {
        return delimiter;
    }
}
