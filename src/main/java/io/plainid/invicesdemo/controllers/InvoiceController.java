package io.plainid.invicesdemo.controllers;

import com.sun.net.httpserver.HttpContext;
import io.plainid.invicesdemo.model.Invoice;
import io.plainid.invicesdemo.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.OAuth2AccessToken;
import org.springframework.security.oauth2.server.resource.authentication.BearerTokenAuthentication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/account/{customer}/bills")
public class InvoiceController {
    @Autowired
    private InvoiceRepository invoiceRepository;

    @GetMapping
    public List<Invoice> getAllInvoices(@PathVariable String customer) {

//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        if (auth instanceof BearerTokenAuthentication){
//            OAuth2AccessToken token = ((BearerTokenAuthentication) auth).getToken();
//            EntityAttributes entityAttributes = new EntityAttributes();
//            entityAttributes.addAttribute("ATTRIBUTE_NAME", "ATTRIBUTE_VALUE");
//            com.plainid.libs.sqlpdplib.Context.setEntityAttributes(entityAttributes);
//            ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
//            System.out.println("");
//        }
        return invoiceRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Invoice> getInvoiceById(@PathVariable Long id, @PathVariable String customer) {

        return invoiceRepository.findById(id);
    }

    @PostMapping
    public Invoice createInvoice(@RequestBody Invoice invoice, @PathVariable String customer) {
        return invoiceRepository.save(invoice);
    }
}