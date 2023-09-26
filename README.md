# Weatherapp_Backend
Springboot
# Getting Started with Spring Boot and MySQL Workbench

This guide will walk you through the steps to set up and start a new Spring Boot project, as well as download and run MySQL Workbench for database management.

## Prerequisites

Before you begin, make sure you have the following prerequisites installed:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Maven](https://maven.apache.org/download.cgi)
- [MySQL Workbench](https://dev.mysql.com/downloads/workbench/)
- https://spring.io/tools
- 
## Add this query to the mysql work-bench
-- Inserting dummy data for 100 entries with Indian city names
INSERT INTO weather_data (location, weatherCondition, temperature, humidity) VALUES
    ('Mumbai', 'Sunny', 28.5, 55.0),
    ('Delhi', 'Cloudy', 23.0, 75.5),
    ('Bangalore', 'Rainy', 15.5, 90.0),
    ('Kolkata', 'Partly Cloudy', 25.7, 60.5),
    ('Chennai', 'Thunderstorm', 19.3, 85.0),
    ('Hyderabad', 'Foggy', 14.0, 92.0),
    ('Pune', 'Clear', 30.0, 50.0),
    ('Ahmedabad', 'Misty', 22.8, 70.0),
    ('Jaipur', 'Windy', 26.4, 45.0),
    ('Lucknow', 'Snowy', 0.5, 98.0),
    ('Kanpur', 'Hail', 4.2, 75.5),
    ('Nagpur', 'Sleet', 7.8, 88.0),
    ('Indore', 'Overcast', 20.1, 72.0),
    ('Thane', 'Tornado', 32.2, 30.0),
    ('Bhopal', 'Dust Storm', 18.9, 62.5),
    ('Visakhapatnam', 'Blizzard', -5.3, 100.0),
    ('Agra', 'Frosty', 2.1, 96.0),
    ('Ludhiana', 'Hazy', 12.6, 80.0),
    ('Ranchi', 'Drizzle', 10.7, 86.0),
    ('Coimbatore', 'Hailstorm', 4.0, 78.0),
    ('Surat', 'Windy', 27.3, 50.0),
    ('Vadodara', 'Clear', 29.8, 42.0),
    ('Nashik', 'Sunny', 29.5, 49.5),
    ('Varanasi', 'Foggy', 14.2, 90.0),
    ('Madurai', 'Rainy', 17.5, 87.5),
    ('Meerut', 'Cloudy', 24.8, 68.0),
    ('Rajkot', 'Misty', 22.1, 73.5),
    ('Jabalpur', 'Partly Cloudy', 26.0, 53.0),
    ('Srinagar', 'Snowy', 1.8, 97.0),
    ('Amritsar', 'Hail', 5.0, 78.0),
    ('Aligarh', 'Sleet', 8.4, 84.5),
    ('Bikaner', 'Overcast', 19.7, 64.0),
    ('Agartala', 'Tornado', 33.5, 29.0),
    ('Udaipur', 'Dust Storm', 17.2, 70.5),
    ('Tirunelveli', 'Blizzard', -6.0, 100.0),
    ('Yamunanagar', 'Frosty', 1.0, 95.5),
    ('Shillong', 'Hazy', 11.4, 81.0),
    ('Dibrugarh', 'Drizzle', 9.3, 89.0),
    ('Gangtok', 'Hailstorm', 3.5, 75.0);



## Import Your Project:

If your Spring Boot project is not already imported into STS, you can import it by going to the "File" menu and selecting "Import."

In the Import dialog, expand the "Maven" folder and select "Existing Maven Projects," then click "Next."

Browse to the directory where your Spring Boot project is located and click "Finish." Your project should now appear in the Project Explorer.

## Locate the Main Application Class:

In the Project Explorer on the left, find the main class of your Spring Boot application. This class typically has the @SpringBootApplication annotation and a public static void main(String[] args) method.
Run the Spring Boot Application:

## Right-click on the main application class.

From the context menu that appears, select "Run As" and then "Spring Boot App."

STS will build and run your Spring Boot application. You can monitor the application's progress and view any log messages in the Console window at the bottom of the IDE.

Access Your Application:

## Once the application is running, you can access it in a web browser by navigating to the specified URL, which is usually http://localhost:8080.


or

    ## Getting Started

To run this project locally, you'll first need to clone the repository to your computer:

1. Open your terminal or command prompt.
2. Navigate to the directory where you want to store the project.
3. Run the following command to clone the repository:

   ```bash
   git clone https://github.com/saurav8617/Weatherapp_Backend.git

   Open Spring Tool Suite (STS): Launch the Spring Tool Suite IDE.



