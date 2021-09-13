package no.kristiania;

public class romanConverter {


    public static String toRoman(int i){
        String output = "";
        if(i == 1) {
            output += "I";
        }
        else if(i == 2){
            output += "II";
        }
        return output;
    }
}
