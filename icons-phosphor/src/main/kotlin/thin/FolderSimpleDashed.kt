package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FolderSimpleDashed: ImageVector
    get() {
        if (_folderSimpleDashed != null) return _folderSimpleDashed!!
        _folderSimpleDashed = phosphorThinIcon(
            name = "FolderSimpleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 125.600 83.200 L 95.730 60.800 C 95.038 60.281 94.195 60.000 93.330 60.000 L 40.000 60.000 C 37.791 60.000 36.000 61.791 36.000 64.000 L 36.000 80.000 C 36.000 82.209 34.209 84.000 32.000 84.000 C 29.791 84.000 28.000 82.209 28.000 80.000 L 28.000 64.000 C 28.000 57.373 33.373 52.000 40.000 52.000 L 93.330 52.000 C 95.926 52.004 98.451 52.845 100.530 54.400 L 130.400 76.800 C 132.167 78.125 132.525 80.633 131.200 82.400 C 129.875 84.167 127.367 84.525 125.600 83.200 ZM 88.000 204.000 L 39.380 204.000 C 37.516 203.995 36.005 202.484 36.000 200.620 L 36.000 192.000 C 36.000 189.791 34.209 188.000 32.000 188.000 C 29.791 188.000 28.000 189.791 28.000 192.000 L 28.000 200.620 C 28.011 206.900 33.100 211.989 39.380 212.000 L 88.000 212.000 C 90.209 212.000 92.000 210.209 92.000 208.000 C 92.000 205.791 90.209 204.000 88.000 204.000 ZM 160.000 204.000 L 128.000 204.000 C 125.791 204.000 124.000 205.791 124.000 208.000 C 124.000 210.209 125.791 212.000 128.000 212.000 L 160.000 212.000 C 162.209 212.000 164.000 210.209 164.000 208.000 C 164.000 205.791 162.209 204.000 160.000 204.000 ZM 224.000 148.000 C 221.791 148.000 220.000 149.791 220.000 152.000 L 220.000 200.890 C 219.995 202.605 218.605 203.995 216.890 204.000 L 200.000 204.000 C 197.791 204.000 196.000 205.791 196.000 208.000 C 196.000 210.209 197.791 212.000 200.000 212.000 L 216.890 212.000 C 223.024 211.994 227.994 207.024 228.000 200.890 L 228.000 152.000 C 228.000 149.791 226.209 148.000 224.000 148.000 ZM 216.000 76.000 L 168.000 76.000 C 165.791 76.000 164.000 77.791 164.000 80.000 C 164.000 82.209 165.791 84.000 168.000 84.000 L 216.000 84.000 C 218.209 84.000 220.000 85.791 220.000 88.000 L 220.000 112.000 C 220.000 114.209 221.791 116.000 224.000 116.000 C 226.209 116.000 228.000 114.209 228.000 112.000 L 228.000 88.000 C 228.000 81.373 222.627 76.000 216.000 76.000 ZM 32.000 156.000 C 34.209 156.000 36.000 154.209 36.000 152.000 L 36.000 120.000 C 36.000 117.791 34.209 116.000 32.000 116.000 C 29.791 116.000 28.000 117.791 28.000 120.000 L 28.000 152.000 C 28.000 154.209 29.791 156.000 32.000 156.000 Z"),
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
        return _folderSimpleDashed!!
    }

private var _folderSimpleDashed: ImageVector? = null
