package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowLineUpRight: ImageVector
    get() {
        if (_arrowLineUpRight != null) return _arrowLineUpRight!!
        _arrowLineUpRight = phosphorBoldIcon(
            name = "ArrowLineUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 216.000 C 228.000 222.627 222.627 228.000 216.000 228.000 L 40.000 228.000 C 33.373 228.000 28.000 222.627 28.000 216.000 C 28.000 209.373 33.373 204.000 40.000 204.000 L 216.000 204.000 C 222.627 204.000 228.000 209.373 228.000 216.000 ZM 80.000 180.000 C 83.184 180.003 86.238 178.740 88.490 176.490 L 180.000 85.000 L 180.000 152.000 C 180.000 158.627 185.373 164.000 192.000 164.000 C 198.627 164.000 204.000 158.627 204.000 152.000 L 204.000 56.000 C 204.000 49.373 198.627 44.000 192.000 44.000 L 96.000 44.000 C 89.373 44.000 84.000 49.373 84.000 56.000 C 84.000 62.627 89.373 68.000 96.000 68.000 L 163.000 68.000 L 71.510 159.510 C 68.074 162.942 67.046 168.107 68.905 172.593 C 70.764 177.080 75.144 180.004 80.000 180.000 Z"),
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
        return _arrowLineUpRight!!
    }

private var _arrowLineUpRight: ImageVector? = null
