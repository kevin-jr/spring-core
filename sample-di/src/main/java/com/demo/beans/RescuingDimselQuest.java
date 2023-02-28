package com.demo.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dimsel") @QuestType(type = QuestType.Type.Dimsel)

public class RescuingDimselQuest implements Quest{


    public String goQuest(){

        return  "Knight is going to rescue Dimsel!";
    }

}
