package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HighHeel: ImageVector
    get() {
        if (_highHeel != null) return _highHeel!!
        _highHeel = phosphorLightIcon(
            name = "HighHeel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230.53 158.14 179 146.53 68.24 35.76C67.082 34.602 65.502 33.967 63.864 34.003c-1.637 .036-3.189 .739-4.294 1.947C37.92 59.62 26 89.47 26 120v72c0 7.732 6.268 14 14 14h32c7.732 0 14-6.268 14-14v-52.35c23.401 12.665 41.687 33.053 51.74 57.69 2.153 5.275 7.303 8.706 13 8.66h89.26c7.732 0 14-6.268 14-14v-4.73c.031-14.032-9.753-26.175-23.47-29.13ZM74 192c0 1.105-.895 2-2 2h-32c-1.105 0-2-.895-2-2v-65.82c12.348 .615 24.51 3.257 36 7.82ZM242 192c0 1.105-.895 2-2 2h-89.28c-.8 .014-1.532-.45-1.86-1.18-9.324-22.936-25.171-42.633-45.58-56.65C84.053 122.902 61.495 115.281 38.16 114.17 39.47 90.66 48.6 67.83 64.31 48.79L171.76 156.24c.802 .802 1.814 1.36 2.92 1.61l53.23 12c8.233 1.758 14.11 9.041 14.09 17.46Z"),
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
        return _highHeel!!
    }

private var _highHeel: ImageVector? = null
