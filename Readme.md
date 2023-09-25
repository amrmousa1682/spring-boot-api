# Spring Boot API

This is a sample Spring Boot API project that provides endpoints for managing users, advertisements, and categories.

## Prerequisites

- Java 17
- Docker Compose

## Getting Started

1. Clone the repository:

```
git clone https://github.com/amrmousa1682/spring-boot-api
```

2. Navigate to the project directory:

```
cd project-directory
```

3. Build the project:

```shell
mvn clean package
```

4. Run the application using Docker Compose:

```shell
docker-compose up
```

This will start the API and its dependencies (database) using Docker Compose.

## API Documentation

Once the application is running, you can access the API endpoints using the following base URL:

```
http://localhost:8080
```

The available endpoints are as follows:

### User Endpoints

- `POST /user`: Create a new user.
- `GET /user/{id}`: Get user information by ID.
- `PUT /user/{id}`: Update user information by ID.
- `DELETE /user/{id}`: Delete a user by ID.

### Advertise Endpoints

- `POST /advertise`: Create a new advertisement.
- `GET /advertise`: Get all advertisements.
- `GET /advertise/{id}`: Get advertisement information by ID.
- `GET /advertise?prefix={prefix}`: Get advertisements by prefix.
- `GET /advertise?categoryId={categoryId}`: Get advertisements by category ID.
- `GET /advertise?prefix={prefix}&categoryId={categoryId}`: Get advertisements by prefix and category ID.
- `PUT /advertise/{id}`: Update advertisement information by ID.
- `DELETE /advertise/{id}`: Delete an advertisement by ID.

### Category Endpoints

- `POST /category`: Create a new category.
- `GET /category`: Get all categories.
- `GET /category/{id}`: Get category information by ID.
- `GET /category?prefix={prefix}`: Get categories by prefix.
- `PUT /category/{id}`: Update category information by ID.
- `DELETE /category/{id}`: Delete a category by ID.


## Entity-Relationship Diagram (ERD)

