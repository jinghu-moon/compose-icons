package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowDownLeft: ImageVector
    get() {
        if (_arrowDownLeft != null) return _arrowDownLeft!!
        _arrowDownLeft = phosphorRegularIcon(
            name = "ArrowDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 197.660 69.660 L 83.310 184.000 L 168.000 184.000 C 172.418 184.000 176.000 187.582 176.000 192.000 C 176.000 196.418 172.418 200.000 168.000 200.000 L 64.000 200.000 C 59.582 200.000 56.000 196.418 56.000 192.000 L 56.000 88.000 C 56.000 83.582 59.582 80.000 64.000 80.000 C 68.418 80.000 72.000 83.582 72.000 88.000 L 72.000 172.690 L 186.340 58.340 C 189.466 55.214 194.534 55.214 197.660 58.340 C 200.786 61.466 200.786 66.534 197.660 69.660 Z"),
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
        return _arrowDownLeft!!
    }

private var _arrowDownLeft: ImageVector? = null
