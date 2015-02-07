try {
    require("source-map-support").install();
} catch(err) {
}
require("./resources/public/out/goog/bootstrap/nodejs.js");
require("./resources/public/out/{{sanitized}}.js");
goog.require("{{sanitized}}.core");
goog.require("cljs.nodejscli");
