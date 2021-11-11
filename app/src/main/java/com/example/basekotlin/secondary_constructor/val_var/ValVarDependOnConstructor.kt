package com.example.basekotlin.secondary_constructor.val_var

class ValVarDependOnConstructor {

    /**
     * As we can see below: primary conctsructor could have val and var properties,
     * but secondary (or in other words custom constructor) not
     */

    class PrimaryConstructor(val str: String) {}
//    class SecondaryConstructor{
//        constructor(val str: String) {}
//    }

}