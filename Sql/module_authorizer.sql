create table if not exists module_authorizer(
module_id Integer not null,
authorizer_module1 varchar(255) null,
authorizer_module_value1 varchar(255) null,
authorizer_module2 varchar(255) null,
authorizer_module_value2 varchar(255) null,
authorizer_module3 varchar(255) null,
authorizer_module_value3 varchar(255) null,
authorizer_module_system varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint module_authorizer_pk primary key(module_id));