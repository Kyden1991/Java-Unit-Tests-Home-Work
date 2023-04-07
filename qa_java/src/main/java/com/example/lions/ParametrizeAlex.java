package com.example.lions;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParametrizeAlex {
    String alexFriend;

    public ParametrizeAlex(String alexFriend) {
        this.alexFriend = alexFriend;
    }

    @Parameterized.Parameters
    public static Object[][] setFriends() {
            return new Object[][]{
                    {"Марти"},
                    {"Глория"},
                    {"Мелман"}
            };
    }

    @Test
    public void getFriends() {

    }
}
