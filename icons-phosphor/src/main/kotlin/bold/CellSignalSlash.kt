package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CellSignalSlash: ImageVector
    get() {
        if (_cellSignalSlash != null) return _cellSignalSlash!!
        _cellSignalSlash = phosphorBoldIcon(
            name = "CellSignalSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 92.000 152.000 L 92.000 200.000 C 92.000 206.627 86.627 212.000 80.000 212.000 C 73.373 212.000 68.000 206.627 68.000 200.000 L 68.000 152.000 C 68.000 145.373 73.373 140.000 80.000 140.000 C 86.627 140.000 92.000 145.373 92.000 152.000 ZM 40.000 180.000 C 33.373 180.000 28.000 185.373 28.000 192.000 L 28.000 200.000 C 28.000 206.627 33.373 212.000 40.000 212.000 C 46.627 212.000 52.000 206.627 52.000 200.000 L 52.000 192.000 C 52.000 185.373 46.627 180.000 40.000 180.000 ZM 216.880 207.930 L 56.880 31.930 C 54.012 28.697 49.628 27.256 45.401 28.157 C 41.175 29.058 37.759 32.162 36.459 36.284 C 35.159 40.405 36.175 44.907 39.120 48.070 L 108.000 123.840 L 108.000 200.000 C 108.000 206.627 113.373 212.000 120.000 212.000 C 126.627 212.000 132.000 206.627 132.000 200.000 L 132.000 150.240 L 148.000 167.840 L 148.000 200.000 C 148.000 206.627 153.373 212.000 160.000 212.000 C 166.627 212.000 172.000 206.627 172.000 200.000 L 172.000 194.240 L 199.120 224.070 C 203.598 228.880 211.111 229.194 215.974 224.774 C 220.837 220.355 221.241 212.846 216.880 207.930 ZM 160.000 115.740 C 166.627 115.740 172.000 110.367 172.000 103.740 L 172.000 72.000 C 172.000 65.373 166.627 60.000 160.000 60.000 C 153.373 60.000 148.000 65.373 148.000 72.000 L 148.000 103.740 C 148.000 110.367 153.373 115.740 160.000 115.740 ZM 200.000 159.740 C 206.627 159.740 212.000 154.367 212.000 147.740 L 212.000 32.000 C 212.000 25.373 206.627 20.000 200.000 20.000 C 193.373 20.000 188.000 25.373 188.000 32.000 L 188.000 147.740 C 188.000 154.367 193.373 159.740 200.000 159.740 Z"),
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
        return _cellSignalSlash!!
    }

private var _cellSignalSlash: ImageVector? = null
