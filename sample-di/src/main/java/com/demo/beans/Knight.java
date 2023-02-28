package com.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Knight {

//    composition
//    private RescuingDimselQuest quest = new RescuingDimselQuest();
//    private SlayingDragonQuest quest = new SlayingDragonQuest();
//      private SingYoYeYo quest = new SingYoYeYo();

    //    Knight depend on Quest, Dependency is Quest

    @Autowired @QuestType(type = QuestType.Type.Dimsel)
    private Quest quest;

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    public String goQuest() {
        return quest.goQuest();
    }


}
