package com.dgvspammer.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
