# Website-BE

## For building a docker images two approaches are tested:

- Buildpack packeto built-in pluging. When `bootBuildImage` gradle task is executed.
- Jib Google library is configured as an example in the `gatewayserver` mircoservice. `jibDockerBuild` gradle task needs to be executed.

Buildpack is better for production producing a lighter image but Google Jib is faster building the image.