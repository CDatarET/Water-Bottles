class Solution {
    //ones with remainders do not work
    public int numWaterBottles(int numBottles, int numExchange) {
        int drink = numBottles;
        int emp = numBottles;

        while(emp >= numExchange){
            drink = drink + emp / numExchange;
            emp = emp / numExchange + (emp % numExchange);
        }
        return(drink);
    }
}
