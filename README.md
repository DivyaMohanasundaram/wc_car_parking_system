# CarParking System
   # The endpoint is being calculated base on Direction Mapping as follows

            N                           Vertical
            |                           |
            |                           |
            |                           |
    W---------------E                   |
            |                           |
            |                           |
            |                           |------------------------- Hoizontal
            S


     * As per the direction, the direction mapping has been configured in the code.
            Ex. For North -> Left is West, Right is East
                    East -> Left is North, Right is South


     * Based on the input( left or right) the current direction will be identified and indexes
       Vertical and Horizontal will be adjusted as follows
                  - If the direction is North , vertical+1
                    If the direction is South , vertical -1
                    If  the direction is East , Horizontal+1
                    If  the direction is West , Horizontal-1

   # Highlights -
     * Complexity of this Algorithm is O(n)
     * Implementation class -  src\main\java\org\com\wc\CarParkingSystem.java
     * Test  class -  src\test\java\org\com\wc\CarParkingSystemTest.java

   # How to Run
      1. mvn test or
      2. java CarParkingSystem

