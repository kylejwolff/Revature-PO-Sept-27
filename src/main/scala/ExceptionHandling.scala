import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException
object ExceptionHandling{
    def main(args: Array[String]){
        println("\u001b[2J")
        println("An Exception is an unwanted or unexpected event that can or may cause " +
          "\na program to end unexpectedly or enter an unwanted or unstable state.")
        println("Press any key to continue")
        try{readChar()}catch{case e: StringIndexOutOfBoundsException => {/*do nothing*/}}
        println("\u001b[2J")
        println("Exceptions in scala work the same way as in C++ or Java." +
          "\nWhen an exception occurs, the current operation is aborted," +
          "\nand the runtime system looks for an exception handler that can" +
          "\nhandle the thrown exception. Control resumes inside the handler." +
          "\nIf no handler exists, the program terminates.")
        println("Press any key to continue")
        try{readChar()}catch{case e: StringIndexOutOfBoundsException => {/*do nothing*/}}
        println("\u001b[2J")
        println("In this example, we'll try diviing by zero to catch" +
          "\nan Arithmetic Excpetion")
        println("try" +
          "\n{" +
          "\n\tvar N = 5/0" +
          "\n{" +
          "\ncatch" +
          "\n{" +
          "\n\tcase e: ArithmeticException =>" +
          "\n\t{" +
          "\n\t\tprintln(\"Arithmetic Exception occurred.\"" +
          "\n\t}" +
          "\n}")
        println("Press any key to continue")
        try{readChar()}catch{case e: StringIndexOutOfBoundsException => {/*do nothing*/}}
        try 
        {
          var N = 5/0
        }
        catch
        {
          case e: ArithmeticException =>
          {
            println("Arithmetic Exception occurred.")
          }
        }
        println("Press any key to continue")
        try{readChar()}catch{case e: StringIndexOutOfBoundsException => {/*do nothing*/}}
        println("\u001b[2J")   
        println("In this example, we're trying to open a file that either doesn't" +
          "\nexist or the path to the file is incorrect.  This will throw a" +
          "\nFileNotFoundException\n")
        println("try" +
          "\n{" +
          "\n\tval t = new FileReader(\"input.txt\")" +
          "\n}" +
          "\ncatch" +
          "\n{" +
          "\n\tcase e: FileNotFoundException =>" +
          "\n\t{" +
          "\n\t\tprintln(\"FileNotFoundException: file missing or invalid path\")" +
          "\n\t}" +
          "\n}")
        println("Press any key to continue")
        try{readChar()}catch{case e: StringIndexOutOfBoundsException => {/*do nothing*/}}
        try
        {
          val t = new FileReader("input.txt")
        }
        catch
        {
          case e: FileNotFoundException =>
          {
            println("FileNotFoundException: file missing or invalid path")
          }
        }
        println("Press any key to continue")
        try{readChar()}catch{case e: StringIndexOutOfBoundsException => {/*do nothing*/}}
        println("\u001b[2J")  
        println("In Scala, we use the Throw keyword to throw our own exceptions." +
          "\nScala treats all exceptiosn as runtime exceptions only, so it won't" +
          "\nforce us to handle them explicitly, instead uses pattern matching" +
          "\nin a catch block. Also, the Throw expression has a return type of Nothing")
        println("Press any key to continue")
        try{readChar()}catch{case e: StringIndexOutOfBoundsException => {/*do nothing*/}}
        println("\u001b[2J")
        println("In this example, we'll throw our own Exception inside of a condition statement" +
          "\nIn this first case, n will be an odd number and the program will run normally")
        println("def isItOdd(n:Int)=" +
          "\n{" +
          "\n\tif(n % 2 == 0)" +
          "\n\t{" +
          "\n\t\tthrow new Exception(\"n is an even number: \" + n)" +
          "\n\t}" +
          "\n\telse" +
          "\n\t{" +
          "\n\t\tprintln(\"n is an odd number: \" + n)" +
          "\n\t}" +
          "\n}" +
          "\nisItOdd(7)")
        def isItOdd(n:Int)=
        {
          if(n % 2 == 0)
          {
            throw new Exception("n is an even number: " + n)
          }
          else
          {
            println("n is an odd number: " + n)
          }
        }
        println("Press any key to continue")
        try{readChar()}catch{case e: StringIndexOutOfBoundsException => {/*do nothing*/}}
        println("\u001b[2J")
        isItOdd(7)
        println("Press any key to continue")
        try{readChar()}catch{case e: StringIndexOutOfBoundsException => {/*do nothing*/}}
        println("\u001b[2J")
        println("In this next example, using the same isItOdd() function, n will" +
          "\nbe an even number and our program will terminate with an unhandled exception")
        println("def isItOdd(n:Int)=" +
          "\n{" +
          "\n\tif(n % 2 == 0)" +
          "\n\t{" +
          "\n\t\tthrow new Exception(\"n is an even number: \" + n)" +
          "\n\t}" +
          "\n\telse" +
          "\n\t{" +
          "\n\t\tprintln(\"n is an odd number: \" + n)" +
          "\n\t}" +
          "\n}" +
          "\nisItOdd(8)")
        println("Press any key to continue")
        try{readChar()}catch{case e: StringIndexOutOfBoundsException => {/*do nothing*/}}
        println("\u001b[2J")
        isItOdd(8)

    }
}