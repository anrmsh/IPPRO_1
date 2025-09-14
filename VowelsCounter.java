public class VowelsCounter {
    public void countVowels(String str){
        int count=0;
        String vowels = "AEIOUaeiou";
        for (char c : str.toCharArray()) {
            if(vowels.indexOf(c)!=-1){
                count++;
            }
        }
        System.out.println("В строке " + count + " гласных");

    }
}
