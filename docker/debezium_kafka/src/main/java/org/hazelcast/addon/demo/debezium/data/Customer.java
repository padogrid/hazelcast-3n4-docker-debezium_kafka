package org.hazelcast.addon.demo.debezium.data;

import java.io.IOException;


import com.hazelcast.nio.serialization.PortableReader;
import com.hazelcast.nio.serialization.PortableWriter;
import com.hazelcast.nio.serialization.VersionedPortable;

/**
  * Customer is generated code. To modify this class, you must follow the
  * guidelines below.
  * <ul>
  * <li>Always add new fields and do NOT delete old fields.</li>
  * <li>If new fields have been added, then make sure to increment the version number.</li>
  * </ul>
  *
  * @generator com.netcrest.pado.tools.hazelcast.VersionedPortableClassGenerator
  * @schema debezium.inventory-customers.schema
  * @date Sun Mar 22 16:14:45 EDT 2020
**/
public class Customer implements VersionedPortable
{
	private long id;
	private String firstName;
	private String lastName;
	private String email;

	public Customer()
	{
	}

	public void setId(long id) {
		this.id=id;
	}

	public long getId() {
		return this.id;
	}

	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setLastName(String lastName) {
		this.lastName=lastName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setEmail(String email) {
		this.email=email;
	}

	public String getEmail() {
		return this.email;
	}


	@Override
	public int getClassId() 
	{
		return PortableFactoryImpl.Customer_CLASS_ID;
	}

	@Override
	public int getFactoryId() {
		return PortableFactoryImpl.FACTORY_ID;
	}
	
	@Override
	public int getClassVersion() {
		return 1;
	}

	@Override
	public void writePortable(PortableWriter writer) throws IOException {
		writer.writeLong("id", id);
		writer.writeUTF("firstName", firstName);
		writer.writeUTF("lastName", lastName);
		writer.writeUTF("email", email);
	}

	@Override
	public void readPortable(PortableReader reader) throws IOException {
		this.id = reader.readLong("id");
		this.firstName = reader.readUTF("firstName");
		this.lastName = reader.readUTF("lastName");
		this.email = reader.readUTF("email");
	}
    
	@Override
	public String toString()
	{
		return "[email=" + this.email
			 + ", firstName=" + this.firstName
			 + ", id=" + this.id
			 + ", lastName=" + this.lastName + "]";
	}
}
