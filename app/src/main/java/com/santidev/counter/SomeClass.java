package com.santidev.counter;

import android.util.Log;


public class SomeClass {
    int day;
    public void aMethod(){
        String str = "S";
        class AnonymousClass{
            int variable;
            public AnonymousClass(){

            }

            private void sayHello(){
                Log.i("Hola", "sayHello: "+str+variable);

            }
        }
    }

    public class InnerClass{
        int age;
        String name;
        public InnerClass(){

        }

        public int addOne(){
            return this.age+1;
        }

        public void innerMethod(){
            day = day+1;
        }

    }
}

