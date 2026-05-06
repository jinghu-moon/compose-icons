package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MapPinPlus: ImageVector
    get() {
        if (_mapPinPlus != null) return _mapPinPlus!!
        _mapPinPlus = phosphorLightIcon(
            name = "MapPinPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M166 104c0 3.314-2.686 6-6 6h-26v26c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-26h-26c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h26v-26c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v26h26c3.314 0 6 2.686 6 6ZM214 104c0 30.91-14.34 63.74-41.47 94.94-12.245 14.151-26.027 26.896-41.09 38-2.066 1.445-4.814 1.445-6.88 0-15.063-11.104-28.845-23.849-41.09-38C56.34 167.74 42 134.91 42 104 42 56.504 80.504 18 128 18c47.496 0 86 38.504 86 86ZM202 104C202 63.131 168.869 30 128 30 87.131 30 54 63.131 54 104c0 59.62 59 108.93 74 120.51C143 212.93 202 163.62 202 104Z"),
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
        return _mapPinPlus!!
    }

private var _mapPinPlus: ImageVector? = null
