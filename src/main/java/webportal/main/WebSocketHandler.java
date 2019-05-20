package webportal.main;

import org.springframework.web.socket.BinaryMessage;
import org.springframework.web.socket.TextMessage;
//import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.web.reactive.socket.*;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;


import org.springframework.core.io.buffer.*;


public class WebSocketHandler extends AbstractWebSocketHandler
{
    
@Override
protected void handleTextMessage(WebSocketSession session, TextMessage message) throws IOException {
    //System.out.println("-----------Vehicle----------");
    //System.out.println(message.getPayload().replace("\\",""));
   // String jsonData = message.getPayload().replace("\\","");
	System.out.println(message.getPayload());
	TextMessage pattern = new TextMessage(message.getPayload());

    session.sendMessage(pattern);
  /*   try {
        JSONObject newVehicle = new JSONObject(jsonData);
        System.out.println(newVehicle.toString(4));
        System.out.println("----------------------------"); 
        System.out.println();
        
    } catch (Exception e) { 
        //TODO: handle exception
    } */
    
}
 
@Override
protected void handleBinaryMessage(WebSocketSession session, BinaryMessage message) throws IOException {
    System.out.println("New Binary Message Received");
    System.out.println(message);
    System.out.println();
    session.sendMessage(message);

    
}



 
}