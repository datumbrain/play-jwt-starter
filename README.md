# play-jwt-starter

play-jwt-starter project.

## Setup Database

To setup `PostgreSQL` database install using

```
sudo apt install postgresql-9.5
```

1. Create a new user in database

```
sudo -u postgres createuser playdb
```

2. Run the following query to set password in `psql` console

```postgresql
ALTER USER playdb WITH ENCRYPTED PASSWORD '<HERE>';
```

> Note: You can pick up the password from configuration file `application.conf`.

3. Create the database

```postgresql
CREATE DATABASE playdb;
```

4. Grant database access to newly created user `playdb`

```postgresql
GRANT ALL PRIVILEGES ON DATABASE playdb TO playdb;
```
