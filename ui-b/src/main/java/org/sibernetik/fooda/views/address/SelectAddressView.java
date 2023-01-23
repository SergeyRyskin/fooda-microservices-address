package org.sibernetik.fooda.views.address;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import org.sibernetik.fooda.services.ServiceB;

import javax.annotation.security.PermitAll;

@PageTitle("Select Address")
@Route(value = "address/select")

@PermitAll
public class SelectAddressView extends FormLayout {
    private final TextField fullName;
    private final EmailField email;

    private final TextField addressType;

    private final TextField addressTitle;

    private final TextField phoneNumber;

    private final Select<String> city;

    private final TextArea fullAddress;

    private final Button saveButton;
    private final ServiceB serviceB;

    public SelectAddressView(ServiceB serviceB) {
        this.fullName = new TextField();
        this.email = new EmailField();
        this.addressType = new TextField();
        this.addressTitle = new TextField();
        this.phoneNumber = new TextField();
        this.city = new Select<String>("Istanbul","Ankara","Brussels","London");
        this.fullAddress = new TextArea();
        this.saveButton = new Button();

        this.serviceB = serviceB;



        this.addFormItem(
                fullName,"Full Name"
        );
        this.addFormItem(
                email,"Email"
        );
        this.addFormItem(
                addressType,"Address Type"
        );
        this.addFormItem(
                addressTitle,"Address Title"
        );
        this.addFormItem(
                phoneNumber,"Phone Number"
        );
        this.addFormItem(
                city,"City"
        );
        this.addFormItem(
                fullAddress,"Address"
        );
        this.saveButton.setMaxWidth("320px");
        this.saveButton.setText("Add Address");
        this.add(
                saveButton
        );


    }

}
