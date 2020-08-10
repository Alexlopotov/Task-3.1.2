package ru.netology.domain;

public class Radio {
    private int radiostationNumberMin = 0;
    private int radiostationNumberMax = 9;
    private int currentRadiostationNumber;
    private int volumeMax = 10;
    private int volumeMin = 0;
    private int currentVolume;

    public int nextRadiostation(int currentRadiostationNumber) {
        if (currentRadiostationNumber >= radiostationNumberMin & currentRadiostationNumber < radiostationNumberMax) {
            this.currentRadiostationNumber = currentRadiostationNumber + 1;
        }

        if (currentRadiostationNumber == radiostationNumberMax | currentRadiostationNumber < radiostationNumberMin) {
            this.currentRadiostationNumber = radiostationNumberMin;
        }

        if (currentRadiostationNumber > radiostationNumberMax) {
            this.currentRadiostationNumber = radiostationNumberMax;
        }

        return this.currentRadiostationNumber;
    }

    public int prevRadiostation(int currentRadiostationNumber) {
        if (currentRadiostationNumber > radiostationNumberMin & currentRadiostationNumber <= radiostationNumberMax) {
            this.currentRadiostationNumber = currentRadiostationNumber - 1;
        }

        if (currentRadiostationNumber == radiostationNumberMin | currentRadiostationNumber > radiostationNumberMax) {
            this.currentRadiostationNumber = radiostationNumberMax;
        }

        if (currentRadiostationNumber < radiostationNumberMin) {
            this.currentRadiostationNumber = radiostationNumberMin;
        }

        return this.currentRadiostationNumber;
    }

    public int volumeUp(int currentVolume) {
        if (currentVolume >= volumeMin & currentVolume < volumeMax) {
            this.currentVolume = currentVolume + 1;
        }

        if (currentVolume >= volumeMax) {
            this.currentVolume = volumeMax;
        }

        if (currentVolume < volumeMin) {
            this.currentVolume = volumeMin;
        }
        return this.currentVolume;
    }

    public int volumeDown(int currentVolume) {
        if (currentVolume > volumeMin & currentVolume <= volumeMax) {
            this.currentVolume = currentVolume - 1;
        }

        if (currentVolume <= volumeMin) {
            this.currentVolume = volumeMin;
        }

        if (currentVolume > volumeMax) {
            this.currentVolume = volumeMax;
        }
        return this.currentVolume;
    }

}
