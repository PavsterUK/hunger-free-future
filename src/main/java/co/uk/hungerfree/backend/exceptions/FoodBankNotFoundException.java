package co.uk.hungerfree.backend.exceptions;

public class FoodBankNotFoundException extends  RuntimeException{
    public FoodBankNotFoundException(String id) {
        super("Could not find food bank " + id);
    }
}
