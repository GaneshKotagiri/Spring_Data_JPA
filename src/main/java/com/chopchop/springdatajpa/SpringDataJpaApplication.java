package com.chopchop.springdatajpa;

import com.chopchop.springdatajpa.model.Student;
import com.chopchop.springdatajpa.repository.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {
        ApplicationContext context=SpringApplication.run(SpringDataJpaApplication.class, args);

        StudentRepo repo=context.getBean(StudentRepo.class);

        Student st1=context.getBean(Student.class);
        Student st2=context.getBean(Student.class);
        Student st3=context.getBean(Student.class);

        st1.setId(1);
        st1.setName("ganesh");
        st1.setMarks(85);

        st2.setId(2);
        st2.setName("gaya");
        st2.setMarks(90);

        st3.setId(3);
        st3.setName("devi");
        st3.setMarks(95);

        System.out.println(repo.findByMarksGreaterThan(90));
        repo.
    }

}
