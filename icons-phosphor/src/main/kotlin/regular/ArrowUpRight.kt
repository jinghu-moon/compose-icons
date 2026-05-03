package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowUpRight: ImageVector
    get() {
        if (_arrowUpRight != null) return _arrowUpRight!!
        _arrowUpRight = phosphorRegularIcon(
            name = "ArrowUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 64.000 L 200.000 168.000 C 200.000 172.418 196.418 176.000 192.000 176.000 C 187.582 176.000 184.000 172.418 184.000 168.000 L 184.000 83.310 L 69.660 197.660 C 66.534 200.786 61.466 200.786 58.340 197.660 C 55.214 194.534 55.214 189.466 58.340 186.340 L 172.690 72.000 L 88.000 72.000 C 83.582 72.000 80.000 68.418 80.000 64.000 C 80.000 59.582 83.582 56.000 88.000 56.000 L 192.000 56.000 C 196.418 56.000 200.000 59.582 200.000 64.000 Z"),
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
        return _arrowUpRight!!
    }

private var _arrowUpRight: ImageVector? = null
