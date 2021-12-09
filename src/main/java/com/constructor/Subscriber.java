package com.constructor;

enum ClassType {
    PREPAID,
    POSTPAID,
    AICE,
    VPN
}

public class Subscriber {

	public static class Builder {
		private Integer id;
		private String name;
		private ClassType class_type;
		private Bucket main_bucket;
		private Bucket data_bucket;
				
		public Builder withId(final Integer id) {
            this.id = id;
            return this;
        }
		
		public Builder withName(final String name) {
            this.name = name;
            return this;
        }
		
		public Builder withClassType(final ClassType classType) {
            this.class_type = classType;
            return this;
        }
		
		public Builder withMainBucket(final Bucket bucket) {
            this.main_bucket = bucket;
            return this;
        }
		
		public Builder withDataBucket(final Bucket bucket) {
            this.data_bucket = bucket;
            return this;
        }
		
		public Subscriber build() {
            if (id == null ||
                name == null ||
                class_type == null) {
                throw new IllegalStateException("Cannot create Subscriber");
            }

            return new Subscriber(
                    id,
                    name,
                    class_type,
                    main_bucket,
                    data_bucket);
        }
	}
	
	private final  Integer id;
	private final  String name;
	private final  ClassType class_type;
	private final  Bucket main_bucket;
	private final  Bucket data_bucket;
	
	private Subscriber(
			final Integer id,
			final String name,
			final ClassType class_type,
			final Bucket main_bucket,
			final Bucket data_bucket) {
		this.id=id;
		this.name=name;
		this.class_type=class_type;
		this.main_bucket=main_bucket;
		this.data_bucket=data_bucket;
	}

	@Override
	public String toString() {
		return "Subscriber [id=" + id + ", name=" + name + ", class_type=" + class_type + ", main_bucket=" + main_bucket
				+ ", data_bucket=" + data_bucket + "]";
	}	
}
