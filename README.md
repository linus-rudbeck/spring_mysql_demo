# Spring MySQL REST API demo

<https://spring.io/guides/gs/accessing-data-mysql/>

## REST API

CRUD = Create, Read, Update, Delete

BASE_URL= http://localhost:8080/api

- **Create:** POST: {BASE_URL}/{resource}
- **Read (one):** GET: {BASE_URL}/{resource}/{id}
- **Read (all):** GET: {BASE_URL}/{resource}
- **Update:** PUT: {BASE_URL}/{resource}/{id}
- **DELETE:** DELETE: {BASE_URL}/{resource}/{id}

### Exempel: Users

BASE_URL= http://localhost:8080/

- **Create:** POST: http://localhost:8080/users
- **Read (one):** GET: http://localhost:8080/users/5
- **Read (all):** GET: http://localhost:8080/users
- **Update:** PUT: http://localhost:8080/users/5
- **Delete:** DELETE: http://localhost:8080/users/5

### Exempel: Cars

BASE_URL= http://localhost:8080/

- **Create:** POST: http://localhost:8080/cars/
- **Read (one):** GET: http://localhost:8080/cars/10
- **Read (all):** GET: http://localhost:8080/cars
- **Update:** PUT: http://localhost:8080/cars/10
- **Delete:** DELETE: http://localhost:8080/cars/10

## Inlämning demo

- GET: /api/{country}/cities
- GET: /api/weather/{city_id}

### GET: /api/sweden/cities

```json
[
    {"city_id":  1, "city_name":  "Göteborg"},
    ...
]
```

### GET: /api/weather/1

```json
{
  "temperature": {
    "value": 24,
    "unit": "Celcius"
  },
  "weather": "SUNNY"
}
```

### Docker

<https://spring.io/guides/topicals/spring-boot-docker/>

```dockerfile
...
```

### UML

*Se Draw IO  <https://drive.google.com/file/d/1tUVNmqPSyej4cpOCKzrlYY3ic5LBUWU6/view?usp=sharing>*

### BDD

*Se inspelade lektioner 21:a & 22:a november*

### Readme-fel

- Språk markdown
- https://www.markdownguide.org/
- https://www.markdownguide.org/basic-syntax/

```markdown
# Heading 1

## Heading 2

### Heading 3

Om jag skriver en liten text

och vill att den bryter mellan raderna

ska jag ha 2 blanksteg

Om jag gör en annan text med
bara ett blanksteg
blir det såhär istället

Tre streck blir en horizontal rule

---

Se ovan

Vi kan också göra **fetmarkerat** och _kursivt_

Punktlista:

- Listitem 1
- Listitem 2
- Listitem 3
```

# DEMO

# Heading 1

## Heading 2

### Heading 3

Om jag skriver en liten text

och vill att den bryter mellan raderna

ska jag ha 2 blanksteg


Om jag gör en annan text med
bara ett blanksteg
blir det såhär istället

Tre streck blir en horizontal rule

Punktlista:

- Listitem 1
- Listitem 2
- Listitem 3

---

Se ovan

Vi kan också göra **fetmarkerat** och _kursivt_

## Förslag på rubriker (riktlinje: 750 - 1500 ord)

- Projektöversikt: Sammanfattning, mål med projektet
- Designbeslut: Vilka tekniker har ni valt och varför?
- UML & modeller: Beskriv vilka modeller ni har och sammanfatta dem.
- Problem och lösningar: Vad har ni stött på för problem och hur 
löste ni dem? Vad var svårast eller tog mest tid?
- Förbättringspotential: Vad hade ni viljat förbättra i er kod eller
struktur om ni hade mer tid och kunskap?