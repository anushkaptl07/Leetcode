class Solution {
    
    public double angleClock(int hour, int minutes) {
        double hourAngle=(hour%12)*30+minutes*0.5;
        double mAngle = minutes*6;
        double diff = Math.abs(hourAngle-mAngle);
        return Math.min(diff,360-diff);
    }
}