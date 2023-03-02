//package com.demo;
//
//import org.springframework.expression.ExpressionParser;
//import org.springframework.expression.spel.standard.SpelExpressionParser;
//
//import java.lang.reflect.Array;
//import java.util.Arrays;
//
//public class Main2{
//    public static void main(String[] args) {
//        ExpressionParser parser = new SpelExpressionParser();
//        System.out.println(parser.parseExpression("'Hello'.concat(' world')").getValue());
//
//        System.out.println(
//                parser.parseExpression("'2 * 2 = '.concat(2*2)").getValue()
//
//        );
//
//        System.out.println(
//                parser.parseExpression("'5>3 = '.concat(5>3)").getValue()
//        );
//
//        System.out.println(
//                Arrays
//                        .toString(
//                                (int[]  parser.parseExpression("new int[]{1,2,3,4,5,6}'.concat()"))
//                        )
//        );
//    }
//}