![ERD](<svg aria-roledescription="er" role="graphics-document document" viewBox="0 0 435.8033142089844 539.2000122070312" style="max-width: 100%;" xmlns="http://www.w3.org/2000/svg" width="100%" id="graph-div" height="100%" xmlns:xlink="http://www.w3.org/1999/xlink"><style>@import url("https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css");'</style><style>#graph-div{font-family:"trebuchet ms",verdana,arial,sans-serif;font-size:16px;fill:#ccc;}#graph-div .error-icon{fill:#a44141;}#graph-div .error-text{fill:#ddd;stroke:#ddd;}#graph-div .edge-thickness-normal{stroke-width:2px;}#graph-div .edge-thickness-thick{stroke-width:3.5px;}#graph-div .edge-pattern-solid{stroke-dasharray:0;}#graph-div .edge-pattern-dashed{stroke-dasharray:3;}#graph-div .edge-pattern-dotted{stroke-dasharray:2;}#graph-div .marker{fill:lightgrey;stroke:lightgrey;}#graph-div .marker.cross{stroke:lightgrey;}#graph-div svg{font-family:"trebuchet ms",verdana,arial,sans-serif;font-size:16px;}#graph-div .entityBox{fill:#1f2020;stroke:#81B1DB;}#graph-div .attributeBoxOdd{fill:hsl(0, 0%, 32%);stroke:#81B1DB;}#graph-div .attributeBoxEven{fill:hsl(0, 0%, 22%);stroke:#81B1DB;}#graph-div .relationshipLabelBox{fill:hsl(20, 1.5873015873%, 12.3529411765%);opacity:0.7;background-color:hsl(20, 1.5873015873%, 12.3529411765%);}#graph-div .relationshipLabelBox rect{opacity:0.5;}#graph-div .relationshipLine{stroke:lightgrey;}#graph-div .entityTitleText{text-anchor:middle;font-size:18px;fill:#ccc;}#graph-div #MD_PARENT_START{fill:#f5f5f5!important;stroke:lightgrey!important;stroke-width:1;}#graph-div #MD_PARENT_END{fill:#f5f5f5!important;stroke:lightgrey!important;stroke-width:1;}#graph-div :root{--mermaid-font-family:"trebuchet ms",verdana,arial,sans-serif;}</style><g></g><defs><marker orient="auto" markerHeight="240" markerWidth="190" refY="7" refX="0" id="MD_PARENT_START"><path d="M 18,7 L9,13 L1,7 L9,1 Z"></path></marker></defs><defs><marker orient="auto" markerHeight="28" markerWidth="20" refY="7" refX="19" id="MD_PARENT_END"><path d="M 18,7 L9,13 L1,7 L9,1 Z"></path></marker></defs><defs><marker orient="auto" markerHeight="18" markerWidth="18" refY="9" refX="0" id="ONLY_ONE_START"><path d="M9,0 L9,18 M15,0 L15,18" fill="none" stroke="gray"></path></marker></defs><defs><marker orient="auto" markerHeight="18" markerWidth="18" refY="9" refX="18" id="ONLY_ONE_END"><path d="M3,0 L3,18 M9,0 L9,18" fill="none" stroke="gray"></path></marker></defs><defs><marker orient="auto" markerHeight="18" markerWidth="30" refY="9" refX="0" id="ZERO_OR_ONE_START"><circle r="6" cy="9" cx="21" fill="white" stroke="gray"></circle><path d="M9,0 L9,18" fill="none" stroke="gray"></path></marker></defs><defs><marker orient="auto" markerHeight="18" markerWidth="30" refY="9" refX="30" id="ZERO_OR_ONE_END"><circle r="6" cy="9" cx="9" fill="white" stroke="gray"></circle><path d="M21,0 L21,18" fill="none" stroke="gray"></path></marker></defs><defs><marker orient="auto" markerHeight="36" markerWidth="45" refY="18" refX="18" id="ONE_OR_MORE_START"><path d="M0,18 Q 18,0 36,18 Q 18,36 0,18 M42,9 L42,27" fill="none" stroke="gray"></path></marker></defs><defs><marker orient="auto" markerHeight="36" markerWidth="45" refY="18" refX="27" id="ONE_OR_MORE_END"><path d="M3,9 L3,27 M9,18 Q27,0 45,18 Q27,36 9,18" fill="none" stroke="gray"></path></marker></defs><defs><marker orient="auto" markerHeight="36" markerWidth="57" refY="18" refX="18" id="ZERO_OR_MORE_START"><circle r="6" cy="18" cx="48" fill="white" stroke="gray"></circle><path d="M0,18 Q18,0 36,18 Q18,36 0,18" fill="none" stroke="gray"></path></marker></defs><defs><marker orient="auto" markerHeight="36" markerWidth="57" refY="18" refX="39" id="ZERO_OR_MORE_END"><circle r="6" cy="18" cx="9" fill="white" stroke="gray"></circle><path d="M21,18 Q39,0 57,18 Q39,36 21,18" fill="none" stroke="gray"></path></marker></defs><path style="stroke: gray; fill: none;" marker-start="url(#ONLY_ONE_START)" marker-end="url(#ZERO_OR_MORE_END)" d="M97.965,219.6L97.965,227.933C97.965,236.267,97.965,252.933,106.778,271.918C115.592,290.902,133.218,312.205,142.031,322.856L150.845,333.507" class="er relationshipLine"></path><path style="stroke: gray; fill: none;" marker-start="url(#ONLY_ONE_START)" marker-end="url(#ZERO_OR_MORE_END)" d="M345.867,175.6L345.867,191.267C345.867,206.933,345.867,238.267,337.053,264.585C328.24,290.902,310.614,312.205,301.8,322.856L292.987,333.507" class="er relationshipLine"></path><g transform="translate(20,20 )" id="entity-User-818c511a-4a32-5484-ba70-875d765a9175"><rect height="199.60000038146973" width="155.93017864227295" y="0" x="0" class="er entityBox"></rect><text style="dominant-baseline: middle; text-anchor: middle; font-size: 12px;" transform="translate(77.96508932113647,11.800000190734863)" y="0" x="0" id="text-entity-User-818c511a-4a32-5484-ba70-875d765a9175" class="er entityLabel">User</text><rect height="22" width="59.381446838378906" y="23.600000381469727" x="0" class="er attributeBoxOdd"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(5,34.60000038146973)" y="0" x="0" id="text-entity-User-818c511a-4a32-5484-ba70-875d765a9175-attr-1-type" class="er entityLabel">integer</text><rect height="22" width="74.4610366821289" y="23.600000381469727" x="59.381446838378906" class="er attributeBoxOdd"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(64.3814468383789,34.60000038146973)" y="0" x="0" id="text-entity-User-818c511a-4a32-5484-ba70-875d765a9175-attr-1-name" class="er entityLabel">id</text><rect height="22" width="22.087695121765137" y="23.600000381469727" x="133.8424835205078" class="er attributeBoxOdd"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(138.8424835205078,34.60000038146973)" y="0" x="0" id="text-entity-User-818c511a-4a32-5484-ba70-875d765a9175-attr-1-key" class="er entityLabel">PK</text><rect height="22" width="59.381446838378906" y="45.60000038146973" x="0" class="er attributeBoxEven"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(5,56.60000038146973)" y="0" x="0" id="text-entity-User-818c511a-4a32-5484-ba70-875d765a9175-attr-2-type" class="er entityLabel">string</text><rect height="22" width="74.4610366821289" y="45.60000038146973" x="59.381446838378906" class="er attributeBoxEven"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(64.3814468383789,56.60000038146973)" y="0" x="0" id="text-entity-User-818c511a-4a32-5484-ba70-875d765a9175-attr-2-name" class="er entityLabel">name</text><rect height="22" width="22.087695121765137" y="45.60000038146973" x="133.8424835205078" class="er attributeBoxEven"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(138.8424835205078,56.60000038146973)" y="0" x="0" id="text-entity-User-818c511a-4a32-5484-ba70-875d765a9175-attr-2-key" class="er entityLabel"></text><rect height="22" width="59.381446838378906" y="67.60000038146973" x="0" class="er attributeBoxOdd"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(5,78.60000038146973)" y="0" x="0" id="text-entity-User-818c511a-4a32-5484-ba70-875d765a9175-attr-3-type" class="er entityLabel">string</text><rect height="22" width="74.4610366821289" y="67.60000038146973" x="59.381446838378906" class="er attributeBoxOdd"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(64.3814468383789,78.60000038146973)" y="0" x="0" id="text-entity-User-818c511a-4a32-5484-ba70-875d765a9175-attr-3-name" class="er entityLabel">email</text><rect height="22" width="22.087695121765137" y="67.60000038146973" x="133.8424835205078" class="er attributeBoxOdd"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(138.8424835205078,78.60000038146973)" y="0" x="0" id="text-entity-User-818c511a-4a32-5484-ba70-875d765a9175-attr-3-key" class="er entityLabel"></text><rect height="22" width="59.381446838378906" y="89.60000038146973" x="0" class="er attributeBoxEven"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(5,100.60000038146973)" y="0" x="0" id="text-entity-User-818c511a-4a32-5484-ba70-875d765a9175-attr-4-type" class="er entityLabel">string</text><rect height="22" width="74.4610366821289" y="89.60000038146973" x="59.381446838378906" class="er attributeBoxEven"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(64.3814468383789,100.60000038146973)" y="0" x="0" id="text-entity-User-818c511a-4a32-5484-ba70-875d765a9175-attr-4-name" class="er entityLabel">password</text><rect height="22" width="22.087695121765137" y="89.60000038146973" x="133.8424835205078" class="er attributeBoxEven"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(138.8424835205078,100.60000038146973)" y="0" x="0" id="text-entity-User-818c511a-4a32-5484-ba70-875d765a9175-attr-4-key" class="er entityLabel"></text><rect height="22" width="59.381446838378906" y="111.60000038146973" x="0" class="er attributeBoxOdd"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(5,122.60000038146973)" y="0" x="0" id="text-entity-User-818c511a-4a32-5484-ba70-875d765a9175-attr-5-type" class="er entityLabel">string</text><rect height="22" width="74.4610366821289" y="111.60000038146973" x="59.381446838378906" class="er attributeBoxOdd"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(64.3814468383789,122.60000038146973)" y="0" x="0" id="text-entity-User-818c511a-4a32-5484-ba70-875d765a9175-attr-5-name" class="er entityLabel">phoneNumber</text><rect height="22" width="22.087695121765137" y="111.60000038146973" x="133.8424835205078" class="er attributeBoxOdd"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(138.8424835205078,122.60000038146973)" y="0" x="0" id="text-entity-User-818c511a-4a32-5484-ba70-875d765a9175-attr-5-key" class="er entityLabel"></text><rect height="22" width="59.381446838378906" y="133.60000038146973" x="0" class="er attributeBoxEven"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(5,144.60000038146973)" y="0" x="0" id="text-entity-User-818c511a-4a32-5484-ba70-875d765a9175-attr-6-type" class="er entityLabel">string</text><rect height="22" width="74.4610366821289" y="133.60000038146973" x="59.381446838378906" class="er attributeBoxEven"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(64.3814468383789,144.60000038146973)" y="0" x="0" id="text-entity-User-818c511a-4a32-5484-ba70-875d765a9175-attr-6-name" class="er entityLabel">address</text><rect height="22" width="22.087695121765137" y="133.60000038146973" x="133.8424835205078" class="er attributeBoxEven"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(138.8424835205078,144.60000038146973)" y="0" x="0" id="text-entity-User-818c511a-4a32-5484-ba70-875d765a9175-attr-6-key" class="er entityLabel"></text><rect height="22" width="59.381446838378906" y="155.60000038146973" x="0" class="er attributeBoxOdd"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(5,166.60000038146973)" y="0" x="0" id="text-entity-User-818c511a-4a32-5484-ba70-875d765a9175-attr-7-type" class="er entityLabel">timestamp</text><rect height="22" width="74.4610366821289" y="155.60000038146973" x="59.381446838378906" class="er attributeBoxOdd"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(64.3814468383789,166.60000038146973)" y="0" x="0" id="text-entity-User-818c511a-4a32-5484-ba70-875d765a9175-attr-7-name" class="er entityLabel">createdAt</text><rect height="22" width="22.087695121765137" y="155.60000038146973" x="133.8424835205078" class="er attributeBoxOdd"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(138.8424835205078,166.60000038146973)" y="0" x="0" id="text-entity-User-818c511a-4a32-5484-ba70-875d765a9175-attr-7-key" class="er entityLabel"></text><rect height="22" width="59.381446838378906" y="177.60000038146973" x="0" class="er attributeBoxEven"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(5,188.60000038146973)" y="0" x="0" id="text-entity-User-818c511a-4a32-5484-ba70-875d765a9175-attr-8-type" class="er entityLabel">timestamp</text><rect height="22" width="74.4610366821289" y="177.60000038146973" x="59.381446838378906" class="er attributeBoxEven"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(64.3814468383789,188.60000038146973)" y="0" x="0" id="text-entity-User-818c511a-4a32-5484-ba70-875d765a9175-attr-8-name" class="er entityLabel">updatedAt</text><rect height="22" width="22.087695121765137" y="177.60000038146973" x="133.8424835205078" class="er attributeBoxEven"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(138.8424835205078,188.60000038146973)" y="0" x="0" id="text-entity-User-818c511a-4a32-5484-ba70-875d765a9175-attr-8-key" class="er entityLabel"></text></g><g transform="translate(150.8447265625,319.6000061035156 )" id="entity-Advertise-9e84afdb-25a2-5f02-9617-50e324c2e71c"><rect height="199.60000038146973" width="142.1423864364624" y="0" x="0" class="er entityBox"></rect><text style="dominant-baseline: middle; text-anchor: middle; font-size: 12px;" transform="translate(71.0711932182312,11.800000190734863)" y="0" x="0" id="text-entity-Advertise-9e84afdb-25a2-5f02-9617-50e324c2e71c" class="er entityLabel">Advertise</text><rect height="22" width="59.381446838378906" y="23.600000381469727" x="0" class="er attributeBoxOdd"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(5,34.60000038146973)" y="0" x="0" id="text-entity-Advertise-9e84afdb-25a2-5f02-9617-50e324c2e71c-attr-1-type" class="er entityLabel">integer</text><rect height="22" width="61.006935119628906" y="23.600000381469727" x="59.381446838378906" class="er attributeBoxOdd"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(64.3814468383789,34.60000038146973)" y="0" x="0" id="text-entity-Advertise-9e84afdb-25a2-5f02-9617-50e324c2e71c-attr-1-name" class="er entityLabel">id</text><rect height="22" width="21.75400447845459" y="23.600000381469727" x="120.38838195800781" class="er attributeBoxOdd"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(125.38838195800781,34.60000038146973)" y="0" x="0" id="text-entity-Advertise-9e84afdb-25a2-5f02-9617-50e324c2e71c-attr-1-key" class="er entityLabel"></text><rect height="22" width="59.381446838378906" y="45.60000038146973" x="0" class="er attributeBoxEven"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(5,56.60000038146973)" y="0" x="0" id="text-entity-Advertise-9e84afdb-25a2-5f02-9617-50e324c2e71c-attr-2-type" class="er entityLabel">string</text><rect height="22" width="61.006935119628906" y="45.60000038146973" x="59.381446838378906" class="er attributeBoxEven"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(64.3814468383789,56.60000038146973)" y="0" x="0" id="text-entity-Advertise-9e84afdb-25a2-5f02-9617-50e324c2e71c-attr-2-name" class="er entityLabel">title</text><rect height="22" width="21.75400447845459" y="45.60000038146973" x="120.38838195800781" class="er attributeBoxEven"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(125.38838195800781,56.60000038146973)" y="0" x="0" id="text-entity-Advertise-9e84afdb-25a2-5f02-9617-50e324c2e71c-attr-2-key" class="er entityLabel"></text><rect height="22" width="59.381446838378906" y="67.60000038146973" x="0" class="er attributeBoxOdd"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(5,78.60000038146973)" y="0" x="0" id="text-entity-Advertise-9e84afdb-25a2-5f02-9617-50e324c2e71c-attr-3-type" class="er entityLabel">string</text><rect height="22" width="61.006935119628906" y="67.60000038146973" x="59.381446838378906" class="er attributeBoxOdd"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(64.3814468383789,78.60000038146973)" y="0" x="0" id="text-entity-Advertise-9e84afdb-25a2-5f02-9617-50e324c2e71c-attr-3-name" class="er entityLabel">description</text><rect height="22" width="21.75400447845459" y="67.60000038146973" x="120.38838195800781" class="er attributeBoxOdd"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(125.38838195800781,78.60000038146973)" y="0" x="0" id="text-entity-Advertise-9e84afdb-25a2-5f02-9617-50e324c2e71c-attr-3-key" class="er entityLabel"></text><rect height="22" width="59.381446838378906" y="89.60000038146973" x="0" class="er attributeBoxEven"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(5,100.60000038146973)" y="0" x="0" id="text-entity-Advertise-9e84afdb-25a2-5f02-9617-50e324c2e71c-attr-4-type" class="er entityLabel">integer</text><rect height="22" width="61.006935119628906" y="89.60000038146973" x="59.381446838378906" class="er attributeBoxEven"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(64.3814468383789,100.60000038146973)" y="0" x="0" id="text-entity-Advertise-9e84afdb-25a2-5f02-9617-50e324c2e71c-attr-4-name" class="er entityLabel">price</text><rect height="22" width="21.75400447845459" y="89.60000038146973" x="120.38838195800781" class="er attributeBoxEven"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(125.38838195800781,100.60000038146973)" y="0" x="0" id="text-entity-Advertise-9e84afdb-25a2-5f02-9617-50e324c2e71c-attr-4-key" class="er entityLabel"></text><rect height="22" width="59.381446838378906" y="111.60000038146973" x="0" class="er attributeBoxOdd"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(5,122.60000038146973)" y="0" x="0" id="text-entity-Advertise-9e84afdb-25a2-5f02-9617-50e324c2e71c-attr-5-type" class="er entityLabel">timestamp</text><rect height="22" width="61.006935119628906" y="111.60000038146973" x="59.381446838378906" class="er attributeBoxOdd"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(64.3814468383789,122.60000038146973)" y="0" x="0" id="text-entity-Advertise-9e84afdb-25a2-5f02-9617-50e324c2e71c-attr-5-name" class="er entityLabel">createdAt</text><rect height="22" width="21.75400447845459" y="111.60000038146973" x="120.38838195800781" class="er attributeBoxOdd"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(125.38838195800781,122.60000038146973)" y="0" x="0" id="text-entity-Advertise-9e84afdb-25a2-5f02-9617-50e324c2e71c-attr-5-key" class="er entityLabel"></text><rect height="22" width="59.381446838378906" y="133.60000038146973" x="0" class="er attributeBoxEven"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(5,144.60000038146973)" y="0" x="0" id="text-entity-Advertise-9e84afdb-25a2-5f02-9617-50e324c2e71c-attr-6-type" class="er entityLabel">timestamp</text><rect height="22" width="61.006935119628906" y="133.60000038146973" x="59.381446838378906" class="er attributeBoxEven"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(64.3814468383789,144.60000038146973)" y="0" x="0" id="text-entity-Advertise-9e84afdb-25a2-5f02-9617-50e324c2e71c-attr-6-name" class="er entityLabel">updatedAt</text><rect height="22" width="21.75400447845459" y="133.60000038146973" x="120.38838195800781" class="er attributeBoxEven"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(125.38838195800781,144.60000038146973)" y="0" x="0" id="text-entity-Advertise-9e84afdb-25a2-5f02-9617-50e324c2e71c-attr-6-key" class="er entityLabel"></text><rect height="22" width="59.381446838378906" y="155.60000038146973" x="0" class="er attributeBoxOdd"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(5,166.60000038146973)" y="0" x="0" id="text-entity-Advertise-9e84afdb-25a2-5f02-9617-50e324c2e71c-attr-7-type" class="er entityLabel">integer</text><rect height="22" width="61.006935119628906" y="155.60000038146973" x="59.381446838378906" class="er attributeBoxOdd"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(64.3814468383789,166.60000038146973)" y="0" x="0" id="text-entity-Advertise-9e84afdb-25a2-5f02-9617-50e324c2e71c-attr-7-name" class="er entityLabel">userId</text><rect height="22" width="21.75400447845459" y="155.60000038146973" x="120.38838195800781" class="er attributeBoxOdd"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(125.38838195800781,166.60000038146973)" y="0" x="0" id="text-entity-Advertise-9e84afdb-25a2-5f02-9617-50e324c2e71c-attr-7-key" class="er entityLabel">FK</text><rect height="22" width="59.381446838378906" y="177.60000038146973" x="0" class="er attributeBoxEven"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(5,188.60000038146973)" y="0" x="0" id="text-entity-Advertise-9e84afdb-25a2-5f02-9617-50e324c2e71c-attr-8-type" class="er entityLabel">integer</text><rect height="22" width="61.006935119628906" y="177.60000038146973" x="59.381446838378906" class="er attributeBoxEven"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(64.3814468383789,188.60000038146973)" y="0" x="0" id="text-entity-Advertise-9e84afdb-25a2-5f02-9617-50e324c2e71c-attr-8-name" class="er entityLabel">categoryId</text><rect height="22" width="21.75400447845459" y="177.60000038146973" x="120.38838195800781" class="er attributeBoxEven"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(125.38838195800781,188.60000038146973)" y="0" x="0" id="text-entity-Advertise-9e84afdb-25a2-5f02-9617-50e324c2e71c-attr-8-key" class="er entityLabel">FK</text></g><g transform="translate(275.93017578125,64.00000381469727 )" id="entity-Category-1a07ff93-e37c-5c4b-81d2-6cefab6d4eed"><rect height="111.60000038146973" width="139.8731451034546" y="0" x="0" class="er entityBox"></rect><text style="dominant-baseline: middle; text-anchor: middle; font-size: 12px;" transform="translate(69.9365725517273,11.800000190734863)" y="0" x="0" id="text-entity-Category-1a07ff93-e37c-5c4b-81d2-6cefab6d4eed" class="er entityLabel">Category</text><rect height="22" width="59.381446838378906" y="23.600000381469727" x="0" class="er attributeBoxOdd"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(5,34.60000038146973)" y="0" x="0" id="text-entity-Category-1a07ff93-e37c-5c4b-81d2-6cefab6d4eed-attr-1-type" class="er entityLabel">integer</text><rect height="22" width="58.40400314331055" y="23.600000381469727" x="59.381446838378906" class="er attributeBoxOdd"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(64.3814468383789,34.60000038146973)" y="0" x="0" id="text-entity-Category-1a07ff93-e37c-5c4b-81d2-6cefab6d4eed-attr-1-name" class="er entityLabel">id</text><rect height="22" width="22.087695121765137" y="23.600000381469727" x="117.78544998168945" class="er attributeBoxOdd"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(122.78544998168945,34.60000038146973)" y="0" x="0" id="text-entity-Category-1a07ff93-e37c-5c4b-81d2-6cefab6d4eed-attr-1-key" class="er entityLabel">PK</text><rect height="22" width="59.381446838378906" y="45.60000038146973" x="0" class="er attributeBoxEven"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(5,56.60000038146973)" y="0" x="0" id="text-entity-Category-1a07ff93-e37c-5c4b-81d2-6cefab6d4eed-attr-2-type" class="er entityLabel">string</text><rect height="22" width="58.40400314331055" y="45.60000038146973" x="59.381446838378906" class="er attributeBoxEven"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(64.3814468383789,56.60000038146973)" y="0" x="0" id="text-entity-Category-1a07ff93-e37c-5c4b-81d2-6cefab6d4eed-attr-2-name" class="er entityLabel">name</text><rect height="22" width="22.087695121765137" y="45.60000038146973" x="117.78544998168945" class="er attributeBoxEven"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(122.78544998168945,56.60000038146973)" y="0" x="0" id="text-entity-Category-1a07ff93-e37c-5c4b-81d2-6cefab6d4eed-attr-2-key" class="er entityLabel"></text><rect height="22" width="59.381446838378906" y="67.60000038146973" x="0" class="er attributeBoxOdd"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(5,78.60000038146973)" y="0" x="0" id="text-entity-Category-1a07ff93-e37c-5c4b-81d2-6cefab6d4eed-attr-3-type" class="er entityLabel">timestamp</text><rect height="22" width="58.40400314331055" y="67.60000038146973" x="59.381446838378906" class="er attributeBoxOdd"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(64.3814468383789,78.60000038146973)" y="0" x="0" id="text-entity-Category-1a07ff93-e37c-5c4b-81d2-6cefab6d4eed-attr-3-name" class="er entityLabel">createdAt</text><rect height="22" width="22.087695121765137" y="67.60000038146973" x="117.78544998168945" class="er attributeBoxOdd"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(122.78544998168945,78.60000038146973)" y="0" x="0" id="text-entity-Category-1a07ff93-e37c-5c4b-81d2-6cefab6d4eed-attr-3-key" class="er entityLabel"></text><rect height="22" width="59.381446838378906" y="89.60000038146973" x="0" class="er attributeBoxEven"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(5,100.60000038146973)" y="0" x="0" id="text-entity-Category-1a07ff93-e37c-5c4b-81d2-6cefab6d4eed-attr-4-type" class="er entityLabel">timestamp</text><rect height="22" width="58.40400314331055" y="89.60000038146973" x="59.381446838378906" class="er attributeBoxEven"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(64.3814468383789,100.60000038146973)" y="0" x="0" id="text-entity-Category-1a07ff93-e37c-5c4b-81d2-6cefab6d4eed-attr-4-name" class="er entityLabel">updatedAt</text><rect height="22" width="22.087695121765137" y="89.60000038146973" x="117.78544998168945" class="er attributeBoxEven"></rect><text style="dominant-baseline: middle; font-size: 10.2px;" transform="translate(122.78544998168945,100.60000038146973)" y="0" x="0" id="text-entity-Category-1a07ff93-e37c-5c4b-81d2-6cefab6d4eed-attr-4-key" class="er entityLabel"></text></g><rect height="13.600000381469727" width="26.787500381469727" y="274.99812602996826" x="98.59244060516357" class="er relationshipLabelBox"></rect><text style="text-anchor: middle; dominant-baseline: middle; font-size: 12px;" y="281.7981262207031" x="111.98619079589844" id="rel478" class="er relationshipLabel">owns</text><rect height="13.600000381469727" width="17.725000381469727" y="254.2100706100464" x="329.3253355026245" class="er relationshipLabelBox"></rect><text style="text-anchor: middle; dominant-baseline: middle; font-size: 12px;" y="261.01007080078125" x="338.1878356933594" id="rel479" class="er relationshipLabel">has</text></svg>![mermaid-diagram-2023-09-25-225252](https://github.com/amrmousa1682/spring-boot-api/assets/70464867/b4fc9f92-48b3-41e9-982a-74260e4df4d9)
)


## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvement, please open an issue or create a pull request.
Certainly! Here's an updated version of the README file that uses Maven instead of Gradle:

## License

This project is licensed under the [MIT License](LICENSE.txt).

