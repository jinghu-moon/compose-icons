package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowUpLeft: ImageVector
    get() {
        if (_arrowUpLeft != null) return _arrowUpLeft!!
        _arrowUpLeft = phosphorLightIcon(
            name = "ArrowUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M196.24 196.24c-2.343 2.34-6.137 2.34-8.48 0L70 78.48v89.52c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-104c0-3.314 2.686-6 6-6h104c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-89.52L196.24 187.76c2.34 2.343 2.34 6.137 0 8.48Z"),
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
        return _arrowUpLeft!!
    }

private var _arrowUpLeft: ImageVector? = null
