package builderPattern;

public class BuilderClass {
    private String id;
    private String name;

    public BuilderClass(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public static class Builder {
        private String id;
        private String name;

        public Builder id(String value) {
            this.id = value;
            return this;
        }

        public Builder name(String value) {
            this.name = value;
            return this;
        }

        public BuilderClass build() {
            return new BuilderClass(this);
        }
    }
}
