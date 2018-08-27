class Solution {
    public boolean rotateString(String A, String B) {
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        
        if (a.length != b.length){
            return false;
        }
        if (a.length == 0 && b.length== 0){
            return true;
        }
        int count = 0;
        while (count < a.length){
            char temp = a[0];
            for (int j = 1;j < a.length; j++){
                a[j-1] = a[j];
            }  
            a[a.length - 1] = temp;
            if (Arrays.equals(a, b)){
                return true;
            }
            count++;
        }
        return false;     
    }
}
