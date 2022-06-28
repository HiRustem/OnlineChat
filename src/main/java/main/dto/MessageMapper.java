package main.dto;

import main.model.Message;

public class MessageMapper {

    public static DtoMessage map(Message message) {
        DtoMessage dtoMessage = new DtoMessage();
        dtoMessage.setDateTime(message.getDateTime().toString());
        dtoMessage.setText(message.getMessage());
        dtoMessage.setUserName(message.getUser().getName());
        return dtoMessage;
    }

}
