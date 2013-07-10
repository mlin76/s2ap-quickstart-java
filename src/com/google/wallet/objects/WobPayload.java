package com.google.wallet.objects;


import java.util.ArrayList;
import java.util.List;

import com.google.api.client.json.GenericJson;

/**
 * Bean to represent the Wob payload object
 * 
 * @author pying
 *
 */
public class WobPayload {
	private List<GenericJson> loyaltyObjects;
  private List<GenericJson> offerObjects;
  private List<GenericJson> genericObjects;
  
	public WobPayload(){}

	public void addLoyaltyObject(GenericJson object){
		if (loyaltyObjects == null){
			loyaltyObjects = new ArrayList<GenericJson>();
		}
		loyaltyObjects.add(object);
	}
	
	public List<GenericJson> getLoyaltyObjects() {
		return loyaltyObjects;
	}

	public void setLoyaltyObjects(List<GenericJson> loyaltyObject) {
		this.loyaltyObjects = loyaltyObject;
	}
	
  public void addOfferObject(GenericJson object){
    if (offerObjects == null){
      offerObjects = new ArrayList<GenericJson>();
    }
    offerObjects.add(object);
  }
  
  public List<GenericJson> getOfferObjects() {
    return offerObjects;
  }

  public void setOfferObjects(List<GenericJson> offerObject) {
    this.offerObjects = offerObject;
  }
  
  public void addGenericObject(GenericJson object){
    if (genericObjects == null){
      genericObjects = new ArrayList<GenericJson>();
    }
    genericObjects.add(object);
  }
  
  public List<GenericJson> getGenericObjects() {
    return genericObjects;
  }

  public void setGenericObjects(List<GenericJson> genericObject) {
    this.genericObjects = genericObject;
  }
}
