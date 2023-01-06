rootProject.name = "rsoi-2022-lab4-deploy-to-k8s-gryteck"

include("common")

include("bonus-service-api")
include("ticket-service-api")
include("flight-service-api")
include("user-service-api")

include("config-server")
include("gateway")
include("ticket-service")
include("user-service")
include("bonus-service")
include("flight-service")
