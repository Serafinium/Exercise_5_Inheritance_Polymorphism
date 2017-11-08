package com.kysylytsia;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args){

        Bird[] birds = new Bird[4];
        birds[0] = new Eagle(true, true);
        birds[1] = new Swallow(true, true);
        birds[2] = new Penguin(false, true);
        birds[3] = new Chicken(true, true);

        for(Bird bird: birds){
            System.out.print(bird + ": ");
            bird.fly();
            if(bird instanceof FlyingBird){
                System.out.println("lay Eggs: " + ((FlyingBird)bird).layEggs);
                System.out.println("Flying Bird: " + ((FlyingBird)bird).feathers);
            } else{
                System.out.println("lay Eggs: " + ((NonFlyingBird)bird).layEggs);
                System.out.println("Flying Bird: " + ((NonFlyingBird)bird).feathers);
            }
            System.out.println();
        }



    }
}
