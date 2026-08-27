package util;

import exceptions.ValidationException;

@FunctionalInterface
public interface Validation<String> {
    void validation(String value) throws ValidationException;
}
