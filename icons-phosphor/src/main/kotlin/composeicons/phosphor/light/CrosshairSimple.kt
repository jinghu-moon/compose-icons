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
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM134 217.8v-33.8c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v33.8C77.051 214.731 41.269 178.949 38.2 134h33.8c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-33.8C41.269 77.051 77.051 41.269 122 38.2v33.8c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-33.8c44.949 3.069 80.731 38.851 83.8 83.8h-33.8c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h33.8c-3.069 44.949-38.851 80.731-83.8 83.8Z"),
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
