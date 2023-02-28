package com.demo.beans;

import org.springframework.stereotype.Component;

@Component("yoyeyo") //@QuestType(type = QuestType.Type.YoYeYo)
public class SingYoYeYo implements Quest{

    public String goQuest(){
        return "Knigh sing YoYeYo";
    }
}
