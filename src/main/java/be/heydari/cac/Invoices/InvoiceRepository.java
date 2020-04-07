package be.heydari.cac.Invoices;


import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * @author Emad Heydari Beni
 */
public interface InvoiceRepository extends PagingAndSortingRepository<Invoice,Long> {

    List<Invoice> findByCustomer(String customer);
}
