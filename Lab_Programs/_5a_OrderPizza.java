/* Question:
5a. create an enum: size which indicates the size of pizza: small, medium, large. create a class called test which has an instance of size, constructor, method called order pizza which has a switch statement in it having case labels of size.
a driver class for main method creates an instance if test and orders pizza
 */

 enum Size {
    SMALL,
    MEDIUM,
    LARGE;
}

class Test {

    Size PizzaSize;

    Test(Size PizzaSize) {
        this.PizzaSize = PizzaSize;
    }

    public void orderPizza() {
        switch(PizzaSize) {
            case SMALL:
                System.out.println("I have ordered Small Pizza");
                break;
            case MEDIUM:
                System.out.println("I have ordered Regular Pizza");
                break;
            case LARGE:
                System.out.println("I have ordered Large Pizza");
                break;
            default:
                System.out.println("I have not ordered the Pizza");
                break;
        }
    }
}

public class _5a_OrderPizza {
    public static void main(String[] args) {
        Test pizza = new Test(Size.SMALL);
        pizza.orderPizza();
    }
}


/*
develop a rock, paper, scissor, game:
rule: rock beats the scissor, scissor cuts the paper, paper covers rock
 */