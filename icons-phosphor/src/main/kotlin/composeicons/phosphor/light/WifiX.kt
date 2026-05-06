package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.WifiX: ImageVector
    get() {
        if (_wifiX != null) return _wifiX!!
        _wifiX = phosphorLightIcon(
            name = "WifiX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M138 204c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM208.48 80 228.24 60.24c2.203-2.364 2.138-6.048-.147-8.333-2.285-2.285-5.969-2.35-8.333-.147L200 71.52 180.24 51.76c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333L191.52 80 171.76 99.76c-1.605 1.496-2.266 3.748-1.723 5.874 .543 2.126 2.203 3.786 4.329 4.329 2.126 .543 4.379-.118 5.874-1.723L200 88.48l19.76 19.76c2.364 2.203 6.048 2.138 8.333-.147 2.285-2.285 2.35-5.969 .147-8.333ZM171.53 160.15c-25.95-18.876-61.11-18.876-87.06 0-2.597 1.977-3.137 5.666-1.217 8.305 1.92 2.639 5.598 3.258 8.277 1.395 21.742-15.814 51.198-15.814 72.94 0 2.679 1.949 6.43 1.358 8.38-1.32 1.949-2.679 1.358-6.43-1.32-8.38ZM135.71 62.15c3.314 .16 6.13-2.396 6.29-5.71 .16-3.314-2.396-6.13-5.71-6.29-2.75-.13-5.54-.2-8.29-.2C88.685 49.988 50.595 63.626 20.19 88.55c-1.667 1.358-2.479 3.504-2.131 5.625 .349 2.121 1.806 3.894 3.82 4.647 2.014 .753 4.276 .371 5.931-1.002C56.072 74.675 91.47 62.019 128 62c2.56 0 5.16 .06 7.71 .18ZM135.59 110.23c3.314 .226 6.184-2.276 6.41-5.59 .226-3.314-2.276-6.184-5.59-6.41-2.79-.19-5.62-.29-8.41-.29-27.507-.102-54.224 9.191-75.73 26.34-2.598 2.06-3.035 5.837-.975 8.435 2.06 2.599 5.836 3.035 8.435 .975C79.122 118.244 103.209 109.886 128 110c2.52 0 5.08 .09 7.59 .26Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _wifiX!!
    }

private var _wifiX: ImageVector? = null
