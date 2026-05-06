package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.WifiMedium: ImageVector
    get() {
        if (_wifiMedium != null) return _wifiMedium!!
        _wifiMedium = phosphorRegularIcon(
            name = "WifiMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M140 204c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM205 122.77C159.899 87.063 96.161 87.063 51.06 122.77c-3.463 2.745-4.045 7.777-1.3 11.24 2.745 3.463 7.777 4.045 11.24 1.3 39.279-31.091 94.781-31.091 134.06 0 1.663 1.318 3.781 1.922 5.889 1.678 2.108-.244 4.033-1.315 5.351-2.978 1.318-1.663 1.922-3.781 1.678-5.889-.244-2.108-1.315-4.033-2.978-5.351ZM172.74 158.53c-26.658-19.374-62.762-19.374-89.42 0-3.573 2.601-4.361 7.607-1.76 11.18 2.601 3.573 7.607 4.361 11.18 1.76 21.039-15.301 49.541-15.301 70.58 0 3.573 2.601 8.579 1.813 11.18-1.76 2.601-3.573 1.813-8.579-1.76-11.18Z"),
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
        return _wifiMedium!!
    }

private var _wifiMedium: ImageVector? = null
