package models;

import java.time.LocalDateTime;

public class BaseModel {
    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Long createdBy;
    private Long updatedBy;
}
