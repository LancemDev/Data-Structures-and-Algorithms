## So imma write the details of this RMI and what I have understood about it
So apparently RMI allows for the invocation of objects from one JVM to another JVM whether on one computer or accross a network.
It is also important to note that RMI is a java framework.

### RMI architecture
The RMI architecture is made up of 4 layers:
1. Application layer
2. Stub and skeleton layer
3. Remote reference layer
4. Transport layer


### For RMI to work...
1. Define the remote interface
Both the client and the server have access to the remote interface. The remote interface defines the methods that can be invoked remotely by the client. The remote interface must extend the Remote interface and each method must throw a RemoteException.

2. Implement the remote interface
The server must implement the remote interface. The implementation of the remote interface is called the remote object. The remote object is the object that will be invoked by the client.

3. Create the server program
The server program instantiates the remote object, registers it with the RMI registry and waits for clients to invoke methods on the remote object.

4. Bind the server program with the RMI registry
The server program must be registered with the RMI registry before it can be invoked by the client. The RMI registry is a simple server-side bootstrap naming facility that enables clients to obtain a reference to an initial remote object.


5. Create the client program
The client program obtains a stub for the remote object from the RMI registry and then invokes methods on the remote object using the stub. The stub marshals the parameters given by the client and sends the marshalled parameters to the remote object. The stub waits for the result from the remote object and then unmarshals the result and returns it to the client.

6. Compile the source files
Compile the source files using the Java compiler.

7. Handle exceptions
RMI throws a number of exceptions. The RemoteException is thrown by all remote methods. The NotBoundException is thrown if the client tries to lookup a name that is not in the registry. The AlreadyBoundException is thrown if the client tries to bind an object to a name that is already in the registry. The AccessException is thrown if there is a security violation. The CreateException is thrown if there is a problem creating the remote object. The MarshalException is thrown if marshalling or unmarshalling fails. The ServerException is thrown if there is a problem with the remote method invocation. The UnexpectedException is thrown if there is a communication problem between the client and the server.

