public class Exceptions {
    public static void main(String[] args) {
        try {
            int errorProneInt = 100 / 0;
        } catch (ArithmeticException ex) {
            System.out.println("Can't divide by zero");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } catch (Exception ex) {
            System.out.println("We can catch all exceptions like this but it is not a very good practise");
            // Notice that the exception was already caught by the first catch block so this doesn't run
            // catch blocks run in a top to down fashion
            // Also note you can't reverse the orders of these catch blocks as all exceptions would be caught by
            // the first `catch (Exception ex)` and the other one will be redundant
        } finally {
            System.out.println("We do cleanup here, like closing files and stuff");
        }
    }
}
