package com.example.task.mappers;

import com.example.task.dtos.AdvertiseDto;
import com.example.task.dtos.UserDto;
import com.example.task.entities.Advertise;
import com.example.task.entities.User;
import org.mapstruct.*;

import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {
    User toEntity(UserDto userDto);

    @Mapping(source = "advertises",target = "advertises")
    UserDto toDto(User user);

    @Mapping(target = "categoryName", source = "category.name")
    @Mapping(target = "categoryId", source = "category.id")
    UserDto.AdvertiseDto1 advertiseToAdvertiseDto1(Advertise advertise);

}