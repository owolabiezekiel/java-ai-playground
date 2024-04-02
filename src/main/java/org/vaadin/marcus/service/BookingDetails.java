package org.vaadin.marcus.service;

import java.time.LocalDate;
import org.vaadin.marcus.data.BookingStatus;

public record BookingDetails(
    String bookingNumber,
    String firstName,
    String lastName,
    LocalDate date,
    BookingStatus bookingStatus,
    String from,
    String to,
    String bookingClass) {}
