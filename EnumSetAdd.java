package com.keyword;


import java.util.EnumSet;

enum Games{CRICKET,FOOTBALL,VOLLEYBALL,BASKETBALL,HOCKEY}

public class EnumSetAdd
{
    public static void main(String[] args)
    {
        EnumSet<Games> set1 = EnumSet.allOf(Games.class);
        EnumSet<Games> set2 = EnumSet.allOf(Games.class);
        set2.add(Games.CRICKET);
        set2.add(Games.FOOTBALL);
        set2.add(Games.VOLLEYBALL);
        System.out.println("The set 1 is "+set1);
        System.out.println("The set 2 is "+set2);

    }
}
