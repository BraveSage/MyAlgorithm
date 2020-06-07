package com.lzz.leetcode;

import java.util.Stack;

/**
 * 判断有效的括号
 *
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 *
 * 输入: "{[]}"
 * 输出: true
 */
public class IsValid {
    public static boolean isValid(String s) {
        if(s.length()%2!= 0){
            return false;
        }
        if (s.length() == 0){
            return true;
        }
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++){
            if(chars[i] == '(' || chars[i] == '[' || chars[i] == '{'){
                stack.push(chars[i]);
            }else {
                if (stack.empty()){
                    return false;
                }
                //栈顶元素
                char top = stack.peek();
                if((chars[i] == ')'&& top == '(' ) ||(chars[i] == ']'&& top == '[' )||(chars[i] =='}'&& top == '{' )){
                    stack.pop();
                }
            }
        }
        return stack.empty();

    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]"));
    }

}
