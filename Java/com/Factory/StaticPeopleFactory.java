package com.Factory;

import com.pojo.Man;
import com.pojo.People;
import com.pojo.Woman;

public class StaticPeopleFactory {
    public static People newInstance(int witch)
    {
        switch (witch)
        {
            case 1: return new Man();
            case 0: return new Woman();
            default: return new People();
        }
    }
}
