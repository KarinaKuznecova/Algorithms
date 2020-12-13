package string;

public class WithString {

    public String backwards(String line) {
        String secondLine = "";
        for (int i = line.length() - 1; i >= 0; i--) {
            secondLine = secondLine.concat(Character.toString(line.charAt(i)));
        }
        return secondLine;
    }

    public int countSpaces(String line){
        int spaces = 0;
        for (int i = 0; i < line.length(); i++) {
            char c=line.charAt(i);
            if (c == ' ') {
                spaces++;
            }
        }
        return spaces;
    }
}
