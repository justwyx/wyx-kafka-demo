package com.wyx.kafkademo.consumer.test4;

import java.io.IOException;

public class SyncAsyncManualTest {
    public static void main(String[] args) throws IOException {
        SyncAsyncManualConsumer consumer = new SyncAsyncManualConsumer();
        consumer.start();
        System.in.read();
    }
}


