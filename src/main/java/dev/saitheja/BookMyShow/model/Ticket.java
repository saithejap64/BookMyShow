package dev.saitheja.BookMyShow.model;

import dev.saitheja.BookMyShow.model.constants.TicketStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel{
    private LocalDateTime timeOfBooking;
    private double totalAmount;
    @OneToMany
    private List<ShowSeat> showSeat;
    @ManyToOne
    private Show show;
    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;
}
