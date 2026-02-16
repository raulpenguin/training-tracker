package com.raul.training_tracker_backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NextWorkoutController {

    @GetMapping("/next-workout")
    public NextWorkoutResponse getNextWorkout() {

        SetResponse set1 = new SetResponse(1, 6, "60kg", 180);
        SetResponse set2 = new SetResponse(2, 6, "60kg", 180);

        ExerciseResponse squat = new ExerciseResponse(
                "squat",
                "Back Squat",
                List.of(set1, set2)
        );

        return new NextWorkoutResponse(
                "2026-03-01-A",
                "Full body A",
                120,
                List.of(squat)
        );
    }
}

