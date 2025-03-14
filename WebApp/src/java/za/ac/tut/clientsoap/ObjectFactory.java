
package za.ac.tut.clientsoap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the za.ac.tut.clientsoap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InitialiseBean_QNAME = new QName("http://webservice.tut.ac.za/", "initialiseBean");
    private final static QName _InsertResponse_QNAME = new QName("http://webservice.tut.ac.za/", "insertResponse");
    private final static QName _UpdateProductResponse_QNAME = new QName("http://webservice.tut.ac.za/", "updateProductResponse");
    private final static QName _DeleteProduct_QNAME = new QName("http://webservice.tut.ac.za/", "deleteProduct");
    private final static QName _Insert_QNAME = new QName("http://webservice.tut.ac.za/", "insert");
    private final static QName _UpdateProduct_QNAME = new QName("http://webservice.tut.ac.za/", "updateProduct");
    private final static QName _DeleteProductResponse_QNAME = new QName("http://webservice.tut.ac.za/", "deleteProductResponse");
    private final static QName _GetProduct_QNAME = new QName("http://webservice.tut.ac.za/", "getProduct");
    private final static QName _GetProductResponse_QNAME = new QName("http://webservice.tut.ac.za/", "getProductResponse");
    private final static QName _InitialiseBeanResponse_QNAME = new QName("http://webservice.tut.ac.za/", "initialiseBeanResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: za.ac.tut.clientsoap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteProductResponse }
     * 
     */
    public DeleteProductResponse createDeleteProductResponse() {
        return new DeleteProductResponse();
    }

    /**
     * Create an instance of {@link GetProduct }
     * 
     */
    public GetProduct createGetProduct() {
        return new GetProduct();
    }

    /**
     * Create an instance of {@link GetProductResponse }
     * 
     */
    public GetProductResponse createGetProductResponse() {
        return new GetProductResponse();
    }

    /**
     * Create an instance of {@link InitialiseBeanResponse }
     * 
     */
    public InitialiseBeanResponse createInitialiseBeanResponse() {
        return new InitialiseBeanResponse();
    }

    /**
     * Create an instance of {@link UpdateProduct }
     * 
     */
    public UpdateProduct createUpdateProduct() {
        return new UpdateProduct();
    }

    /**
     * Create an instance of {@link Insert }
     * 
     */
    public Insert createInsert() {
        return new Insert();
    }

    /**
     * Create an instance of {@link DeleteProduct }
     * 
     */
    public DeleteProduct createDeleteProduct() {
        return new DeleteProduct();
    }

    /**
     * Create an instance of {@link InitialiseBean }
     * 
     */
    public InitialiseBean createInitialiseBean() {
        return new InitialiseBean();
    }

    /**
     * Create an instance of {@link InsertResponse }
     * 
     */
    public InsertResponse createInsertResponse() {
        return new InsertResponse();
    }

    /**
     * Create an instance of {@link UpdateProductResponse }
     * 
     */
    public UpdateProductResponse createUpdateProductResponse() {
        return new UpdateProductResponse();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitialiseBean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tut.ac.za/", name = "initialiseBean")
    public JAXBElement<InitialiseBean> createInitialiseBean(InitialiseBean value) {
        return new JAXBElement<InitialiseBean>(_InitialiseBean_QNAME, InitialiseBean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tut.ac.za/", name = "insertResponse")
    public JAXBElement<InsertResponse> createInsertResponse(InsertResponse value) {
        return new JAXBElement<InsertResponse>(_InsertResponse_QNAME, InsertResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tut.ac.za/", name = "updateProductResponse")
    public JAXBElement<UpdateProductResponse> createUpdateProductResponse(UpdateProductResponse value) {
        return new JAXBElement<UpdateProductResponse>(_UpdateProductResponse_QNAME, UpdateProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tut.ac.za/", name = "deleteProduct")
    public JAXBElement<DeleteProduct> createDeleteProduct(DeleteProduct value) {
        return new JAXBElement<DeleteProduct>(_DeleteProduct_QNAME, DeleteProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Insert }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tut.ac.za/", name = "insert")
    public JAXBElement<Insert> createInsert(Insert value) {
        return new JAXBElement<Insert>(_Insert_QNAME, Insert.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tut.ac.za/", name = "updateProduct")
    public JAXBElement<UpdateProduct> createUpdateProduct(UpdateProduct value) {
        return new JAXBElement<UpdateProduct>(_UpdateProduct_QNAME, UpdateProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tut.ac.za/", name = "deleteProductResponse")
    public JAXBElement<DeleteProductResponse> createDeleteProductResponse(DeleteProductResponse value) {
        return new JAXBElement<DeleteProductResponse>(_DeleteProductResponse_QNAME, DeleteProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tut.ac.za/", name = "getProduct")
    public JAXBElement<GetProduct> createGetProduct(GetProduct value) {
        return new JAXBElement<GetProduct>(_GetProduct_QNAME, GetProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tut.ac.za/", name = "getProductResponse")
    public JAXBElement<GetProductResponse> createGetProductResponse(GetProductResponse value) {
        return new JAXBElement<GetProductResponse>(_GetProductResponse_QNAME, GetProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitialiseBeanResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.tut.ac.za/", name = "initialiseBeanResponse")
    public JAXBElement<InitialiseBeanResponse> createInitialiseBeanResponse(InitialiseBeanResponse value) {
        return new JAXBElement<InitialiseBeanResponse>(_InitialiseBeanResponse_QNAME, InitialiseBeanResponse.class, null, value);
    }

}
