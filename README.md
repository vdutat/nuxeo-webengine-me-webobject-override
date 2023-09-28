# nuxeo-webengine-me-webobject-override

## About / Synopsis

This plugin provides an override of the **web object** `me` by defining a new class `CustomMeObject` extending class `MeObject`.

It was generated with the following commands:
```
mkdir nuxeo-webengine-me-webobject-override && cd $_
nuxeo bootstrap multi-module 
nuxeo b single-module --type web
nuxeo bootstrap package
```

## Requirements

Building requires the following software:

* git
* maven

## Build

```
git clone ...
cd nuxeo-webengine-me-webobject-override

mvn clean install
```

## Installation

```
nuxeoctl mp-install nuxeo-webengine-me-webobject-override-package/target/nuxeo-webengine-me-webobject-override-*.zip
```

## Usage

```
curl -su Administrator:Administrator -H 'Content-Type:application/json' -H 'enrichers-user:userprofile' -H 'properties: *' 'http://localhost:8080/nuxeo/api/v1/me/'
```

## License

[Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

## About Nuxeo

Nuxeo Platform is an open source Content Services platform, written in Java. Data can be stored in both SQL & NoSQL databases.

The development of the Nuxeo Platform is mostly done by Nuxeo employees with an open development model.

The source code, documentation, roadmap, issue tracker, testing, benchmarks are all public.

Typically, Nuxeo users build different types of information management solutions for [document management](https://www.nuxeo.com/solutions/document-management/), [case management](https://www.nuxeo.com/solutions/case-management/), and [digital asset management](https://www.nuxeo.com/solutions/dam-digital-asset-management/), use cases. It uses schema-flexible metadata & content models that allows content to be repurposed to fulfill future use cases.

More information is available at [www.nuxeo.com](https://www.nuxeo.com).

