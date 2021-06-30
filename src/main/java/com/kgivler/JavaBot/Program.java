package com.kgivler.JavaBot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class Program {
    public static void main (String[] args) throws LoginException {
        System.out.println("JavaBot Thing");

        JDA builder = JDABuilder.createDefault("token").build();
    }
}
