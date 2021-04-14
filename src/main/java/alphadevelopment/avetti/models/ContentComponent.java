package alphadevelopment.avetti.models;

import lombok.Data;

//-----------------------WRITTEN BY OLEK-----------------------------------------------------
@Data
public class ContentComponent {

    private String type;
    private String content;
    private String fileId;

    public ContentComponent(String type, String content) {
        this.type = type;
        this.content = content;
    }
}
