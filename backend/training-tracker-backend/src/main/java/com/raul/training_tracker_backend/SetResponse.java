package com.raul.training_tracker_backend;

public record SetResponse(
        int setNumber,
        int reps,
        String load,
        int restSeconds
) {}

