package be.heydari.cac.Invoices;


import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author Emad Heydari Beni
 */
public interface InvoiceRepository extends MongoRepository<Invoice,Long> {

    List<Invoice> findByCustomer(String customer);
}
