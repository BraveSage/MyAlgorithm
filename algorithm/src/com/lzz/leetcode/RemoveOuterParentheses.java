package com.lzz.leetcode;

/**
 * @author lzz
 * @date 2019-05-13
 * 移除最外层的括号
 */
public class RemoveOuterParentheses {


    public static void main(String[] args) {
        String s = "(11)(11)";
        String s1 = removeOuterParentheses(s);
        System.out.println(s1);
    }

    public static String removeOuterParentheses(String s) {
        char[] chars = s.toCharArray();
        int flag=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < chars.length; i++){
            if(chars[i]=='('){
                flag++;
                if(flag==1){
                    continue;
                }
            }
            if(chars[i]==')'){
                flag--;
                if(flag==0){
                    continue;
                }
            }
            sb.append(chars[i]);
        }
        return sb.toString();
    }
}
