package com.example.task.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * DTO for {@link com.example.task.entities.User}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto implements Serializable {
    private Integer id;
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private String address;
    private Set<AdvertiseDto1> advertises = new LinkedHashSet<>();

    /**
     * DTO for {@link com.example.task.entities.Advertise}
     */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class AdvertiseDto1 implements Serializable {
        private Integer id;
        private String title;
        private String description;
        private Integer price;
        private Integer categoryId;
        private String categoryName;
    }
}