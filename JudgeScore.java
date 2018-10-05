public class JudgeScore {
 public static void main(String[] args) {

  /*
  Created by: GREG WOO
  Program: Simulate how judges score Olympic events.
  This program uses an algorithm that takes 4 integer values (representing judge scores)
   and prints their average, after discarding the highest and lowest score.

   Sample Input:
   1 2 3 4
   Output:
   2.5
  */

  //Declaring the variables for storing the judges scores.
  int judge1, judge2, judge3, judge4;
  judge1 = Integer.valueOf(args[0]);
  judge2 = Integer.valueOf(args[1]);
  judge3 = Integer.valueOf(args[2]);
  judge4 = Integer.valueOf(args[3]);

  // Declaring a boolean for each possible case

  // boolean for the lowest judge
  boolean judge1IsLowest = (judge1 <= judge2) && (judge1 <= judge3) && (judge1 <= judge4);
  boolean judge2IsLowest = (judge2 <= judge1) && (judge2 <= judge3) && (judge2 <= judge4);
  boolean judge3IsLowest = (judge3 <= judge1) && (judge3 <= judge2) && (judge3 <= judge4);
  boolean judge4IsLowest = (judge4 <= judge1) && (judge4 <= judge2) && (judge4 <= judge3);

  // boolean for the highest judge
  boolean judge1IsHighest = (judge1 >= judge2) && (judge1 >= judge3) && (judge1 >= judge4);
  boolean judge2IsHighest = (judge2 >= judge1) && (judge2 >= judge3) && (judge2 >= judge4);
  boolean judge3IsHighest = (judge3 >= judge1) && (judge3 >= judge2) && (judge3 >= judge4);
  boolean judge4IsHighest = (judge4 >= judge1) && (judge4 >= judge2) && (judge4 >= judge3);

  //declaring doubles equal to the sum of values of two different judges
  // these will be used for printing the averages
  double sum1and2, sum1and3, sum1and4, sum2and3, sum2and4, sum3and4;
  sum1and2 = judge1 + judge2;
  sum1and3 = judge1 + judge3;
  sum1and4 = judge1 + judge4;
  sum2and3 = judge2 + judge3;
  sum2and4 = judge2 + judge4;
  sum3and4 = judge3 + judge4;

  /*
  We are now going to go over each possible with if statements
  The logic is the following: We first evaluate which judge is the lowest, then which one is the highest
  then we print the average of the two remaining judges
  */

  // CASE 1: judge1 is the Lowest...
    if (judge1IsLowest) {

         //... and judge2 is the Highest
         if (judge2IsHighest) {
           System.out.println(sum3and4/2);

         //... and judge3 is the Highest
         } else if (judge3IsHighest) {
           System.out.println(sum2and4/2);

         //... and judge4 is the Highest
         } else  {
           System.out.println(sum2and3/2);
         }


  //CASE 2: judge2 is the Lowest...
    } else if (judge2IsLowest) {

         //... and judge1 is the Highest
         if (judge1IsHighest) {
           System.out.println(sum3and4/2);

         //... and judge3 is the Highest
         } else if (judge3IsHighest) {
           System.out.println(sum1and4/2);

         //... and judge4 is the Highest
         } else  {
           System.out.println(sum1and3/2);
         }


  // CASE 3: judge3 is the Lowest...
    } else if (judge3IsLowest) {

         //... and judge1 is the Highest
         if (judge1IsHighest) {
           System.out.println(sum2and4/2);

         //... and judge2 is the Highest
         } else if (judge2IsHighest) {
           System.out.println(sum1and4/2);

         //... and judge4 is the Highest
         } else  {
           System.out.println(sum1and2/2);
         }


 //CASE 4: judge4 is the Lowest...
    } else  {

         //... and judge1 is the Highest
         if (judge1IsHighest) {
           System.out.println(sum2and3/2);

         //... and judge3 is the Highest
         } else if (judge3IsHighest) {
           System.out.println(sum1and2/2);

         //... and judge2 is the Highest
         } else  {
           System.out.println(sum1and3/2);
         }
    }

 }
}
