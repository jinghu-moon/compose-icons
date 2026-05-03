package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileLock: ImageVector
    get() {
        if (_fileLock != null) return _fileLock!!
        _fileLock = phosphorFillIcon(
            name = "FileLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 120.000 176.000 L 112.000 176.000 L 112.000 172.000 C 112.000 156.536 99.464 144.000 84.000 144.000 C 68.536 144.000 56.000 156.536 56.000 172.000 L 56.000 176.000 L 48.000 176.000 C 43.582 176.000 40.000 179.582 40.000 184.000 L 40.000 224.000 C 40.000 228.418 43.582 232.000 48.000 232.000 L 120.000 232.000 C 124.418 232.000 128.000 228.418 128.000 224.000 L 128.000 184.000 C 128.000 179.582 124.418 176.000 120.000 176.000 ZM 96.000 176.000 L 72.000 176.000 L 72.000 172.000 C 72.000 165.373 77.373 160.000 84.000 160.000 C 90.627 160.000 96.000 165.373 96.000 172.000 ZM 213.660 82.340 L 157.660 26.340 C 156.158 24.840 154.122 23.998 152.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 128.000 C 40.000 132.418 43.582 136.000 48.000 136.000 C 52.418 136.000 56.000 132.418 56.000 128.000 L 56.000 40.000 L 144.000 40.000 L 144.000 88.000 C 144.000 92.418 147.582 96.000 152.000 96.000 L 200.000 96.000 L 200.000 216.000 L 160.000 216.000 C 155.582 216.000 152.000 219.582 152.000 224.000 C 152.000 228.418 155.582 232.000 160.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 88.000 C 216.002 85.878 215.160 83.842 213.660 82.340 ZM 160.000 51.310 L 188.690 80.000 L 160.000 80.000 Z"),
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
