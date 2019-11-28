public class Main {


    public static void main(String[] args) {

            int i = 1;
            int sum = 0;
            long nextFib;

            System.out.println("   --------------- Plain --------------- ");
            long preTime=System.currentTimeMillis();
            do {
                nextFib = Fibonacci.fibonacci_plain(i);
                if(nextFib % 2 == 0){
                    sum += nextFib;
                }
                i++;
            } while(nextFib < 4_000_000);
            long postTime=System.currentTimeMillis();

            System.out.println("Sum is " + sum);
            System.out.println("Computation Time (milliseconds) for fibonacci_plain: " +
                (postTime-preTime));

            System.out.println("   --------------- Recursive --------------- ");
            i = 1;
            sum = 0;
            preTime=System.currentTimeMillis();
            do {
                nextFib = Fibonacci.fibonacci_recursive(i);
                if(nextFib % 2 == 0){
                    sum += nextFib;
                }
                i++;
            } while(nextFib < 4_000_000);
            postTime = System.currentTimeMillis();

            System.out.println("Sum is " + sum);
            System.out.println("Computation Time (milliseconds) for fibonacci_recursive: " +
                    (postTime-preTime));


            System.out.println("   --------------- Memoization --------------- ");
            i = 1;
            sum = 0;
            preTime=System.currentTimeMillis();
            do {
                nextFib = Fibonacci.fibonacci_memoization(i);
                if(nextFib % 2 == 0){
                    sum += nextFib;
                }
                i++;
            } while(nextFib < 4_000_000);
            postTime = System.currentTimeMillis();

            System.out.println("Sum is " + sum);
            System.out.println("Computation Time (milliseconds) for fibonacci_memoization: " +
                (postTime-preTime));
        }
    }
