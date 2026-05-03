package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowUpLeft: ImageVector
    get() {
        if (_arrowUpLeft != null) return _arrowUpLeft!!
        _arrowUpLeft = phosphorRegularIcon(
            name = "ArrowUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 197.660 197.660 C 196.159 199.162 194.123 200.006 192.000 200.006 C 189.877 200.006 187.841 199.162 186.340 197.660 L 72.000 83.310 L 72.000 168.000 C 72.000 172.418 68.418 176.000 64.000 176.000 C 59.582 176.000 56.000 172.418 56.000 168.000 L 56.000 64.000 C 56.000 59.582 59.582 56.000 64.000 56.000 L 168.000 56.000 C 172.418 56.000 176.000 59.582 176.000 64.000 C 176.000 68.418 172.418 72.000 168.000 72.000 L 83.310 72.000 L 197.660 186.340 C 199.162 187.841 200.006 189.877 200.006 192.000 C 200.006 194.123 199.162 196.159 197.660 197.660 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _arrowUpLeft!!
    }

private var _arrowUpLeft: ImageVector? = null
