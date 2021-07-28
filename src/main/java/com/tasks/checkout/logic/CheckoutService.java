package com.tasks.checkout.logic;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;
import com.tasks.checkout.interfaces.ICheckoutService;

public class CheckoutService implements ICheckoutService {

    public void init() {
        Reader reader;
        try {
            reader = Files.newBufferedReader(Paths.get("product.json"));
            JsonObject parser = (JsonObject) Jsoner.deserialize(reader);
        } catch (IOException | JsonException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    
        // create parser
    }
    
}
