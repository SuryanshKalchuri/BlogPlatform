package com.AICoders.BlogPlatform.mappers;

import com.AICoders.BlogPlatform.domain.CreatePostRequest;
import com.AICoders.BlogPlatform.domain.UpdatePostRequest;
import com.AICoders.BlogPlatform.domain.dtos.CreatePostRequestDto;
import com.AICoders.BlogPlatform.domain.dtos.PostDto;
import com.AICoders.BlogPlatform.domain.dtos.UpdatePostRequestDto;
import com.AICoders.BlogPlatform.domain.entities.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PostMapper {

    @Mapping(target = "author", source = "author")
    @Mapping(target = "category", source = "category")
    @Mapping(target = "tags", source = "tags")
    @Mapping(target = "status", source = "status")
    PostDto toDto(Post post);

    CreatePostRequest toCreatePostRequest(CreatePostRequestDto dto);

    UpdatePostRequest toUpdatePostRequest(UpdatePostRequestDto dto);

}
