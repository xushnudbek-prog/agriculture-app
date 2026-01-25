# Agriculture App - Digital Procurement Platform

![Logo](static_images/basic%20stats.png)

## Overview

The **Agriculture App** is a modern Digital Procurement Platform designed for the Agriculture & Food Production industry. It provides a robust solution for managing procurement processes, leveraging a microservices-ready architecture with comprehensive observability.

## Features

- **Digital Procurement**: Streamlined workflows for food production and agricultural sourcing.
- **Microservices Ready**: Built on Spring Boot for scalability and maintainability.
- **Full Observability**: Integrated with Prometheus, Grafana, and Loki for real-time monitoring and logging.
- **Kubernetes Native**: Optimized for deployment in K8s environments with Helm and GitOps (ArgoCD).

## Tech Stack

- **Languange**: Java 21
- **Framework**: Spring Boot 4.x
- **Frontend**: Thymeleaf template engine
- **Metrics**: Spring Boot Actuator, Micrometer Prometheus
- **Monitoring**: Prometheus, Grafana, Loki, Promtail
- **Infrastructure**: Kubernetes, Helm, ArgoCD

## Technical Documentation

### Monitoring & Observability

The application exposes metrics via the `/actuator/prometheus` endpoint. A Kubernetes `ServiceMonitor` is configured to scrape these metrics every 15 seconds.

#### Grafana Dashboards

The following dashboards provide clear insights into application performance and health:

##### 1. JVM Performance
Detailed metrics about heap usage, GC, and thread counts.
![JVM Stats](static_images/jvm%20stats.png)
![JVM Stats 2](static_images/jvm%20stats%202.png)

##### 2. HTTP Traffic & Latency
Real-time tracking of request rates and average response times.
![Average Latency](static_images/avg%20latency.png)
![HTTP 200 Requests](static_images/http%20200%20avg%20request.png)

##### 3. Application Logging (Loki)
Aggregated logs visualization from across the cluster.
![Logback Stats](static_images/logback%20stats.png)

### Deployment

The application is deployed using **ArgoCD** for GitOps-based continuous delivery.

- **Environment**: `agri-dev` namespace
- **Helm Chart**: Located in `k8s/helm/agri-app`
- **ArgoCD Application**: Defined in `k8s/apps/agri-dev.yaml`

To deploy the application manually using Helm:
```bash
helm upgrade --install agri-app ./k8s/helm/agri-app -n agri-dev
```

## Getting Started

### Prerequisites

- JDK 21
- Maven 3.x
- Kubernetes Cluster (optional for local development)

### Running Locally

```bash
./mvnw spring-boot:run
```
The app will be accessible at `http://localhost:8080`.
Prometheus metrics will be at `http://localhost:8080/actuator/prometheus`.

## Directory Structure

```text
├── .github/          # CI/CD Workflows
├── k8s/              # Kubernetes Manifests
│   ├── apps/         # ArgoCD Application definitions
│   ├── helm/         # Helm Charts
│   └── monitoring/   # Prometheus & Loki configurations
├── src/              # Application Source Code
└── static_images/    # Documentation Assets
```
