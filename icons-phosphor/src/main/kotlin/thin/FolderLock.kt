package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FolderLock: ImageVector
    get() {
        if (_folderLock != null) return _folderLock!!
        _folderLock = phosphorThinIcon(
            name = "FolderLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 164.000 L 212.000 164.000 L 212.000 156.000 C 212.000 142.745 201.255 132.000 188.000 132.000 C 174.745 132.000 164.000 142.745 164.000 156.000 L 164.000 164.000 L 152.000 164.000 C 149.791 164.000 148.000 165.791 148.000 168.000 L 148.000 208.000 C 148.000 210.209 149.791 212.000 152.000 212.000 L 224.000 212.000 C 226.209 212.000 228.000 210.209 228.000 208.000 L 228.000 168.000 C 228.000 165.791 226.209 164.000 224.000 164.000 ZM 172.000 156.000 C 172.000 147.163 179.163 140.000 188.000 140.000 C 196.837 140.000 204.000 147.163 204.000 156.000 L 204.000 164.000 L 172.000 164.000 ZM 220.000 204.000 L 156.000 204.000 L 156.000 172.000 L 220.000 172.000 ZM 216.000 76.000 L 129.660 76.000 L 101.170 47.510 C 98.920 45.263 95.870 44.000 92.690 44.000 L 40.000 44.000 C 33.373 44.000 28.000 49.373 28.000 56.000 L 28.000 200.620 C 28.011 206.900 33.100 211.989 39.380 212.000 L 112.560 212.000 C 114.769 212.000 116.560 210.209 116.560 208.000 C 116.560 205.791 114.769 204.000 112.560 204.000 L 39.380 204.000 C 37.516 203.995 36.005 202.484 36.000 200.620 L 36.000 84.000 L 216.000 84.000 C 218.209 84.000 220.000 85.791 220.000 88.000 L 220.000 104.000 C 220.000 106.209 221.791 108.000 224.000 108.000 C 226.209 108.000 228.000 106.209 228.000 104.000 L 228.000 88.000 C 228.000 81.373 222.627 76.000 216.000 76.000 ZM 40.000 52.000 L 92.690 52.000 C 93.748 52.002 94.762 52.422 95.510 53.170 L 118.340 76.000 L 36.000 76.000 L 36.000 56.000 C 36.000 53.791 37.791 52.000 40.000 52.000 Z"),
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
        return _folderLock!!
    }

private var _folderLock: ImageVector? = null
