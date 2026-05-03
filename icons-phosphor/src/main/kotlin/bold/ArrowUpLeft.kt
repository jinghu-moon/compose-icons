package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowUpLeft: ImageVector
    get() {
        if (_arrowUpLeft != null) return _arrowUpLeft!!
        _arrowUpLeft = phosphorBoldIcon(
            name = "ArrowUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.490 200.490 C 198.238 202.749 195.180 204.019 191.990 204.019 C 188.800 204.019 185.742 202.749 183.490 200.490 L 76.000 93.000 L 76.000 168.000 C 76.000 174.627 70.627 180.000 64.000 180.000 C 57.373 180.000 52.000 174.627 52.000 168.000 L 52.000 64.000 C 52.000 57.373 57.373 52.000 64.000 52.000 L 168.000 52.000 C 174.627 52.000 180.000 57.373 180.000 64.000 C 180.000 70.627 174.627 76.000 168.000 76.000 L 93.000 76.000 L 200.490 183.510 C 202.743 185.761 204.009 188.815 204.009 192.000 C 204.009 195.185 202.743 198.239 200.490 200.490 Z"),
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
