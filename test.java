public class CodeSmellsExample {

    // Example of duplicated code
    public void duplicateCodeExample() {
        int x = 10;
        int y = 20;
        int z = x + y;
        System.out.println("Sum: " + z);
    }

    // Example of a long method
    public void longMethodExample() {
        System.out.println("Step 1");
        // ... many more steps
        System.out.println("Step 20");
    }

    // Example of a class with too many responsibilities
    class LargeClassExample {
        public void methodOne() {
            // Method implementation
        }

        public void methodTwo() {
            // Method implementation
        }

        // ... other methods
    }

    // Example of inappropriate comments
    public void inappropriateCommentsExample() {
        // This method adds two numbers
        public int add(int a, int b) {
            // Adding two numbers
            return a + b;
        }
    }

    // Example of feature envy
    class FeatureEnvyExample {
        private int data;

        public void processData(int value) {
            this.data = value;
        }

        public int calculateSomething() {
            // Example of excessive use of another class's methods or data
            SomeOtherClass otherClass = new SomeOtherClass();
            return otherClass.performCalculation(this.data);
        }
    }
}
