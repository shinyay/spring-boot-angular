#!/usr/bin/env fish

docker run --rm -it -v (pwd)/angularclient:/app angular:7.3.6 npm audit fix
