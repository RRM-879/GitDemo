void main() {

    // The purpose of this is to try and tackle the new format warnings for Strings and to learn something new.
    String intro = "Hello, this is my reintroduction to Git, Java and IntelliJ after a long absence.";
    String outro = "This has been a test of IntelliJ and Git to get it to work together";

    String message = "%s".formatted(intro);
    //IO.println(String.format("Hello, this is my reintroduction to Git, Java and IntelliJ after a long absence."));
    IO.println(message);

    // The purpose of this test program is to re-learn what I've forgotten about version control, git and managing projects.

    // For this, I wish to count to 10 and display the incremental counter 'i's' value
    for (int i = 1; i <= 10; i++) {

        IO.println("i = " + (i + i));
    }

    //IO.println(String.format("This has been a test of IntelliJ and Git to get it to work together."));
    IO.println("%s".formatted(outro));
}
