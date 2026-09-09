package com.vincenthartono.database5.mappers;

public interface Mapper<A, B>{

    B MapTo(A a);

    A mapFrom(B b);
}
