package com.vincenthartono.database5.mappers.impl;

import com.vincenthartono.database5.domain.dto.AuthorDto;
import com.vincenthartono.database5.domain.entities.AuthorEntity;
import com.vincenthartono.database5.mappers.Mapper;
import org.modelmapper.ModelMapper;

public class AuthorMapperImpl implements Mapper<AuthorEntity, AuthorDto>{

    private ModelMapper modelMapper;

    public AuthorMapperImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public AuthorDto MapTo(AuthorEntity authorEntity) {
        return modelMapper.map(authorEntity, AuthorDto.class);
    }

    @Override
    public AuthorEntity mapFrom(AuthorDto authorDto) {
        return modelMapper.map(authorDto, AuthorEntity.class);
    }
}
