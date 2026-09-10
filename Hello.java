class Hello {
    public void greet(String name) {
        System.out.println("Hey there, " + name + "!");
    }
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.greet("friends");
    }
}