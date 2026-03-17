### Get start

1. java 25
2. spring boot 4
3. docker
4. postgres

---

### Start database with Docker

1. Prepare .env file to start postgres:

```bash
# in the project root directory
cp .env.dist .env
```

2. Confirm the root [`.env`](/home/allan/code/java/sample/sb-test-api/.env) contains:
   `POSTGRES_DB=api`
   `POSTGRES_USER=postgres`
   `POSTGRES_PASSWORD=postgres`
   `POSTGRES_PORT=5432`
   `POSTGRES_HOST=127.0.0.1`


3. Prepare .env file to start postgres:

```bash
docker compose up -d postgres
```

4. Stop PostgreSQL when needed:

```bash
docker compose down
```
---
