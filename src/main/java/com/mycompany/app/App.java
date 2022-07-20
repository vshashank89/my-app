package com.mycompany.app;

import com.MyDep;
import com.github.tomaslanger.chalk.Chalk;
/**
 * Hello world!
 *
 */
public class App
{
    /*public static void main( String[] args )
    {
    	//System.out.println("This message is " + Chalk.on("IMPORTANT").red().underline());
    	Printer p = new Printer();
    	p.print("Printer class invoked");
    }*/

    public int sum(int a,int b){
        MyDep obj = new MyDep();
        return obj.algo(10); // 18
    }
 
}

// Master-slave arch - Jenkins
// Workload distribution or ability to scale.

//Jenkins master - orchestration(ex : schedule the tests on slave)
// Jenkins Agent/Slave - workers(do heavy lifting e.g. run tests)


// Step 1 : Connect slave 
// step 2 : automate build (i.e created a Jenkins job to automate Build of my-app)