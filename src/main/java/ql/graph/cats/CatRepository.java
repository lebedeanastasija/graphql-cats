package ql.graph.cats;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class CatRepository {
    private List<Cat> cats = new ArrayList<>();

    Cat create(String name) {
        var cat = new Cat(UUID.randomUUID().toString(), name);
        cats.add(cat);
        return cat;
    }

    List<Cat> findAll() {
        return this.cats;
    }
}
