package com.tap.connection;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

import com.tap.model.Hotel_Attributes;
import com.tap.model.Item2;
import com.tap.model.Item_Price;
import com.tap.model.Land_Package_Attributes;
import com.tap.model.Price_List;
import com.tap.model.Product_Bundle;
import com.tap.model.Product_Bundle_Attribute;

public class RestAPI {
	// local tokens of ERP MANI===token 5044ca637d73608:125c340d646f787
	// beta and dev tokens===token a7d14051ef3941b:a738356d197551d

	// ##########DEV########################3
//	private static final String ITEM_URL = "http://13.232.237.47:8000/api/resource/Item";
//	private static final String PRODUCT_BUNDLE_URL = "http://13.232.237.47:8000/api/resource/Product Bundle";
//	private static final String Hotel_ATTRIBUTES_URL = "http://13.232.237.47:8000/api/resource/Hotel Attribute";
//	private static final String PRODUCT_BUNDLE_ATTRIBUTE_URL = "http://13.232.237.47:8000/api/resource/Product Bundle Attribute";
//	private static final String LAND_PACKAGE_ATTRIBUTES_URL = "http://13.232.237.47:8000/api/resource/Land Package Attributes";
//	private static final String PRICE_LIST_URL = "http://13.232.237.47:8000/api/resource/Price List";
//	private static final String ITEM_PRICE_LIST_URL = "http://13.232.237.47:8000/api/resource/Item Price";
//	private static final String REST_URI1 = "http://13.232.237.47:8000/api/method/login?usr=administrator&pwd=Strawberi@123";
//	

	// ################# setup beta#####3
	private static final String ITEM_URL = "http://betaerp.edawjar.in:8000/api/resource/Item";
	private static final String PRODUCT_BUNDLE_URL = "http://betaerp.edawjar.in:8000/api/resource/Product Bundle";
	private static final String Hotel_ATTRIBUTES_URL = "http://betaerp.edawjar.in:8000/api/resource/Hotel Attribute";
	private static final String PRODUCT_BUNDLE_ATTRIBUTE_URL = "http://betaerp.edawjar.in:8000/api/resource/Product Bundle Attribute";
	private static final String LAND_PACKAGE_ATTRIBUTES_URL = "http://betaerp.edawjar.in:8000/api/resource/Land Package Attributes";
	private static final String PRICE_LIST_URL = "http://betaerp.edawjar.in:8000/api/resource/Price List";
	private static final String ITEM_PRICE_LIST_URL = "http://betaerp.edawjar.in:8000/api/resource/Item Price";
	private static final String REST_URI1 = "http://betaerp.edawjar.in:8000/api/method/login?usr=administrator&pwd=Strawberi@123";

	// ################# setup LOCAL mm#####
//	private static final String ITEM_URL = "http://192.168.0.9:8000/api/resource/Item";
//	private static final String PRODUCT_BUNDLE_URL = "http://192.168.0.9:8000/api/resource/Product Bundle";
//	private static final String Hotel_ATTRIBUTES_URL = "http://192.168.0.9:8000/api/resource/Hotel Attribute";
//	private static final String PRODUCT_BUNDLE_ATTRIBUTE_URL = "http://192.168.0.9:8000/api/resource/Product Bundle Attribute";
//	private static final String LAND_PACKAGE_ATTRIBUTES_URL = "http://192.168.0.9:8000/api/resource/Land Package Attributes";
//	private static final String PRICE_LIST_URL = "http://192.168.0.9:8000/api/resource/Price List";
//	private static final String ITEM_PRICE_LIST_URL = "http://192.168.0.9:8000/api/resource/Item Price";
//	private static final String REST_URI1 = "http://192.168.0.9:8000/api/method/login?usr=administrator&pwd=Strawberi@123";

	
	private Client client = ClientBuilder.newClient();

	public Response getLoginDetail() {
		try {
			return client.target(REST_URI1)

					.request(MediaType.APPLICATION_JSON)

					.get(Response.class);
		} catch (Exception e) {
			System.out.println("Exception " + e);
		}
		return null;
	}
	

	public Response createHotel_attributes(Hotel_Attributes attributes) {
		JSONObject obj = new JSONObject(attributes);
		System.out.println("Hotel_Attributes--" + obj.toString());
		try {

			return client.target(Hotel_ATTRIBUTES_URL).request(MediaType.APPLICATION_JSON)
					.header("Authorization", "token a7d14051ef3941b:a738356d197551d")
					.post(Entity.entity(attributes, MediaType.APPLICATION_JSON));
			
//			return client.target(Hotel_ATTRIBUTES_URL).request(MediaType.APPLICATION_JSON)
//					.header("Authorization", "token 5044ca637d73608:125c340d646f787")
//					.post(Entity.entity(attributes, MediaType.APPLICATION_JSON));

		} catch (Exception e) {
			System.out.println("Exception " + e);
		}
		return null;

	}

