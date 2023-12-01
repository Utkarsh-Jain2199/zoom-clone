package com.mountblue.zoom.entities;

@Entity
public class Meeting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String meetingId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    @ManyToOne
    private User host;

    @ManyToMany
    private List<User> participants;

    // Other attributes, getters, setters, and methods
}