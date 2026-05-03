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
                pathData = parseSvgPathData("M 196.240 196.240 C 193.897 198.580 190.103 198.580 187.760 196.240 L 70.000 78.480 L 70.000 168.000 C 70.000 171.314 67.314 174.000 64.000 174.000 C 60.686 174.000 58.000 171.314 58.000 168.000 L 58.000 64.000 C 58.000 60.686 60.686 58.000 64.000 58.000 L 168.000 58.000 C 171.314 58.000 174.000 60.686 174.000 64.000 C 174.000 67.314 171.314 70.000 168.000 70.000 L 78.480 70.000 L 196.240 187.760 C 198.580 190.103 198.580 193.897 196.240 196.240 Z"),
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
