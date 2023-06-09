package org.course;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double areaReqPaint = width * height;
        double hasPaint = areaPerBucket * (double) extraBuckets;
        double bucketsNeeded = areaReqPaint - hasPaint;
        int bucketsCount = 0;
        while (bucketsNeeded > 0) {
            bucketsNeeded -= areaPerBucket;
            bucketsCount++;
        }
        return bucketsCount;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double areaReqPaint = width * height;
        int bucketsCount = 0;
        while (areaReqPaint > 0) {
            areaReqPaint -= areaPerBucket;;
            bucketsCount++;
        }
        return bucketsCount;
    }

    public static int getBucketCount(double area,double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        int bucketsCount = 0;
        while (area > 0) {
            area -= areaPerBucket;
            bucketsCount++;
        }
        return bucketsCount;
    }
}
