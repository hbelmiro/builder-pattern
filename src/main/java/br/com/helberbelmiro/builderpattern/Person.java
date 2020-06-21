package br.com.helberbelmiro.builderpattern;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class Person {

    @NotNull
    private final String name;

    @NotNull
    private final LocalDate birthDate;

    @NotNull
    private final String email;

    private final String phoneNumber;

    private final String website;

    private final String facebookAccount;

    private final String instagramAccount;

    private final String twitterAccount;

    private final String githubAccount;

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getWebsite() {
        return website;
    }

    public String getFacebookAccount() {
        return facebookAccount;
    }

    public String getInstagramAccount() {
        return instagramAccount;
    }

    public String getTwitterAccount() {
        return twitterAccount;
    }

    public String getGithubAccount() {
        return githubAccount;
    }

    private Person(Builder builder) {
        this.name = builder.name;
        this.birthDate = builder.birthDate;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
        this.website = builder.website;
        this.facebookAccount = builder.facebookAccount;
        this.instagramAccount = builder.instagramAccount;
        this.twitterAccount = builder.twitterAccount;
        this.githubAccount = builder.githubAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private @NotNull String name;
        private @NotNull LocalDate birthDate;
        private @NotNull String email;
        private String phoneNumber;
        private String website;
        private String facebookAccount;
        private String instagramAccount;
        private String twitterAccount;
        private String githubAccount;

        public Builder withName(@NotNull String name) {
            this.name = name;
            return this;
        }

        public Builder withBirthDate(@NotNull LocalDate birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Builder withEmail(@NotNull String email) {
            this.email = email;
            return this;
        }

        public Builder withPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder withWebsite(String website) {
            this.website = website;
            return this;
        }

        public Builder withFacebookAccount(String facebookAccount) {
            this.facebookAccount = facebookAccount;
            return this;
        }

        public Builder withInstagramAccount(String instagramAccount) {
            this.instagramAccount = instagramAccount;
            return this;
        }

        public Builder withTwitterAccount(String twitterAccount) {
            this.twitterAccount = twitterAccount;
            return this;
        }

        public Builder withGithubAccount(String githubAccount) {
            this.githubAccount = githubAccount;
            return this;
        }

        public Person build() {
            return new Person(this);
        }

    }

}