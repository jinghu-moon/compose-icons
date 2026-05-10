package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.WifiSlash: ImageVector
    get() {
        if (_wifiSlash != null) return _wifiSlash!!
        _wifiSlash = phosphorFillIcon(
            name = "WifiSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.92 210.62c1.963 2.109 2.641 5.11 1.774 7.858-.867 2.748-3.144 4.817-5.961 5.418-2.818 .601-5.741-.36-7.653-2.515l-33.67-37-28.1 33.88c-3.041 3.654-7.556 5.76-12.31 5.74h0c-4.759 .012-9.275-2.104-12.31-5.77L11.65 92.8C8.882 89.494 7.602 85.192 8.11 80.91c.506-4.291 2.732-8.193 6.17-10.81C24.362 62.447 35.19 55.83 46.6 50.35L42.31 45.63c-3.014-3.215-2.957-8.235 .13-11.38 1.556-1.504 3.655-2.314 5.818-2.244 2.163 .07 4.206 1.013 5.662 2.614ZM247.92 80.91c-.506-4.291-2.732-8.193-6.17-10.81C209.058 45.231 169.076 31.839 128 32c-14.296-.012-28.549 1.581-42.49 4.75-1.374 .335-2.469 1.371-2.88 2.724-.411 1.353-.076 2.823 .88 3.866L186 156.07c.779 .844 1.883 1.312 3.032 1.285 1.148-.027 2.229-.546 2.968-1.425L244.35 92.8c2.768-3.306 4.048-7.608 3.54-11.89Z"),
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
        return _wifiSlash!!
    }

private var _wifiSlash: ImageVector? = null
