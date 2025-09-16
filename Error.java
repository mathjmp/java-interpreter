class Error {

    public static void with(int line, String message) {
        report(line, "", message);
    }

    public static void report(int line, String where, String message) {
        System.err.println(String.format("[line %s] Error%s: %s", line, where , message));
    }
}