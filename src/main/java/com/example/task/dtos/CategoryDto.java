package com.example.task.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * DTO for {@link com.example.task.entities.Category}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto implements Serializable {
    private Integer id;
    private String name;
    private Set<AdvertiseDto> advertises = new LinkedHashSet<>();

    /**
     * DTO for {@link com.example.task.entities.Advertise}
     */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class AdvertiseDto implements Serializable {
        private Integer id;
        private String title;
        private String description;
        private Integer price;
        private Integer userId;
        private String userName;
        private String userEmail;
        private String userPassword;
        private String userPhoneNumber;
        private String userAddress;
    }
}