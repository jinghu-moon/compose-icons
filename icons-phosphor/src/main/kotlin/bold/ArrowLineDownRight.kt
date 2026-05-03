package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowLineDownRight: ImageVector
    get() {
        if (_arrowLineDownRight != null) return _arrowLineDownRight!!
        _arrowLineDownRight = phosphorBoldIcon(
            name = "ArrowLineDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.000 40.000 C 228.000 46.627 222.627 52.000 216.000 52.000 L 40.000 52.000 C 33.373 52.000 28.000 46.627 28.000 40.000 C 28.000 33.373 33.373 28.000 40.000 28.000 L 216.000 28.000 C 222.627 28.000 228.000 33.373 228.000 40.000 ZM 192.000 92.000 C 185.373 92.000 180.000 97.373 180.000 104.000 L 180.000 171.000 L 88.490 79.510 C 83.796 74.816 76.184 74.816 71.490 79.510 C 66.796 84.204 66.796 91.816 71.490 96.510 L 163.000 188.000 L 96.000 188.000 C 89.373 188.000 84.000 193.373 84.000 200.000 C 84.000 206.627 89.373 212.000 96.000 212.000 L 192.000 212.000 C 198.627 212.000 204.000 206.627 204.000 200.000 L 204.000 104.000 C 204.000 97.373 198.627 92.000 192.000 92.000 Z"),
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
        return _arrowLineDownRight!!
    }

private var _arrowLineDownRight: ImageVector? = null
