package com.cohort.alpha;

public class PackageNeighbor {

    public static void main(String[] args) {

        AccessHolder holder = new AccessHolder();

        holder.publicMethod();
        holder.protectedMethod();
        holder.defaultMethod();

        // holder.privateMethod();
        // Cannot compile because private methods are only accessibl within the AccessHolder class where they are declared.
    }
}