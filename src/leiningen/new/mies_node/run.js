try {
    require("source-map-support").install();
} catch(err) {
}
require("./out/goog/bootstrap/nodejs.js");
require("./out/{{sanitized}}.js");
goog.require("{{sanitized}}.core");
goog.require("cljs.nodejscli");
