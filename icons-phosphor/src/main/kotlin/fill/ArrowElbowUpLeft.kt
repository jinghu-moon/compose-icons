package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowElbowUpLeft: ImageVector
    get() {
        if (_arrowElbowUpLeft != null) return _arrowElbowUpLeft!!
        _arrowElbowUpLeft = phosphorFillIcon(
            name = "ArrowElbowUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 80.000 L 200.000 224.000 C 200.000 228.418 196.418 232.000 192.000 232.000 C 187.582 232.000 184.000 228.418 184.000 224.000 L 184.000 88.000 L 104.000 88.000 L 104.000 128.000 C 104.003 131.238 102.053 134.158 99.062 135.397 C 96.071 136.636 92.628 135.951 90.340 133.660 L 42.340 85.660 C 40.838 84.159 39.994 82.123 39.994 80.000 C 39.994 77.877 40.838 75.841 42.340 74.340 L 90.340 26.340 C 92.628 24.049 96.071 23.364 99.062 24.603 C 102.053 25.842 104.003 28.762 104.000 32.000 L 104.000 72.000 L 192.000 72.000 C 196.418 72.000 200.000 75.582 200.000 80.000 Z"),
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
        return _arrowElbowUpLeft!!
    }

private var _arrowElbowUpLeft: ImageVector? = null
