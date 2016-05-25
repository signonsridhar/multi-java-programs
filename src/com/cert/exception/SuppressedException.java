package com.cert.exception;

import java.io.IOException;

/**
 * Created by sridhar on 4/2/16.
 */
public class SuppressedException {
    public static void main(String[] args) throws Exception{
        try (RiverRaft raft = new RiverRaft();){
            raft.crossRapid();
        } catch (Exception e){
            System.out.println("SuppressedException.main" + e);
        }
    }
}
class RiverRaft implements AutoCloseable {
    public RiverRaft () throws Exception{
        System.out.println("Start RivierRaft");
    }

    public void crossRapid() throws Exception{
        System.out.println("Cross rapid");
        //throw  new Exception("Cross rapid exception");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Reach River bank");
        throw new Exception("Close Exception");
    }
}