package DataObjects;

import com.github.javafaker.Faker;

public interface RegistrationData {
    Faker faker = new Faker();

    String
            email = faker.internet().emailAddress(),
            password = faker.internet().password(),
            wrongRepeatPassword = "alina",
            phone = faker.phoneNumber().phoneNumber(),
            realPhoneNumber = "577952060";
    int
        male = 0,
        female = 1;
}
