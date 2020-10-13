public class DailyTemperatures {
    public static int[] dailyTemperatures(int[] T) {

        int length = T.length;
        if(length == 0){
            return new int[]{};
        }
        int[] ints = new int[length];
        int count = 0;
        for (int i = 0; i < length; i++){
            for (int j = i; j < length; j++){
                if(T[i] < T[j]){
                    ints[i] = count;
                    count = 0;
                    break;
                }else {
                    count++;
                    if(j==length-1){
                        count = 0;
                    }
                }
            }
        }
        return ints;

    }
    public static int[] dailyTemperatures2(int[] T) {
        int length = T.length;
        int[] result = new int[length];

        //从右向左遍历
        for (int i = length - 2; i >= 0; i--) {
            // j+= result[j]是利用已经有的结果进行跳跃
            for (int j = i + 1; j < length; j += result[j]) {
                if (T[j] > T[i]) {
                    result[i] = j - i;
                    break;
                } else if (result[j] == 0) {
                    //遇到0表示后面不会有更大的值，那当然当前值就应该也为0
                    result[i] = 0;
                    break;
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] T = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        int[] ints = dailyTemperatures2(T);
        System.out.println(ints);
    }
}
