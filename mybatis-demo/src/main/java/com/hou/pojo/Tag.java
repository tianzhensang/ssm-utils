package com.hou.pojo;

import lombok.Data;

@Data
public class Tag {
    private String tagId;
    private String tagName;
    private String tagDescription;

    @Override
    public String toString() {
        return "Tag{" +
                "tag_id='" + tagId + '\'' +
                ", tag_name='" + tagName + '\'' +
                ", tag_description='" + tagDescription + '\'' +
                '}';
    }
}
