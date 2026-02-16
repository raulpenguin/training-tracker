package com.raul.training_tracker_backend;

import java.util.List;

public record NextWorkoutResponse(
        String workoutId,
        String title,
        int restSecondsDefault,
        List<ExerciseResponse> exercises
) {}

