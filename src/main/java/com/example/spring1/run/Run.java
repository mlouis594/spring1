package com.example.spring1.run;

import java.time.LocalDateTime;

// a record will have all the getters but is immutable, toString, equals and hashcode
//cannot change the values
public record Run(Integer id,
        String title,
        LocalDateTime startedOn,
        LocalDateTime completedOn,
        Integer miles,
        Location location) {

}
