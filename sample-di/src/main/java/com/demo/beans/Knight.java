package com.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class Knight {

//    composition
//    private RescuingDimselQuest quest = new RescuingDimselQuest();
//    private SlayingDragonQuest quest = new SlayingDragonQuest();
//      private SingYoYeYo quest = new SingYoYeYo();

    //    Knight depend on Quest, Dependency is Quest

    @Autowired //@QuestType(type = QuestType.Type.Dimsel)
    private Quest quest;

    //    @Autowired(required = false)
//    public Knight(Quest quest, @Nullable MyClass myClass
    private MyClass myClass;

    public Knight(Quest quest, Optional<MyClass> myClass) {
        this.quest = quest;
//        this.myClass = myClass;
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    public String goQuest() {
        return quest.goQuest();

    }

    @Autowired
    public void setSpringNBeaan(List<MyInterface> list){

    }


}
