package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Queue: ImageVector
    get() {
        if (_queue != null) return _queue!!
        _queue = phosphorBoldIcon(
            name = "Queue",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 28.000 64.000 C 28.000 57.373 33.373 52.000 40.000 52.000 L 216.000 52.000 C 222.627 52.000 228.000 57.373 228.000 64.000 C 228.000 70.627 222.627 76.000 216.000 76.000 L 40.000 76.000 C 33.373 76.000 28.000 70.627 28.000 64.000 ZM 132.000 116.000 L 40.000 116.000 C 33.373 116.000 28.000 121.373 28.000 128.000 C 28.000 134.627 33.373 140.000 40.000 140.000 L 132.000 140.000 C 138.627 140.000 144.000 134.627 144.000 128.000 C 144.000 121.373 138.627 116.000 132.000 116.000 ZM 132.000 180.000 L 40.000 180.000 C 33.373 180.000 28.000 185.373 28.000 192.000 C 28.000 198.627 33.373 204.000 40.000 204.000 L 132.000 204.000 C 138.627 204.000 144.000 198.627 144.000 192.000 C 144.000 185.373 138.627 180.000 132.000 180.000 ZM 252.000 160.000 C 252.001 164.139 249.870 167.986 246.360 170.180 L 182.360 210.180 C 178.660 212.492 173.997 212.614 170.181 210.499 C 166.365 208.383 163.999 204.363 164.000 200.000 L 164.000 120.000 C 163.999 115.637 166.365 111.617 170.181 109.501 C 173.997 107.386 178.660 107.508 182.360 109.820 L 246.360 149.820 C 249.870 152.014 252.001 155.861 252.000 160.000 ZM 217.360 160.000 L 188.000 141.650 L 188.000 178.350 Z"),
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
        return _queue!!
    }

private var _queue: ImageVector? = null
