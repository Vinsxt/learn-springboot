package com.vincenthartono.database5.repositories;

import com.vincenthartono.database5.TestDataUtil;
import com.vincenthartono.database5.domain.entities.AuthorEntity;
import com.vincenthartono.database5.domain.entities.BookEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)

public class BookEntityRepositoryIntegrationTests {

    private BookRepository underTest;
    private final AuthorRepository authorRepository;

    @Autowired
    public BookEntityRepositoryIntegrationTests(BookRepository underTest, AuthorRepository authorRepository){
        this.underTest = underTest;
        this.authorRepository = authorRepository;
    }

    @Test
    public void testThatBookCanBeCreatedAndRecalled(){
        AuthorEntity authorEntity = TestDataUtil.createTestAuthorA();
        AuthorEntity savedAuthorEntity = authorRepository.save(authorEntity);

        BookEntity bookEntity = TestDataUtil.createTestBookEntityA(savedAuthorEntity);
        underTest.save(bookEntity);

        Optional<BookEntity> result = underTest.findById(bookEntity.getIsbn());
        assertThat(result).isPresent();
        assertThat(result.get()).isEqualTo(bookEntity);
    }

    @Test
    public void testThatMultipleBooksCanBeCreatedAndRecalled(){
        AuthorEntity authorEntity = TestDataUtil.createTestAuthorA();
        AuthorEntity savedAuthorEntity = authorRepository.save(authorEntity);

        BookEntity bookEntityA = TestDataUtil.createTestBookEntityA(savedAuthorEntity);
        underTest.save(bookEntityA);

        BookEntity bookEntityB = TestDataUtil.createTestBookB(savedAuthorEntity);
        underTest.save(bookEntityB);

        BookEntity bookEntityC = TestDataUtil.createTestBookC(savedAuthorEntity);
        underTest.save(bookEntityC);

        Iterable<BookEntity> result = underTest.findAll();
        assertThat(result).hasSize(3).containsExactly(bookEntityA, bookEntityB, bookEntityC);

    }

    @Test
    public void testThatBookCanBeUpdated() {
        AuthorEntity authorEntity = TestDataUtil.createTestAuthorA();
        AuthorEntity savedAuthorEntity = authorRepository.save(authorEntity);

        BookEntity bookEntityA = TestDataUtil.createTestBookEntityA(savedAuthorEntity);
        underTest.save(bookEntityA);

        bookEntityA.setTitle("UPDATED");
        underTest.save(bookEntityA);

        Optional<BookEntity> result = underTest.findById(bookEntityA.getIsbn());
        assertThat(result).isPresent();
        assertThat(result.get()).isEqualTo(bookEntityA);

    }

    @Test
    public void testThatBookCanBeDeleted(){
        AuthorEntity authorEntity = TestDataUtil.createTestAuthorA();
        AuthorEntity savedAuthorEntity = authorRepository.save(authorEntity);

        BookEntity bookEntityA = TestDataUtil.createTestBookEntityA(savedAuthorEntity);
        underTest.save(bookEntityA);

        underTest.deleteById(bookEntityA.getIsbn());

        Optional<BookEntity> result = underTest.findById(bookEntityA.getIsbn());
        assertThat(result).isEmpty();
    }
}
