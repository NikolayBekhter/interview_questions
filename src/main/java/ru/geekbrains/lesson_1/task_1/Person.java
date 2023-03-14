package ru.geekbrains.lesson_1.task_1;

import lombok.Data;

@Data
public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;

    private Person(Builder builder) {
        setFirstName(builder.firstName);
        setLastName(builder.lastName);
        setMiddleName(builder.middleName);
        setCountry(builder.country);
        setAddress(builder.address);
        setPhone(builder.phone);
        setAge(builder.age);
        setGender(builder.gender);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(Person copy) {
        Builder builder = new Builder();
        builder.firstName = copy.getFirstName();
        builder.lastName = copy.getLastName();
        builder.middleName = copy.getMiddleName();
        builder.country = copy.getCountry();
        builder.address = copy.getAddress();
        builder.age = copy.getAge();
        builder.gender = copy.getGender();
        builder.phone = copy.getPhone();
        return builder;
    }

    public static final class Builder {
        private String firstName;
        private String lastName;
        private String middleName;
        private String country;
        private String address;
        private String phone;
        private int age;
        private String gender;

        public Builder() {
        }

        public Builder firstName(String val) {
            firstName = val;
            return this;
        }

        public Builder lastName(String val) {
            lastName = val;
            return this;
        }

        public Builder middleName(String val) {
            middleName = val;
            return this;
        }

        public Builder country(String val) {
            country = val;
            return this;
        }

        public Builder address(String val) {
            address = val;
            return this;
        }

        public Builder phone(String val) {
            phone = val;
            return this;
        }

        public Builder age(int val) {
            age = val;
            return this;
        }

        public Builder gender(String val) {
            gender = val;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
