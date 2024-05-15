create table if not exists module_config_authorizer(
id Integer not null,
config_name varchar(255) null,
fld_name varchar(255) null,
label varchar(255) null,
config_count Integer null,
can_modify char null,
can_delete char null,
modify_type varchar(255) null,
modify_type_indicator varchar(255) null,
creation_cr varchar(255) null,
modified_cr varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint module_config_authorizer_pk primary key(id));