package com.example.demo1;

import java.util.ArrayList;
import java.util.List;

public class Resource {

    public static final List<Refresh> RESOURCES = new ArrayList<>();

    public static void add(Refresh refresh) {
        RESOURCES.add(refresh);
        RESOURCES.forEach(Refresh::refresh);

    }

    public static void remove(Refresh refresh) {
        RESOURCES.remove(refresh);
        RESOURCES.forEach(Refresh::refresh);
    }


}
