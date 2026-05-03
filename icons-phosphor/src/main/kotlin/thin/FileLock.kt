package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileLock: ImageVector
    get() {
        if (_fileLock != null) return _fileLock!!
        _fileLock = phosphorThinIcon(
            name = "FileLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 120.000 180.000 L 108.000 180.000 L 108.000 172.000 C 108.000 158.745 97.255 148.000 84.000 148.000 C 70.745 148.000 60.000 158.745 60.000 172.000 L 60.000 180.000 L 48.000 180.000 C 45.791 180.000 44.000 181.791 44.000 184.000 L 44.000 224.000 C 44.000 226.209 45.791 228.000 48.000 228.000 L 120.000 228.000 C 122.209 228.000 124.000 226.209 124.000 224.000 L 124.000 184.000 C 124.000 181.791 122.209 180.000 120.000 180.000 ZM 68.000 172.000 C 68.000 163.163 75.163 156.000 84.000 156.000 C 92.837 156.000 100.000 163.163 100.000 172.000 L 100.000 180.000 L 68.000 180.000 ZM 116.000 220.000 L 52.000 220.000 L 52.000 188.000 L 116.000 188.000 ZM 210.830 85.170 L 154.830 29.170 C 154.079 28.420 153.061 27.999 152.000 28.000 L 56.000 28.000 C 49.373 28.000 44.000 33.373 44.000 40.000 L 44.000 128.000 C 44.000 130.209 45.791 132.000 48.000 132.000 C 50.209 132.000 52.000 130.209 52.000 128.000 L 52.000 40.000 C 52.000 37.791 53.791 36.000 56.000 36.000 L 148.000 36.000 L 148.000 88.000 C 148.000 90.209 149.791 92.000 152.000 92.000 L 204.000 92.000 L 204.000 216.000 C 204.000 218.209 202.209 220.000 200.000 220.000 L 160.000 220.000 C 157.791 220.000 156.000 221.791 156.000 224.000 C 156.000 226.209 157.791 228.000 160.000 228.000 L 200.000 228.000 C 206.627 228.000 212.000 222.627 212.000 216.000 L 212.000 88.000 C 212.001 86.939 211.580 85.921 210.830 85.170 ZM 156.000 41.650 L 198.340 84.000 L 156.000 84.000 Z"),
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
        return _fileLock!!
    }

private var _fileLock: ImageVector? = null
