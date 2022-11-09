package liga.medical.dto;

import lombok.Data;

@Data
public class RabbitMessageDTO {
    private long id;
    private long personId;
    private String type;
    private String description;
}
