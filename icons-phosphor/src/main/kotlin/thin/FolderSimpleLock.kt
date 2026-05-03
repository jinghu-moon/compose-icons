package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FolderSimpleLock: ImageVector
    get() {
        if (_folderSimpleLock != null) return _folderSimpleLock!!
        _folderSimpleLock = phosphorThinIcon(
            name = "FolderSimpleLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 88.000 L 228.000 104.000 C 228.000 106.209 226.209 108.000 224.000 108.000 C 221.791 108.000 220.000 106.209 220.000 104.000 L 220.000 88.000 C 220.000 85.791 218.209 84.000 216.000 84.000 L 130.670 84.000 C 128.074 83.996 125.549 83.155 123.470 81.600 L 95.730 60.800 C 95.038 60.281 94.195 60.000 93.330 60.000 L 40.000 60.000 C 37.791 60.000 36.000 61.791 36.000 64.000 L 36.000 200.000 C 36.000 202.209 37.791 204.000 40.000 204.000 L 112.000 204.000 C 114.209 204.000 116.000 205.791 116.000 208.000 C 116.000 210.209 114.209 212.000 112.000 212.000 L 40.000 212.000 C 33.373 212.000 28.000 206.627 28.000 200.000 L 28.000 64.000 C 28.000 57.373 33.373 52.000 40.000 52.000 L 93.330 52.000 C 95.926 52.004 98.451 52.845 100.530 54.400 L 128.270 75.200 C 128.962 75.719 129.805 76.000 130.670 76.000 L 216.000 76.000 C 222.627 76.000 228.000 81.373 228.000 88.000 ZM 228.000 168.000 L 228.000 208.000 C 228.000 210.209 226.209 212.000 224.000 212.000 L 152.000 212.000 C 149.791 212.000 148.000 210.209 148.000 208.000 L 148.000 168.000 C 148.000 165.791 149.791 164.000 152.000 164.000 L 164.000 164.000 L 164.000 156.000 C 164.000 142.745 174.745 132.000 188.000 132.000 C 201.255 132.000 212.000 142.745 212.000 156.000 L 212.000 164.000 L 224.000 164.000 C 226.209 164.000 228.000 165.791 228.000 168.000 ZM 172.000 164.000 L 204.000 164.000 L 204.000 156.000 C 204.000 147.163 196.837 140.000 188.000 140.000 C 179.163 140.000 172.000 147.163 172.000 156.000 ZM 220.000 172.000 L 156.000 172.000 L 156.000 204.000 L 220.000 204.000 Z"),
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
        return _folderSimpleLock!!
    }

private var _folderSimpleLock: ImageVector? = null
