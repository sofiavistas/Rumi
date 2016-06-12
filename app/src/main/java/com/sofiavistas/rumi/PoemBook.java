package com.sofiavistas.rumi;


import java.util.Random;

public class PoemBook {

    String[] mPoems = {
    "Your task is not to seek for love, but merely to seek and find all the barriers within yourself that you have built against it.",
            "What you seek is seeking you.",
            "Yesterday I was clever, so I wanted to change the world. Today I am wise, so I am changing myself.",
            "Silence is the language of god, all else is poor translation.",
            "I want to sing like the birds sing, not worrying about who hears or what they think.",
            "Let yourself be drawn by the stronger pull of that which you truly love.",
            "You are not a drop in the ocean. You are the entire ocean in a drop",
            "There is a voice that doesn’t use words. Listen.",
            "If you are irritated by every rub, how will you be polished?",
            "Before death takes away what you are given, give away what there is to give",
            "Raise your words, not voice. It is rain that grows flowers, not thunder."
        };

    public String getPoem() {
        String fact = "";
        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mPoems.length);
        fact = mPoems[randomNumber];

        return fact;
    }
}
