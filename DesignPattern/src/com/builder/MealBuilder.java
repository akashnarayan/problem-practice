package com.builder;

public class MealBuilder {

	private String starter;
	private String soup;
	private String maincourse;
	private String desserts;
	private String masalacoke;
	private String paan;

	private MealBuilder(Builder builder) {
		this.starter = builder.starter;
		this.soup = builder.soup;
		this.maincourse = builder.maincourse;
		this.desserts = builder.desserts;
		this.masalacoke = builder.masalacoke;
		this.paan = builder.paan;
	}

	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {
		private String starter;
		private String soup;
		private String maincourse;
		private String desserts;
		private String masalacoke;
		private String paan;

		private Builder() {
		}

		public Builder withStarter(String starter) {
			this.starter = starter;
			return this;
		}

		public Builder withSoup(String soup) {
			this.soup = soup;
			return this;
		}

		public Builder withMaincourse(String maincourse) {
			this.maincourse = maincourse;
			return this;
		}

		public Builder withDesserts(String desserts) {
			this.desserts = desserts;
			return this;
		}

		public Builder withMasalacoke(String masalacoke) {
			this.masalacoke = masalacoke;
			return this;
		}

		public Builder withPaan(String paan) {
			this.paan = paan;
			return this;
		}

		public MealBuilder build() {
			return new MealBuilder(this);
		}
	}
	
}
