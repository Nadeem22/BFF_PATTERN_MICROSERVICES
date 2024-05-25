package com.nadeem.bff.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Course {
    private Long id;
    private String name;
    private Long authorId;
}
