package com.mertcarabaci.projectx.utils.common;

import java.util.ArrayList;
import java.util.Objects;

public class NoNullList<T> extends ArrayList<Object> {
    public ArrayList<Object> addIfNotNull(final Object o) {
        if (!Objects.isNull(o)) {
            this.add(o);
        }
        return this;
    }
}

