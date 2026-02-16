# Training Tracker

Android app + Java backend (planned).

## V1 API contract (draft)

### GET /next-workout
Returns the next planned workout.

Response (application/json):
{
  "workoutId": "2026-03-01-A",
  "title": "Full body A",
  "restSecondsDefault": 120,
  "exercises": [
    {
      "exerciseId": "squat",
      "name": "Back Squat",
      "sets": [
        { "setNumber": 1, "reps": 6, "load": "60kg", "restSeconds": 180 },
        { "setNumber": 2, "reps": 6, "load": "60kg", "restSeconds": 180 }
      ]
    }
  ]
}

### POST /workouts/{workoutId}/results
Uploads what was actually performed.

Request (application/json):
{
  "performedAt": "2026-03-01T10:15:00Z",
  "items": [
    { "exerciseId": "squat", "setNumber": 1, "repsDone": 6, "load": "60kg" }
  ]
}

