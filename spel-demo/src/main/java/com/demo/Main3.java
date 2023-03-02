package com.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.expression.BeanFactoryResolver;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class Main3 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        StandardEvaluationContext evaluationContext =
                new StandardEvaluationContext();

        evaluationContext.setBeanResolver(new BeanFactoryResolver(context));

        SpelExpressionParser parser = new SpelExpressionParser();


        System.out.println(
            parser.parseExpression("@springbean1.name").getValue(evaluationContext)

        );

        System.out.println(
                parser.parseExpression("@springbean1.getStreet").getValue(evaluationContext)
        );

        System.out.println(

                parser.parseExpression("@springbean1.getHobbyName").getValue(evaluationContext)
        );
    }
}
