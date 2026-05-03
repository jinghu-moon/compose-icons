package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowDownLeft: ImageVector
    get() {
        if (_arrowDownLeft != null) return _arrowDownLeft!!
        _arrowDownLeft = phosphorBoldIcon(
            name = "ArrowDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.490 72.480 L 93.000 180.000 L 168.000 180.000 C 174.627 180.000 180.000 185.373 180.000 192.000 C 180.000 198.627 174.627 204.000 168.000 204.000 L 64.000 204.000 C 57.373 204.000 52.000 198.627 52.000 192.000 L 52.000 88.000 C 52.000 81.373 57.373 76.000 64.000 76.000 C 70.627 76.000 76.000 81.373 76.000 88.000 L 76.000 163.000 L 183.510 55.510 C 188.204 50.816 195.816 50.816 200.510 55.510 C 205.204 60.204 205.204 67.816 200.510 72.510 Z"),
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
