package liga.medical.dto;

import liga.medical.dto.enums.MessageType;
import lombok.Data;

@Data
public class RabbitMessageDto {
    private MessageType messageType;
    private String content;
}
