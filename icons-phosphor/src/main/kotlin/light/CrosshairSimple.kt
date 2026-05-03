package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CrosshairSimple: ImageVector
    get() {
        if (_crosshairSimple != null) return _crosshairSimple!!
        _crosshairSimple = phosphorLightIcon(
            name = "CrosshairSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 134.000 217.800 L 134.000 184.000 C 134.000 180.686 131.314 178.000 128.000 178.000 C 124.686 178.000 122.000 180.686 122.000 184.000 L 122.000 217.800 C 77.051 214.731 41.269 178.949 38.200 134.000 L 72.000 134.000 C 75.314 134.000 78.000 131.314 78.000 128.000 C 78.000 124.686 75.314 122.000 72.000 122.000 L 38.200 122.000 C 41.269 77.051 77.051 41.269 122.000 38.200 L 122.000 72.000 C 122.000 75.314 124.686 78.000 128.000 78.000 C 131.314 78.000 134.000 75.314 134.000 72.000 L 134.000 38.200 C 178.949 41.269 214.731 77.051 217.800 122.000 L 184.000 122.000 C 180.686 122.000 178.000 124.686 178.000 128.000 C 178.000 131.314 180.686 134.000 184.000 134.000 L 217.800 134.000 C 214.731 178.949 178.949 214.731 134.000 217.800 Z"),
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
        return _crosshairSimple!!
    }

private var _crosshairSimple: ImageVector? = null
