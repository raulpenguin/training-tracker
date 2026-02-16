package com.raul.training_tracker_backend;

import java.util.List;

public record ExerciseResponse(
        String exerciseId,
        String name,
        List<SetResponse> sets
) {}

