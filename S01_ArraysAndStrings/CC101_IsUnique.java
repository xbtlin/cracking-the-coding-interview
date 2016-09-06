public class CC101_IsUnique{

    // if str is null or blank or not character, return false
    boolean isUnique(String str){
        if(str == null || str == "") return false;
        char[] carr = str.toCharArray();
        int[] arr = new int[26];
        for(char c : carr){
            int index = c - 'a';
            if(index < 0 || index > 25) return false;
            arr[index] = 1;
        }
        int ct=0;
        for(int i = 0; i < 26; i++){
            if(arr[i] > 0) ct++;
        }

        return ct == carr.length;
    }

    public static void main(String[] args){
        System.out.println(new CC101_IsUnique().isUnique("helo"));
    }
}