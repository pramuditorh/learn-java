package pramudito.rh.util;

import pramudito.rh.annotation.NotBlank;
import pramudito.rh.data.LoginRequest;
import pramudito.rh.error.BlankException;
import pramudito.rh.error.ValidationException;

import java.lang.reflect.Field;

public class ValidationUtil {

    // Checked Exception perlu throws Exception
    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationException("Username is blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new ValidationException("Password is blank");
        }
    }

    // Runtime Exception tidak perlu throws Exception
    public static void validateRuntime(LoginRequest loginRequest) {
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new BlankException("Username is blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new BlankException("Password is blank");
        }
    }

    // Membuat validasi untuk anotasi NotBlank
    public static void validationReflection(Object object) {
        // Mendapatkan object class nya
        Class aClass = object.getClass();

        // Mengambil seluruh field termasuk private field pada sebuah class
        Field[] fields = aClass.getDeclaredFields();

        for (var field : fields) {
            // Jika ada private field, set accessible private field menjadi true
            field.setAccessible(true);

            if (field.getAnnotation(NotBlank.class) != null) {
                // Proses validasi NotBlank
                try {
                    String value = (String) field.get(object);

                    if (value == null || value.isBlank()) {
                        throw new BlankException("Field " + field.getName() + " is blank ");
                    }

                } catch (IllegalAccessException exception) {
                    System.out.println("Tidak bisa mengakses field " + field.getName());
                }
            }

        }
    }
}
