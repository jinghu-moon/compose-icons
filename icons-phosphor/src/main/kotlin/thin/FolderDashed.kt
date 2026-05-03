package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FolderDashed: ImageVector
    get() {
        if (_folderDashed != null) return _folderDashed!!
        _folderDashed = phosphorThinIcon(
            name = "FolderDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 92.000 208.000 C 92.000 210.209 90.209 212.000 88.000 212.000 L 39.380 212.000 C 33.100 211.989 28.011 206.900 28.000 200.620 L 28.000 192.000 C 28.000 189.791 29.791 188.000 32.000 188.000 C 34.209 188.000 36.000 189.791 36.000 192.000 L 36.000 200.620 C 36.005 202.484 37.516 203.995 39.380 204.000 L 88.000 204.000 C 90.209 204.000 92.000 205.791 92.000 208.000 ZM 160.000 204.000 L 128.000 204.000 C 125.791 204.000 124.000 205.791 124.000 208.000 C 124.000 210.209 125.791 212.000 128.000 212.000 L 160.000 212.000 C 162.209 212.000 164.000 210.209 164.000 208.000 C 164.000 205.791 162.209 204.000 160.000 204.000 ZM 224.000 148.000 C 221.791 148.000 220.000 149.791 220.000 152.000 L 220.000 200.890 C 219.995 202.605 218.605 203.995 216.890 204.000 L 200.000 204.000 C 197.791 204.000 196.000 205.791 196.000 208.000 C 196.000 210.209 197.791 212.000 200.000 212.000 L 216.890 212.000 C 223.024 211.994 227.994 207.024 228.000 200.890 L 228.000 152.000 C 228.000 149.791 226.209 148.000 224.000 148.000 ZM 216.000 76.000 L 168.000 76.000 C 165.791 76.000 164.000 77.791 164.000 80.000 C 164.000 82.209 165.791 84.000 168.000 84.000 L 216.000 84.000 C 218.209 84.000 220.000 85.791 220.000 88.000 L 220.000 112.000 C 220.000 114.209 221.791 116.000 224.000 116.000 C 226.209 116.000 228.000 114.209 228.000 112.000 L 228.000 88.000 C 228.000 81.373 222.627 76.000 216.000 76.000 ZM 28.000 80.000 L 28.000 56.000 C 28.000 49.373 33.373 44.000 40.000 44.000 L 92.690 44.000 C 95.874 43.992 98.928 45.260 101.170 47.520 L 130.830 77.170 C 131.975 78.314 132.318 80.036 131.698 81.531 C 131.079 83.027 129.619 84.001 128.000 84.000 L 32.000 84.000 C 29.791 84.000 28.000 82.209 28.000 80.000 ZM 36.000 76.000 L 118.340 76.000 L 95.510 53.170 C 94.762 52.422 93.748 52.002 92.690 52.000 L 40.000 52.000 C 37.791 52.000 36.000 53.791 36.000 56.000 ZM 32.000 156.000 C 34.209 156.000 36.000 154.209 36.000 152.000 L 36.000 120.000 C 36.000 117.791 34.209 116.000 32.000 116.000 C 29.791 116.000 28.000 117.791 28.000 120.000 L 28.000 152.000 C 28.000 154.209 29.791 156.000 32.000 156.000 Z"),
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
        return _folderDashed!!
    }

private var _folderDashed: ImageVector? = null
