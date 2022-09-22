package com.ingenuity.flow.stream;

import com.ingenuity.flow.struct.TransformGraph;
import com.ingenuity.transform.Transform;

import java.util.HashMap;
import java.util.concurrent.BlockingQueue;

public interface StreamInterface {

    public void setTransformGraph(TransformGraph tGraph);

    public TransformGraph getTransformGraph();

    public void setTransformQueue(int transformID, BlockingQueue<?> bQueue);

    public BlockingQueue<?> getTransformQueue(int transformID);

    public HashMap<Integer, BlockingQueue<?>> getUpstreamQueue(int transformID);

    public HashMap<Integer, BlockingQueue<?>> getDownstreamQueue(int transformID);

}