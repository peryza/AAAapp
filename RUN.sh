if [ -z "$URL" ]; then
    export URL=jdbc:h2:file:./db/aaa
fi
if [ -z "$LOGIN" ]; then
    export LOGIN=ArtBekk
fi
if [ -z "$PASS" ]; then
    export PASS=3678
fi

java -jar ./build/libs/AAAapp-1.0-fat-jar.jar $@