package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowArcLeft: ImageVector
    get() {
        if (_arrowArcLeft != null) return _arrowArcLeft!!
        _arrowArcLeft = phosphorLightIcon(
            name = "ArrowArcLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230 184c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6 0-36.402-21.927-69.219-55.558-83.15C128.811 86.92 90.1 94.62 64.36 120.36L38.55 146h49.45c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-64c-3.314 0-6-2.686-6-6v-64c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v49.58L55.89 111.86C85.065 82.697 128.934 73.978 167.044 89.768 205.153 105.558 230 142.749 230 184Z"),
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
        return _arrowArcLeft!!
    }

private var _arrowArcLeft: ImageVector? = null
