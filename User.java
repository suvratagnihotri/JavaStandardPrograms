package com.java.StandardPrograms;

import java.util.Date;
/**
 * In this Program I am Writing an immutable class via the Builder
 * pattern.
 * Builder Pattern - Builder Pattern is used to create a class in which we have required fields and 
 * optional fields.
 * Without builder Pattern we have to create multiple Constructors for the same class, with different parameters.
 * @author Suvrat Agnihotri
 *
 */
//User class has three required fields(nickname, password and created) and 
//three optional fields ( email, firstName and lastName)
public class User {
	
	private final String nickName;
	private final String password;
	private final Date created;
	private final String email;
	private final String firstName;
	private final String lastName;
	
	//Constructor of User Class , Passing userBuilder class as a parameter.
	private User(UserBuilder builder ) {
		this.nickName = builder.nickName;
		this.password = builder.password;
		this.created = builder.created;
		this.email = builder.email;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
	}
	
	//getBuilder() method with return type of UserBuilder class, creating new Object of User class with userBuilder class.
	public static UserBuilder getBuilder(String nickName, String password) {
		return new User.UserBuilder(nickName, password);	
	}
	
	//UserBuilder class
	public static final class UserBuilder{
		private final String nickName;
		private final String password;
		private final Date created;
		private String email;
		private String firstName;
		private String lastName;
		
		public UserBuilder(String nickName, String password) {
			this.nickName = nickName;
			this.password = password;
			this.created = new Date();
			}
		
		public UserBuilder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		public UserBuilder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		public UserBuilder email(String email) {
			this.email = email;
			return this;
		}
		public User build() {
			return new User(this);
		}
	}
		public String getNickname() {
		return nickName;
		}
		public String getPassword() {
		return password;
		}
		public String getFirstname() {
		return firstName;
		}
		public String getLastname() {
		return lastName;
		}
		public String getEmail() {
		return email;
		}
		public Date getCreated() {
		return new Date(created.getTime());
		}

		public static void main(String args[]) {
			User user1 = getBuilder("marin21", "hjju9887h").build();
			// user with nickname, password and email
			User user2 = getBuilder("ionk", "44fef22")
			.email("ion@gmail.com")
			.build();
			// user with nickname, password, email, firstname and lastname
			User user3 = getBuilder("monika", "klooi0988")
			.email("monika@gmail.com")
			.firstName("Monika")
			.lastName("Ghuenter")
			.build();
			
			System.out.println(user1);
			System.out.println(user2);
			System.out.println(user3);
		}
		
		@Override 
		public String toString() {
			StringBuffer str = new StringBuffer();
			str.append("NickName: " + getNickname() +" Created On: "+ getCreated() + " Password: "+ getPassword() + " FirstName: "+ getFirstname() + " LastName: "+ getLastname()+ " Email: " + getEmail());
			return str.toString();
		}
}
