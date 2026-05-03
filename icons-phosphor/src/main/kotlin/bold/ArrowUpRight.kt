package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowUpRight: ImageVector
    get() {
        if (_arrowUpRight != null) return _arrowUpRight!!
        _arrowUpRight = phosphorBoldIcon(
            name = "ArrowUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 204.000 64.000 L 204.000 168.000 C 204.000 174.627 198.627 180.000 192.000 180.000 C 185.373 180.000 180.000 174.627 180.000 168.000 L 180.000 93.000 L 72.490 200.490 C 67.796 205.184 60.184 205.184 55.490 200.490 C 50.796 195.796 50.796 188.184 55.490 183.490 L 163.000 76.000 L 88.000 76.000 C 81.373 76.000 76.000 70.627 76.000 64.000 C 76.000 57.373 81.373 52.000 88.000 52.000 L 192.000 52.000 C 198.627 52.000 204.000 57.373 204.000 64.000 Z"),
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
        return _arrowUpRight!!
    }

private var _arrowUpRight: ImageVector? = null
