/**
 * 字符串转换整数
 */
public class MyAtoi {

    public static int myAtoi(String str) {
        if(str.length() == 0){
            return 0;
        }
        boolean haveOperator = false;
        boolean isEmpty = true;
        boolean firstZero = true;

        StringBuilder builder = new StringBuilder();
        for(char ch: str.toCharArray()){
            if((ch == '+' || ch == '-')){
                if(!haveOperator){
                    isEmpty = false;
                    haveOperator = true;
                    builder.append(ch);
                }else {
                   break;
                }
            }else if(ch == ' '){
                if(isEmpty){
                    continue;
                }else {
                    break;
                }
            }else if(ch >= '0' && ch <= '9'){
                isEmpty = false;
                haveOperator = true;
                if(firstZero && ch == '0'){
                    continue;
                }
                builder.append(ch);
                firstZero = false;

            }else {
                break;
            }
        }
        String strNum = builder.toString();

        if(strNum.equals("+")|| strNum.equals("-") || strNum.length() == 0){
            return 0;
        }
        if(strNum.length() > String.valueOf(Integer.MIN_VALUE).length()){
            if(strNum.charAt(0) != '-'){
                return Integer.MAX_VALUE;
            }else {
                return Integer.MIN_VALUE;
            }
        }

        Long num = Long.valueOf(strNum);
        if(num > 0) {
            num = num > Integer.MAX_VALUE ?  Integer.MAX_VALUE:num ;
        }else {
            num = num < Integer.MIN_VALUE ? Integer.MIN_VALUE : num;
        }
        return Integer.valueOf(String.valueOf(num));
    }

    public static int myAtoi2(String str){
        int len = str.length();
        // str.charAt(i) 方法回去检查下标的合法性，一般先转换成字符数组
        char[] charArray = str.toCharArray();

        // 1、去除前导空格
        int index = 0;
        while (index < len && charArray[index] == ' ') {
            index++;
        }

        // 2、如果已经遍历完成（针对极端用例 "      "）
        if (index == len) {
            return 0;
        }

        // 3、如果出现符号字符，仅第 1 个有效，并记录正负
        int sign = 1;
        char firstChar = charArray[index];
        if (firstChar == '+') {
            index++;
        } else if (firstChar == '-') {
            index++;
            sign = -1;
        }

        // 4、将后续出现的数字字符进行转换
        // 不能使用 long 类型，这是题目说的
        int res = 0;
        while (index < len) {
            char currChar = charArray[index];
            // 4.1 先判断不合法的情况
            if (currChar > '9' || currChar < '0') {
                break;
            }

            // 题目中说：环境只能存储 32 位大小的有符号整数，因此，需要提前判：断乘以 10 以后是否越界
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && (currChar - '0') > Integer.MAX_VALUE % 10)) {
                return Integer.MAX_VALUE;
            }
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && (currChar - '0') > -(Integer.MIN_VALUE % 10))) {
                return Integer.MIN_VALUE;
            }

            // 4.2 合法的情况下，才考虑转换，每一步都把符号位乘进去
            res = res * 10 + sign * (currChar - '0');
            index++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi2("   -522329781787187 8223-"));
    }
}
