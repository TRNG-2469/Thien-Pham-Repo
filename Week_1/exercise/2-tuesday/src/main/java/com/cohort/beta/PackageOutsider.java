package com.cohort.beta;

import com.cohort.alpha.AccessHolder;

public class PackageOutsider {

    public static void main(String[] args) {

        AccessHolder holder = new AccessHolder();

        holder.publicMethod();

        // holder.protectedMethod();
        // Compiler error: protectedMethod() has protected access in AccessHolder.
        // PackageOutsider is in a different package and is not a subclass.

        // holder.defaultMethod();
        // Compiler error: defaultMethod() is not public in AccessHolder
        // and cannot be accessed from outside the com.cohort.alpha package.

        // holder.privateMethod();
        // Compiler error: privateMethod() has private access in AccessHolder.
        // Private methods are accessible only inside AccessHolder itself.
    }
}