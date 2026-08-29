class ProblemsSolvedByoptionals {

    // This method searches for an email using the given ID.
    // Problem: If the email is not found, we return null.
    public static String findMyEmail(int id) {

        if (id == 1) {
            return "shehzadnisar07@gmail.com";
        }

        // ❌ Returning null means "no email found".
        // This can cause NullPointerException
        // when we try to use the returned value.
        return null;
    }

    static void main() {

        // Here id = 11, so findMyEmail() returns null.
        String email = findMyEmail(11);

        System.out.println("before:");

        // ❌ PROBLEM:
        // email is null, so calling .length() on it
        // causes NullPointerException.
        //
        // null.length()  → ❌ NullPointerException
        System.out.println(email.length());

        System.out.println("after");
    }
}