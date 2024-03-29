package com.example.springbootwebsocketbatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

/**
 * Created by shivam.si on 10/02/22 8:55 am
 */

public class UserItemProcessor implements ItemProcessor<User, User> {
    private static final Logger log = LoggerFactory.getLogger(UserItemProcessor.class);

    @Override
    public User process(final User user) throws Exception {
        final String firstName = user.getFirstName().toUpperCase();
        final String lastName = user.getLastName().toUpperCase();
        final User transformedPerson = new User(firstName, lastName);
        log.info("Converting (" + user + ") into (" + transformedPerson + ")");
        return transformedPerson;
    }
}
