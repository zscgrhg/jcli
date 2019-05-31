package com.example;

import hudson.cli.CLI;

public class Jenkins {
    public static void main(String[] args) throws Exception {
        CLI._main(new String[]{"-s","http://192.168.74.132:8080/",
                "-auth",
                "admin:admin",
                "help",
        "create-job"});
    }
}
