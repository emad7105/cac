package be.heydari.cac.Invoices;

import be.heydari.cac.commons.ResponseEntities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @author Emad Heydari Beni
 */
@RestController
@RequestMapping("/invoices")
public class InvoiceController {

    @Autowired
    InvoiceRepository invoiceRepository;



    @RequestMapping("/test")
    ResponseEntity<?> test() {
        return ResponseEntities.ok("Hello World!");
    }

    /**
     * Example (https://curlbuilder.com/):
     *
     * curl -H "Content-type: application/json" -d '{"desc": "Last year purchase", "customer":"Alice", "amount":"100"}' 'http://localhost:8080/invoices/'
     *
     * @param invoice
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    ResponseEntity<?> create(@RequestBody Invoice invoice) {
        Invoice savedInvoice = invoiceRepository.save(invoice);
        return ResponseEntities.created(savedInvoice);
    }

    @RequestMapping(value = "/{invoiceId}", method = RequestMethod.GET)
    ResponseEntity<?> get(@PathVariable String invoiceId) {
        Optional<Invoice> invoice = invoiceRepository.findById(Long.valueOf(invoiceId));
        return invoice.isPresent() ? ResponseEntities.ok(invoice.get()) : ResponseEntities.notFound();
    }
}
