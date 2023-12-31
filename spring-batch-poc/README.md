# Spring Batch POC

The Spring Batch project contains five basic components:

* _**Reader**_ : where's the data is being read, such as database, file or even a queue.
* _**Processor**_ : is the actual data transformation.
* _**Writer**_ : where's the data is being written, could be also a database, file or a queue.
* _**Job**_ : the actual job to be executed.
* _**Step**_ : the job step OR steps.

We must configure the reader, processor, writer, job and step as **_beans_** on a BatchConfig class.

Note that each Job can contain multiple steps, and a step can contain a reader, processor and a writer.


### **_READER_**

Spring Batch module give us multiple ways to configure our components.
In this POC project we defined the FlatFileItemReader:

```
@Bean
public FlatFileItemReader<Person> reader() {
    return new FlatFileItemReaderBuilder<Person>()
            .name("personItemReader")
            .resource(new ClassPathResource("sample-data.csv"))
            .delimited()
            .names("firstName", "lastName")
            .targetType(Person.class)
            .build();
}
```

* Our FlatFile is the sample-data.csv on resources folder
* We must tell where the file is being loaded from, the delimiter type (in this case spring can automatically tell it's comma between the Person fields.)
* The field names from our Object
* The actual Object, targetType.


### **_PROCESSOR_**

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


