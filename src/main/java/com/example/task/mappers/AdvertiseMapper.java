package com.example.task.mappers;

import com.example.task.dtos.AdvertiseDto;
import com.example.task.entities.Advertise;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface AdvertiseMapper {
    @Mapping(source = "userAddress", target = "user.address")
    @Mapping(source = "userPhoneNumber", target = "user.phoneNumber")
    @Mapping(source = "userEmail", target = "user.email")
    @Mapping(source = "userName", target = "user.name")
    @Mapping(source = "userId", target = "user.id")
    @Mapping(source = "categoryName", target = "category.name")
    @Mapping(source = "categoryId", target = "category.id")
    Advertise toEntity(AdvertiseDto advertiseDto);

    @InheritInverseConfiguration(name = "toEntity")
    AdvertiseDto toDto(Advertise advertise);
}