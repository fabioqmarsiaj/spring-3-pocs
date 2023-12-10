# Spring Batch POC

The Spring Batch project contains three basic steps:

* _**Reader**_ : where's the data is being read, such as database, file or even a queue.
* _**_Processor_**_ : is the actual data transformation.
* _**_Writer_**_ : where's the data is being written, could be also a database, file or a queue.

We must configure the reader, processor and writer as beans on a BatchConfig class.

The PersonItemProcessor implements the ItemProcessor interface from Spring Batch project where receives an Input and returns an Output:

In this sample project Input and Output are the Person java record.

Note that if the output returns null, the processing will stop.

```
public interface ItemProcessor<I, O>
```



Batch applications can be categorized by the input source:

* Database-driven applications
* File-driven applications
* Message-driven applications


