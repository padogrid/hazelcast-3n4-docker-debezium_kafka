package org.hazelcast.addon.demo.debezium.data;

import java.io.IOException;


import com.hazelcast.nio.serialization.PortableReader;
import com.hazelcast.nio.serialization.PortableWriter;
import com.hazelcast.nio.serialization.VersionedPortable;

/**
  * Product is generated code. To modify this class, you must follow the
  * guidelines below.
  * <ul>
  * <li>Always add new fields and do NOT delete old fields.</li>
  * <li>If new fields have been added, then make sure to increment the version number.</li>
  * </ul>
  *
  * @generator com.netcrest.pado.tools.hazelcast.VersionedPortableClassGenerator
  * @schema debezium.inventory-products.schema
  * @date Sun Mar 22 16:14:45 EDT 2020
**/
public class Product implements VersionedPortable
{
	private long id;
	private String name;
	private String description;
	private double weight;

	public Product()
	{
	}

	public void setId(long id) {
		this.id=id;
	}

	public long getId() {
		return this.id;
	}

	public void setName(String name) {
		this.name=name;
	}

	public String getName() {
		return this.name;
	}

	public void setDescription(String description) {
		this.description=description;
	}

	public String getDescription() {
		return this.description;
	}

	public void setWeight(double weight) {
		this.weight=weight;
	}

	public double getWeight() {
		return this.weight;
	}


	@Override
	public int getClassId() 
	{
		return PortableFactoryImpl.Product_CLASS_ID;
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
		writer.writeUTF("name", name);
		writer.writeUTF("description", description);
		writer.writeDouble("weight", weight);
	}

	@Override
	public void readPortable(PortableReader reader) throws IOException {
		this.id = reader.readLong("id");
		this.name = reader.readUTF("name");
		this.description = reader.readUTF("description");
		this.weight = reader.readDouble("weight");
	}
    
	@Override
	public String toString()
	{
		return "[description=" + this.description
			 + ", id=" + this.id
			 + ", name=" + this.name
			 + ", weight=" + this.weight + "]";
	}
}
