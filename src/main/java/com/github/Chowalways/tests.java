package com.github.Chowalways;

import java.util.Arrays;

public class tests {
    private final double[] e;

    public tests(double a, double b, double c) {
        this.e = new double[]{a, b, c};
        Arrays.sort(this.e);
    }

    public String getType() {
        if (e[0] + e[1] <= e[2]) {
            return "Not a triangle";
        }
        if (e[0] * e[0] + e[1] * e[1] > e[2] + e[2]) {
            return "acute angle triangle";
        }
        if (e[0] * e[0] + e[1] * e[1] == e[2] + e[2]) {
            return "right angle triangle";
        }
        return "obtuse angle triangle";
    }
}
