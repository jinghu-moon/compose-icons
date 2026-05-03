package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowDownRight: ImageVector
    get() {
        if (_arrowDownRight != null) return _arrowDownRight!!
        _arrowDownRight = phosphorBoldIcon(
            name = "ArrowDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 204.000 88.000 L 204.000 192.000 C 204.000 198.627 198.627 204.000 192.000 204.000 L 88.000 204.000 C 81.373 204.000 76.000 198.627 76.000 192.000 C 76.000 185.373 81.373 180.000 88.000 180.000 L 163.000 180.000 L 55.510 72.480 C 50.816 67.786 50.816 60.174 55.510 55.480 C 60.204 50.786 67.816 50.786 72.510 55.480 L 180.000 163.000 L 180.000 88.000 C 180.000 81.373 185.373 76.000 192.000 76.000 C 198.627 76.000 204.000 81.373 204.000 88.000 Z"),
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
        return _arrowDownRight!!
    }

private var _arrowDownRight: ImageVector? = null
