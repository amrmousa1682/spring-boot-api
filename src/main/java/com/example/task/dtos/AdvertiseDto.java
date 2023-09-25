package com.example.task.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link com.example.task.entities.Advertise}
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdvertiseDto implements Serializable {
    private Integer id;
    private String title;
    private String description;
    private Integer price;
    private Integer categoryId;
    private String categoryName;
    private Integer userId;
    private String userName;
    private String userEmail;
    private String userPhoneNumber;
    private String userAddress;
}