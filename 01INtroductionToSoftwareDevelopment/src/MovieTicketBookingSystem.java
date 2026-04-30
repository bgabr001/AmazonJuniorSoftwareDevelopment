public class MovieTicketBookingSystem {
    public static void main(String[] args){
        // Declare and initialize variables
        String firstName = "Sandy";
        String lastName = "Jones";
        String movieTitle = "The Source Code";
        int numberOfTickets = 8;
        double pricePerTicket = 10.57;

        // Print each variable
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Movie Title: " + movieTitle);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.println("Price per ticket in USD: " + pricePerTicket);

        double totalPrice = numberOfTickets * pricePerTicket;
        System.out.println("Total Price of " + numberOfTickets + " tickets: " + totalPrice);

        String username = (firstName + lastName).toLowerCase();
        System.out.println("Username: " + username);

        String movieName = movieTitle.toUpperCase();
        System.out.println("Updated movie name: " + movieName);

        // Booking summary
        System.out.println(
                "Congratulations!! You have successfully booked the tickets\n" +
                        "Username: " + username + "\n" +
                        "Movie: " + movieName + "\n" +
                        "Number of Tickets: " + numberOfTickets + "\n" +
                        "Price per ticket: $" + pricePerTicket + "\n" +
                        "Total price of " + numberOfTickets + " tickets: $" + totalPrice + "\n" +
                        "Thank you for choosing us for booking your movie tickets\n" +
                        "Enjoy your movie!!!"
        );
    }
}
