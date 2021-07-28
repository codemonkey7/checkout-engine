package com.tasks.checkout.engine.impl;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;
import com.tasks.checkout.engine.ICheckoutService;

public class CheckoutService implements ICheckoutService {

    // Need to read config files, probably will move this
    public void init() {
        try {
            Reader reader = Files.newBufferedReader(Paths.get("static/products.json"));
            JsonObject parser = (JsonObject) Jsoner.deserialize(reader);

            System.out.print(parser);

        } catch (IOException | JsonException e) {

            System.err.println(e);
        }
    
        // create parser
    }
    
}
