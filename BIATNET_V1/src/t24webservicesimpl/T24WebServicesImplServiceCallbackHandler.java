
/**
 * T24WebServicesImplServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package t24webservicesimpl;

    /**
     *  T24WebServicesImplServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class T24WebServicesImplServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public T24WebServicesImplServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public T24WebServicesImplServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for opencurrentaccountLCY_Validate method
            * override this method for handling normal response from opencurrentaccountLCY_Validate operation
            */
           public void receiveResultopencurrentaccountLCY_Validate(
                    t24webservicesimpl.T24WebServicesImplServiceStub.OpencurrentaccountLCY_ValidateResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from opencurrentaccountLCY_Validate operation
           */
            public void receiveErroropencurrentaccountLCY_Validate(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for opencurrentaccountLCY method
            * override this method for handling normal response from opencurrentaccountLCY operation
            */
           public void receiveResultopencurrentaccountLCY(
                    t24webservicesimpl.T24WebServicesImplServiceStub.OpencurrentaccountLCYResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from opencurrentaccountLCY operation
           */
            public void receiveErroropencurrentaccountLCY(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for callOfs method
            * override this method for handling normal response from callOfs operation
            */
           public void receiveResultcallOfs(
                    t24webservicesimpl.T24WebServicesImplServiceStub.CallOfsResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from callOfs operation
           */
            public void receiveErrorcallOfs(java.lang.Exception e) {
            }
                


    }
    