public class Main {
    private static ValidatePhone validatePhoneNumber;
    public static final String[] validPhoneNUmber = { "(84)-(0925817335)" };
    public static final String[] invalidPhoneNUmber = { "(a8)-(222222222)" };

    public static void main(String[] args) {
        validatePhoneNumber = new ValidatePhone();
        for (String phoneNumber: validPhoneNUmber) {
            boolean isValid = validatePhoneNumber.validate(phoneNumber);
            System.out.println("Phone number is " + phoneNumber + " is valid: " + isValid);
        }
        for (String phoneNumber: invalidPhoneNUmber) {
            boolean isValid = validatePhoneNumber.validate(phoneNumber);
            System.out.println("Phone number is " + phoneNumber + " is valid: " + isValid);
        }
    }
}
