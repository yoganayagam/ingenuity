package com.ingenuity.transform;

import java.util.concurrent.ConcurrentHashMap;

public interface TransformInterface {

    public TransformType setTransformType(TransformType type);

    public TransformType getTransformType();
    public void addTransformProperty(String pKey, String pValue);

    public ConcurrentHashMap<String, String> getTransformProperties();

    public String setTransformName(String name);

    public String getTransformName();

    public int setTransformID(int ID);

    public int getTransformID();

    public boolean equals(TransformInterface tInterface);

    public int hashCode();

}
