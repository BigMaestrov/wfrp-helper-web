package com.example.wfrphelper.model.mainClasses;

import com.example.wfrphelper.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlayableCharacter {
    @Autowired
    private Characteristics characteristics;
    @Autowired
    private Inventory inventory;
    @Autowired
    private Description description;
    @Autowired
    private Experience experience;
    @Autowired
    private BasicSkills basicSkills;
}
