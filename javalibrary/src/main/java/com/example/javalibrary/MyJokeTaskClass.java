package com.example.javalibrary;

import java.util.Random;

public class MyJokeTaskClass {
    private String[] j;

    //all Jokes Here
    public MyJokeTaskClass()
    {
        j = new String[10];
        j[0] = "\n" +
                "A family of mice were surprised by a big cat. Father Mouse jumped and and said, \"Bow-wow!\" The cat ran away. \"What was that, Father?\" asked Baby Mouse. \"Well, son, that's why it's important to learn a second language.\" ";
        j[1] = "My friend said he knew a man with a wooden leg named Smith. \n" +
                "So I asked him \"What was the name of his other leg?\"";
        j[2] = "Patient: Doctor! You've got to help me! Nobody ever listens to me. No one ever pays any attention to what I have to say.\n" +
                "Doctor: Next please! ";
        j[3] = "\"Why do you take baths in milk?\" \n" +
                "\"I can't find a cow tall enough for a shower.\"";
        j[4] = "\"I was born in California.\" \n" +
                "\"Which part?\" \n" +
                "\"All of me.\"";
        j[5] = "\"Excuse me. Do you know the way to the zoo?\" \n" +
                "\"No, I'm sorry I don't.\" \n" +
                "\"Well, it's two blocks this way, then one block to the left.\"";
        j[6] = "\n" +
                "Teacher: Do you have trouble making decisions? \n" +
                "Student: Well...yes and no.";
        j[7] = "If big elephants have big trunks, do small elephants have suitcases? ";
        j[8] = "A: Do you want to hear a dirty joke? \n" +
                "B: Ok \n" +
                "A: A white horse fell in the mud. ";
        j[9] = "In a restaurant:\n" +
                "Customer: Waiter, waiter! There is a frog in my soup!!! \n" +
                "Waiter: Sorry, sir. The fly is on vacation. ";
    }

    public String[] getJokes() {
        return j;
    }

    public String getRandomJoke() {
        Random random = new Random();
        return j[random.nextInt(j.length)];
    }
}
