package org.vaadin.marcus.client;

import com.vaadin.flow.server.auth.AnonymousAllowed;
import dev.hilla.BrowserCallable;
import java.util.List;
import org.vaadin.marcus.service.BookingDetails;
import org.vaadin.marcus.service.FlightService;

@BrowserCallable
@AnonymousAllowed
public class BookingService {
  private final FlightService carRentalService;

  public BookingService(FlightService carRentalService) {
    this.carRentalService = carRentalService;
  }

  public List<BookingDetails> getBookings() {
    return carRentalService.getBookings();
  }
}
