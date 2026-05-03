package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowSquareUpRight: ImageVector
    get() {
        if (_arrowSquareUpRight != null) return _arrowSquareUpRight!!
        _arrowSquareUpRight = phosphorBoldIcon(
            name = "ArrowSquareUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 28.000 L 48.000 28.000 C 36.954 28.000 28.000 36.954 28.000 48.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 ZM 204.000 204.000 L 52.000 204.000 L 52.000 52.000 L 204.000 52.000 ZM 87.510 168.490 C 85.251 166.238 83.981 163.180 83.981 159.990 C 83.981 156.800 85.251 153.742 87.510 151.490 L 131.000 108.000 L 112.000 108.000 C 105.373 108.000 100.000 102.627 100.000 96.000 C 100.000 89.373 105.373 84.000 112.000 84.000 L 160.000 84.000 C 166.627 84.000 172.000 89.373 172.000 96.000 L 172.000 144.000 C 172.000 150.627 166.627 156.000 160.000 156.000 C 153.373 156.000 148.000 150.627 148.000 144.000 L 148.000 125.000 L 104.490 168.520 C 102.238 170.779 99.180 172.049 95.990 172.049 C 92.800 172.049 89.742 170.779 87.490 168.520 Z"),
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
        return _arrowSquareUpRight!!
    }

private var _arrowSquareUpRight: ImageVector? = null
