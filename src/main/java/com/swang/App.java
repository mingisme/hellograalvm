package com.swang;

import org.graalvm.polyglot.*;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) throws URISyntaxException, IOException {

        try (Context context = Context.newBuilder("js")
                .allowAllAccess(true)
//                .allowHostAccess(HostAccess.NONE) // Restrict Java access
//                .allowCreateThread(false) // Prevent thread creation
                .build()) {

            String script = Files.readString(Paths.get(App.class.getClassLoader().getResource("script.js").toURI()));
            Value result = context.eval("js", script);
            System.out.println("Execution Result: " + result);
        }

    }
}
