package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GasPump: ImageVector
    get() {
        if (_gasPump != null) return _gasPump!!
        _gasPump = phosphorBoldIcon(
            name = "GasPump",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 247.800 66.830 L 228.490 47.510 C 223.796 42.816 216.184 42.816 211.490 47.510 C 206.796 52.204 206.796 59.816 211.490 64.510 L 230.830 83.800 C 231.580 84.551 232.001 85.569 232.000 86.630 L 232.000 166.000 C 232.000 169.314 229.314 172.000 226.000 172.000 C 222.686 172.000 220.000 169.314 220.000 166.000 L 220.000 128.000 C 220.000 112.536 207.464 100.000 192.000 100.000 L 180.000 100.000 L 180.000 56.000 C 180.000 40.536 167.464 28.000 152.000 28.000 L 72.000 28.000 C 56.536 28.000 44.000 40.536 44.000 56.000 L 44.000 204.000 L 32.000 204.000 C 25.373 204.000 20.000 209.373 20.000 216.000 C 20.000 222.627 25.373 228.000 32.000 228.000 L 192.000 228.000 C 198.627 228.000 204.000 222.627 204.000 216.000 C 204.000 209.373 198.627 204.000 192.000 204.000 L 180.000 204.000 L 180.000 124.000 L 192.000 124.000 C 194.209 124.000 196.000 125.791 196.000 128.000 L 196.000 166.000 C 196.000 182.569 209.431 196.000 226.000 196.000 C 242.569 196.000 256.000 182.569 256.000 166.000 L 256.000 86.630 C 256.022 79.200 253.069 72.070 247.800 66.830 ZM 68.000 204.000 L 68.000 56.000 C 68.000 53.791 69.791 52.000 72.000 52.000 L 152.000 52.000 C 154.209 52.000 156.000 53.791 156.000 56.000 L 156.000 204.000 ZM 140.000 112.000 C 140.000 118.627 134.627 124.000 128.000 124.000 L 96.000 124.000 C 89.373 124.000 84.000 118.627 84.000 112.000 C 84.000 105.373 89.373 100.000 96.000 100.000 L 128.000 100.000 C 134.627 100.000 140.000 105.373 140.000 112.000 Z"),
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
        return _gasPump!!
    }

private var _gasPump: ImageVector? = null
