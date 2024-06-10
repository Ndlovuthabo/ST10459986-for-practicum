# ST10459986-for-practicum
PSEAUDOCODE 


// Define an array to store weather conditions for the selected days
weather_conditions = ["", "", "", ""]

// Define constants for indexing the days in the array
const MONDAY_INDEX = 0
const TUESDAY_INDEX = 1
const SATURDAY_INDEX = 2
const SUNDAY_INDEX = 3

// Function to record weather condition
function recordWeatherCondition(day, condition) {
    if day == "Monday" then
        weather_conditions[MONDAY_INDEX] = condition
    else if day == "Tuesday" then
        weather_conditions[TUESDAY_INDEX] = condition
    else if day == "Saturday" then
        weather_conditions[SATURDAY_INDEX] = condition
    else if day == "Sunday" then
        weather_conditions[SUNDAY_INDEX] = condition
    else
        print "Weather condition recording is only available for Monday, Tuesday, Saturday, and Sunday."
    end if
end function

// Function to retrieve weather condition
function getWeatherCondition(day) {
    if day == "Monday" then
        return weather_conditions[MONDAY_INDEX]
    else if day == "Tuesday" then
        return weather_conditions[TUESDAY_INDEX]
    else if day == "Saturday" then
        return weather_conditions[SATURDAY_INDEX]
    else if day == "Sunday" then
        return weather_conditions[SUNDAY_INDEX]
    else
        print "Weather condition retrieval is only available for Monday, Tuesday, Saturday, and Sunday."
        return null
    end if
end function

// Example usage:
// Record weather conditions
recordWeatherCondition("Monday", "Sunny")
recordWeatherCondition("Tuesday", "Rainy")
recordWeatherCondition("Saturday", "Cloudy")
recordWeatherCondition("Sunday", "Windy")

// Retrieve weather conditions
print "Monday: " + getWeatherCondition("Monday")
print "Tuesday: " + getWeatherCondition("Tuesday")
print "Saturday: " + getWeatherCondition("Saturday")
print "Sunday: " + getWeatherCondition("Sunday")

POWER POINT PRESENTATION
![Screenshot (12)](https://github.com/Ndlovuthabo/ST10459986-for-practicum/assets/164686352/a873584b-d417-4047-b1e5-2100bc8ca829)
![Screenshot (19)](https://github.com/Ndlovuthabo/ST10459986-for-practicum/assets/164686352/46b6106f-673a-4164-94f4-b4dcee8a0152)



