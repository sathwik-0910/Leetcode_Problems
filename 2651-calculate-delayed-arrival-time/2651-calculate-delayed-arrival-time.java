class Solution {
    public int findDelayedArrivalTime(int at, int dt) {
        if(at+dt <24) return at+dt;
        return (at+dt)-24;  
    }
}