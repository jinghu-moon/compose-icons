package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FolderSimpleDashed: ImageVector
    get() {
        if (_folderSimpleDashed != null) return _folderSimpleDashed!!
        _folderSimpleDashed = phosphorDuotoneIcon(
            name = "FolderSimpleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 224.000 88.000 L 224.000 200.890 C 224.000 204.817 220.817 208.000 216.890 208.000 L 40.000 208.000 C 35.582 208.000 32.000 204.418 32.000 200.000 L 32.000 64.000 C 32.000 59.582 35.582 56.000 40.000 56.000 L 93.330 56.000 C 95.061 56.000 96.745 56.561 98.130 57.600 L 125.870 78.400 C 127.255 79.439 128.939 80.000 130.670 80.000 L 216.000 80.000 C 220.418 80.000 224.000 83.582 224.000 88.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 24.000 80.000 L 24.000 64.000 C 24.000 55.163 31.163 48.000 40.000 48.000 L 93.330 48.000 C 96.791 48.009 100.156 49.131 102.930 51.200 L 132.800 73.600 C 136.335 76.251 137.051 81.265 134.400 84.800 C 131.749 88.335 126.735 89.051 123.200 86.400 L 93.330 64.000 L 40.000 64.000 L 40.000 80.000 C 40.000 84.418 36.418 88.000 32.000 88.000 C 27.582 88.000 24.000 84.418 24.000 80.000 ZM 88.000 200.000 L 40.000 200.000 L 40.000 192.000 C 40.000 187.582 36.418 184.000 32.000 184.000 C 27.582 184.000 24.000 187.582 24.000 192.000 L 24.000 200.620 C 24.011 209.110 30.890 215.989 39.380 216.000 L 88.000 216.000 C 92.418 216.000 96.000 212.418 96.000 208.000 C 96.000 203.582 92.418 200.000 88.000 200.000 ZM 160.000 200.000 L 128.000 200.000 C 123.582 200.000 120.000 203.582 120.000 208.000 C 120.000 212.418 123.582 216.000 128.000 216.000 L 160.000 216.000 C 164.418 216.000 168.000 212.418 168.000 208.000 C 168.000 203.582 164.418 200.000 160.000 200.000 ZM 224.000 144.000 C 219.582 144.000 216.000 147.582 216.000 152.000 L 216.000 200.000 L 200.000 200.000 C 195.582 200.000 192.000 203.582 192.000 208.000 C 192.000 212.418 195.582 216.000 200.000 216.000 L 216.890 216.000 C 225.230 215.989 231.989 209.230 232.000 200.890 L 232.000 152.000 C 232.000 147.582 228.418 144.000 224.000 144.000 ZM 216.000 72.000 L 168.000 72.000 C 163.582 72.000 160.000 75.582 160.000 80.000 C 160.000 84.418 163.582 88.000 168.000 88.000 L 216.000 88.000 L 216.000 112.000 C 216.000 116.418 219.582 120.000 224.000 120.000 C 228.418 120.000 232.000 116.418 232.000 112.000 L 232.000 88.000 C 232.000 79.163 224.837 72.000 216.000 72.000 ZM 32.000 160.000 C 36.418 160.000 40.000 156.418 40.000 152.000 L 40.000 120.000 C 40.000 115.582 36.418 112.000 32.000 112.000 C 27.582 112.000 24.000 115.582 24.000 120.000 L 24.000 152.000 C 24.000 156.418 27.582 160.000 32.000 160.000 Z"),
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
        return _folderSimpleDashed!!
    }

private var _folderSimpleDashed: ImageVector? = null
