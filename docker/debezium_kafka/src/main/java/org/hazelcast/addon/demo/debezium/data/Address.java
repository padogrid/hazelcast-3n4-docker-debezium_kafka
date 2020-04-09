package org.hazelcast.addon.demo.debezium.data;

import java.io.IOException;


import com.hazelcast.nio.serialization.PortableReader;
import com.hazelcast.nio.serialization.PortableWriter;
import com.hazelcast.nio.serialization.VersionedPortable;

/**
  * Address is generated code. To modify this class, you must follow the
  * guidelines below.
  * <ul>
  * <li>Always add new fields and do NOT delete old fields.</li>
  * <li>If new fields have been added, then make sure to increment the version number.</li>
  * </ul>
  *
  * @generator com.netcrest.pado.tools.hazelcast.VersionedPortableClassGenerator
  * @schema debezium.inventory-addresses.schema
  * @date Sun Mar 22 16:14:45 EDT 2020
**/
public class Address implements VersionedPortable
{
	private long id;
	private long customerId;
	private String street;
	private String city;
	private String state;
	private long zip;
	private String type;

	public Address()
	{
	}

	public void setId(long id) {
		this.id=id;
	}

	public long getId() {
		return this.id;
	}

	public void setCustomerId(long customerId) {
		this.customerId=customerId;
	}

	public long getCustomerId() {
		return this.customerId;
	}

	public void setStreet(String street) {
		this.street=street;
	}

	public String getStreet() {
		return this.street;
	}

	public void setCity(String city) {
		this.city=city;
	}

	public String getCity() {
		return this.city;
	}

	public void setState(String state) {
		this.state=state;
	}

	public String getState() {
		return this.state;
	}

	public void setZip(long zip) {
		this.zip=zip;
	}

	public long getZip() {
		return this.zip;
	}

	public void setType(String type) {
		this.type=type;
	}

	public String getType() {
		return this.type;
	}


	@Override
	public int getClassId() 
	{
		return PortableFactoryImpl.Address_CLASS_ID;
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
		writer.writeLong("customerId", customerId);
		writer.writeUTF("street", street);
		writer.writeUTF("city", city);
		writer.writeUTF("state", state);
		writer.writeLong("zip", zip);
		writer.writeUTF("type", type);
	}

	@Override
	public void readPortable(PortableReader reader) throws IOException {
		this.id = reader.readLong("id");
		this.customerId = reader.readLong("customerId");
		this.street = reader.readUTF("street");
		this.city = reader.readUTF("city");
		this.state = reader.readUTF("state");
		this.zip = reader.readLong("zip");
		this.type = reader.readUTF("type");
	}
    
	@Override
	public String toString()
	{
		return "[city=" + this.city
			 + ", customerId=" + this.customerId
			 + ", id=" + this.id
			 + ", state=" + this.state
			 + ", street=" + this.street
			 + ", type=" + this.type
			 + ", zip=" + this.zip + "]";
	}
}
