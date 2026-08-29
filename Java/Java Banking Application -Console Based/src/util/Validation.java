package util;

import exceptions.ValidationException;

@FunctionalInterface
public interface Validation<T> {
    void validation(T value) throws ValidationException;
}
