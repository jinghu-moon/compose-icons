package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShieldSlash: ImageVector
    get() {
        if (_shieldSlash != null) return _shieldSlash!!
        _shieldSlash = phosphorLightIcon(
            name = "ShieldSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M52.44 36c-2.07-2.203-5.455-2.522-7.901-.745C42.094 37.033 41.353 40.351 42.81 43 37.491 45.123 34.001 50.273 34 56v56c0 51.94 25.12 83.4 46.2 100.64 22.73 18.6 45.27 24.89 46.22 25.15 1.034 .282 2.126 .282 3.16 0 1.36-.37 31.91-8.95 57.67-35.7L203.56 220c2.231 2.452 6.028 2.631 8.48 .4 2.452-2.231 2.631-6.028 .4-8.48ZM128 225.72C113.236 220.647 99.5 212.973 87.44 203.06 59.94 180.39 46 149.75 46 112v-56c0-1.105 .895-2 2-2h4.6L179.16 193.19C164.893 207.894 147.368 219.037 128 225.72ZM222 56v56c0 20.29-3.83 39.05-11.38 55.77-.971 2.15-3.111 3.531-5.47 3.53-.853 .002-1.696-.182-2.47-.54-3.016-1.363-4.359-4.912-3-7.93C206.53 147.67 210 130.57 210 112v-56c0-1.105-.895-2-2-2h-109.48c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h109.48c7.732 0 14 6.268 14 14Z"),
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
        return _shieldSlash!!
    }

private var _shieldSlash: ImageVector? = null
