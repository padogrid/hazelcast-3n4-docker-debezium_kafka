package org.hazelcast.addon.demo.debezium.data;

import java.io.IOException;


import com.hazelcast.nio.serialization.PortableReader;
import com.hazelcast.nio.serialization.PortableWriter;
import com.hazelcast.nio.serialization.VersionedPortable;

/**
  * ProductOnHand is generated code. To modify this class, you must follow the
  * guidelines below.
  * <ul>
  * <li>Always add new fields and do NOT delete old fields.</li>
  * <li>If new fields have been added, then make sure to increment the version number.</li>
  * </ul>
  *
  * @generator com.netcrest.pado.tools.hazelcast.VersionedPortableClassGenerator
  * @schema debezium.inventory-products_on_hand.schema
  * @date Sun Mar 22 16:14:45 EDT 2020
**/
public class ProductOnHand implements VersionedPortable
{
	private long productId;
	private long quantity;

	public ProductOnHand()
	{
	}

	public void setProductId(long productId) {
		this.productId=productId;
	}

	public long getProductId() {
		return this.productId;
	}

	public void setQuantity(long quantity) {
		this.quantity=quantity;
	}

	public long getQuantity() {
		return this.quantity;
	}


	@Override
	public int getClassId() 
	{
		return PortableFactoryImpl.ProductOnHand_CLASS_ID;
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
		writer.writeLong("productId", productId);
		writer.writeLong("quantity", quantity);
	}

	@Override
	public void readPortable(PortableReader reader) throws IOException {
		this.productId = reader.readLong("productId");
		this.quantity = reader.readLong("quantity");
	}
    
	@Override
	public String toString()
	{
		return "[productId=" + this.productId
			 + ", quantity=" + this.quantity + "]";
	}
}
