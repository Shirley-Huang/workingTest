package com.dandan.ClassOverride;

import java.util.Arrays;

public class ArraysTest {

    public static void main(String[] args) {
        String request = "12,34,56";

        String[] receiverIds = request.split(",");
        for (int i = 0; i < receiverIds.length; i += 100) {
            StringBuilder receivers = new StringBuilder();
            for (String receiver :
                    Arrays.copyOfRange(receiverIds, i, (i + 100 <= receiverIds.length) ? i + 100 : receiverIds.length)){
                System.out.println(receiver);
                    receivers.append(receiver).append(",");
            }
            receivers = receivers.deleteCharAt(receivers.length() - 1);
            System.out.println(receivers.toString());
          }


    }
}
