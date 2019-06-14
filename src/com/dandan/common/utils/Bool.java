package com.dandan.common.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/4/25
 * @Desciption :
 */
public enum Bool{

    Y(true, "Y", "Yes"),
    N(false, "N", "No");

    private boolean value;
    private String code;
    private String name;

    Bool(boolean value, String code, String name) {
        this.value = value;
        this.code = code;
        this.name = name;
    }


    private static final Map<Boolean, Bool> value2Bool;
    private static final Map<String, Bool> code2Bool;
    private static final Map<String, Bool> name2Bool;

    static{
        value2Bool = new HashMap<Boolean, Bool>();
        code2Bool = new HashMap<String, Bool>();
        name2Bool = new HashMap<String, Bool>();

        for (Bool bool : Bool.values()) {
            value2Bool.put(bool.getValue(), bool);
            code2Bool.put(bool.getCode(), bool);
            name2Bool.put(bool.getName(), bool);
        }
    }

    public static Bool fromValue(Boolean value) {
        if (value == null) {
            return null;
        }

        return value2Bool.get(value);
    }

    public static Bool fromCode(String code) {
        if (code == null) {
            return null;
        } else {
            code = code.toUpperCase();
        }

        return code2Bool.get(code);
    }

    public static Bool fromName(String name) {
        if (name == null) {
            return null;
        } else {
            name = name.toUpperCase();
        }

        return name2Bool.get(name);
    }

    public boolean getValue() {
        return value;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

}
