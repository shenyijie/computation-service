# computation-service

Chart & analysis computation microservice

## Overview

This is a standalone microservice responsible for chart data calculation and analysis query.
It is split out from the original monolithic system to decouple heavy chart computation logic from core business flow.
The service exposes Dubbo RPC interfaces for upstream consumers.

## Core Workflow

1. Consumer calls the chart data interface with `analysisId` and query parameters
2. The service builds a Redis cache key based on analysisId + parameter fingerprint
3. First check Redis cache: return cached result directly if hit
4. If cache miss, load the analysis metadata from database
5. Execute chart calculation logic and assemble the result
6. Return structured JSON data to the caller

## Tech Stack

- Java + Spring Boot
- Apache Dubbo (RPC service)
- MyBatis
- MySQL
- Redis (cache for computation result)
- JSON serialization

## Key Features

- Cache-first design: Reduce repeated calculation pressure via Redis
- Parameter fingerprinting: Separate cache for different query conditions
- Request validation before computation
- Unified success/failure JSON response wrapper
- Stateless microservice, easy for independent scaling

## Design Note

This service is extracted for separation of concerns.
Chart aggregation and statistical computation are resource-consuming.
By isolating them into an independent microservice, we can scale computing resources independently without impacting other business modules.
