curl \
	-H "Content-Type: application/json" \
	-X POST \
	"http://localhost:8080/o/headless-delivery/v1.0/sites/${1}/navigation-menus" \
	-d "{\"name\": \"Foo\"}" \
	-u "test@liferay.com:learn"