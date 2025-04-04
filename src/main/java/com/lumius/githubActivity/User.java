package com.lumius.githubActivity;

/**
 * User -- Record containing the user information from JSON
 */
public record User(
		int id,
		String name,
		String username,
		String email,
		String phone,
		Address address,
		Company company)
		
		 {
/**
 * Address -- User nested class representing a users address
 */
	public record Address(
			String street,
			String suite,
			String city,
			String zipcode,
			Geo geo
			) {
		/**
		 * Geo -- Address nested record representing latitute/longitude coordinates of an address
		 */
		public record Geo(
				String lat,
				String lng
				) {
			
		}
	}
	/**
	 * Company -- User nested record containing information about a user's company
	 */
	public record Company(
			String name,
			String catchphrase,
			String bs
			) {
		

		
	}
}
