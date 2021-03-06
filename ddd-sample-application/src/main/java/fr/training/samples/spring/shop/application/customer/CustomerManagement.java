package fr.training.samples.spring.shop.application.customer;


import fr.training.samples.spring.shop.domain.customer.entity.CustomerEntity;

/**
 * @author bnasslahsen
 *
 */
public interface CustomerManagement {

	/**
	 * @param customer
	 * @return
	 */
	CustomerEntity create(CustomerEntity customer);

	/**
	 * @param customerID
	 * @return
	 */
	CustomerEntity findOne(String customerID);

	/**
	 * @param customer
	 * @return
	 */
	CustomerEntity update(CustomerEntity customerEntity);

}