	public Response createProduct_bundle(Product_Bundle attributes) {
		JSONObject obj = new JSONObject(attributes);
		System.out.println("Product_Bundle---" + obj.toString());

		try {

			return client.target(PRODUCT_BUNDLE_URL).request(MediaType.APPLICATION_JSON)
					.header("Authorization", "token a7d14051ef3941b:a738356d197551d")
					.post(Entity.entity(attributes, MediaType.APPLICATION_JSON));
//			
//			return client.target(PRODUCT_BUNDLE_URL).request(MediaType.APPLICATION_JSON)
//					.header("Authorization", "token 5044ca637d73608:125c340d646f787")
//					.post(Entity.entity(attributes, MediaType.APPLICATION_JSON));
		} catch (Exception e) {
			System.out.println("Exception " + e);
		}
		return null;

	}

	public Response createProduct_bundle_attribute(Product_Bundle_Attribute bundle_attribute) {
		JSONObject obj = new JSONObject(bundle_attribute);
		System.out.println("product bundle attributes---" + obj.toString());
		try {

			return client.target(PRODUCT_BUNDLE_ATTRIBUTE_URL).request(MediaType.APPLICATION_JSON)
					.header("Authorization", "token a7d14051ef3941b:a738356d197551d")
					.post(Entity.entity(bundle_attribute, MediaType.APPLICATION_JSON));
			
//			return client.target(PRODUCT_BUNDLE_ATTRIBUTE_URL).request(MediaType.APPLICATION_JSON)
//					.header("Authorization", "token 5044ca637d73608:125c340d646f787")
//					.post(Entity.entity(bundle_attribute, MediaType.APPLICATION_JSON));
		} catch (Exception e) {
			System.out.println("Exception " + e);
		}
		return null;

	}

	public Response createLand_package_attributes(Land_Package_Attributes package_attribute) {
		JSONObject obj = new JSONObject(package_attribute);
		System.out.println("Land_Package_Attributes---" + obj.toString());
		try {

			return client.target(LAND_PACKAGE_ATTRIBUTES_URL).request(MediaType.APPLICATION_JSON)
					.header("Authorization", "token a7d14051ef3941b:a738356d197551d")
					.post(Entity.entity(package_attribute, MediaType.APPLICATION_JSON));
//			return client.target(LAND_PACKAGE_ATTRIBUTES_URL).request(MediaType.APPLICATION_JSON)
//					.header("Authorization", "token 5044ca637d73608:125c340d646f787")
//					.post(Entity.entity(package_attribute, MediaType.APPLICATION_JSON));
		} catch (Exception e) {
			System.out.println("Exception " + e);
		}
		return null;

	}

	public Response createPrice_list(Price_List price_attribute) {
		JSONObject obj = new JSONObject(price_attribute);
		System.out.println("Price_List---" + obj.toString());
		try {

			return client.target(PRICE_LIST_URL).request(MediaType.APPLICATION_JSON)
					.header("Authorization", "token a7d14051ef3941b:a738356d197551d")
					.post(Entity.entity(price_attribute, MediaType.APPLICATION_JSON));
			
//			return client.target(PRICE_LIST_URL).request(MediaType.APPLICATION_JSON)
//					.header("Authorization", "token 5044ca637d73608:125c340d646f787")
//					.post(Entity.entity(price_attribute, MediaType.APPLICATION_JSON));
		} catch (Exception e) {
			System.out.println("Exception " + e);
		}
		return null;

	}

	public Response createItemjson(Item2 sample_item) {
		JSONObject obj = new JSONObject(sample_item);
		System.out.println("Item---" + obj.toString());

		try {
			return client.target(ITEM_URL).request(MediaType.APPLICATION_JSON)
					.header("Authorization", "token a7d14051ef3941b:a738356d197551d")
					.post(Entity.entity(sample_item, MediaType.APPLICATION_JSON));
			
//			return client.target(ITEM_URL).request(MediaType.APPLICATION_JSON)
//					.header("Authorization", "token 5044ca637d73608:125c340d646f787")
//					.post(Entity.entity(sample_item, MediaType.APPLICATION_JSON));

		} catch (Exception e) {
			System.out.println("Exception " + e);
		}
		return null;

	}

	public Response createItem_price_list(Item_Price sample_item) {
		JSONObject obj = new JSONObject(sample_item);
		System.out.println("Item Price List---" + obj.toString());

		try {
			return client.target(ITEM_PRICE_LIST_URL).request(MediaType.APPLICATION_JSON)
					.header("Authorization", "token a7d14051ef3941b:a738356d197551d")
					.post(Entity.entity(sample_item, MediaType.APPLICATION_JSON));
			
//			return client.target(ITEM_PRICE_LIST_URL).request(MediaType.APPLICATION_JSON)
//					.header("Authorization", "token 5044ca637d73608:125c340d646f787")
//					.post(Entity.entity(sample_item, MediaType.APPLICATION_JSON));


		} catch (Exception e) {
			System.out.println("Exception " + e);
		}
		return null;

	}

}
