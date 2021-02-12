package sources.operation.factory;

import sources.operation.types.Operation;

//TODO: create a hierarchy of builders
public interface OperationBuilder {
    Operation build();
}
