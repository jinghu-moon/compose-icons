package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileDashed: ImageVector
    get() {
        if (_fileDashed != null) return _fileDashed!!
        _fileDashed = phosphorFillIcon(
            name = "FileDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 80.000 224.000 C 80.000 228.418 76.418 232.000 72.000 232.000 L 56.000 232.000 C 47.163 232.000 40.000 224.837 40.000 216.000 L 40.000 184.000 C 40.000 179.582 43.582 176.000 48.000 176.000 C 52.418 176.000 56.000 179.582 56.000 184.000 L 56.000 216.000 L 72.000 216.000 C 76.418 216.000 80.000 219.582 80.000 224.000 ZM 213.660 82.340 L 157.660 26.340 C 156.158 24.840 154.122 23.998 152.000 24.000 L 120.000 24.000 C 115.582 24.000 112.000 27.582 112.000 32.000 C 112.000 36.418 115.582 40.000 120.000 40.000 L 144.000 40.000 L 144.000 88.000 C 144.000 92.418 147.582 96.000 152.000 96.000 L 200.000 96.000 L 200.000 136.000 C 200.000 140.418 203.582 144.000 208.000 144.000 C 212.418 144.000 216.000 140.418 216.000 136.000 L 216.000 88.000 C 216.002 85.878 215.160 83.842 213.660 82.340 ZM 80.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 64.000 C 40.000 68.418 43.582 72.000 48.000 72.000 C 52.418 72.000 56.000 68.418 56.000 64.000 L 56.000 40.000 L 80.000 40.000 C 84.418 40.000 88.000 36.418 88.000 32.000 C 88.000 27.582 84.418 24.000 80.000 24.000 ZM 208.000 168.000 C 203.582 168.000 200.000 171.582 200.000 176.000 L 200.000 216.000 L 192.000 216.000 C 187.582 216.000 184.000 219.582 184.000 224.000 C 184.000 228.418 187.582 232.000 192.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 176.000 C 216.000 171.582 212.418 168.000 208.000 168.000 ZM 48.000 152.000 C 52.418 152.000 56.000 148.418 56.000 144.000 L 56.000 104.000 C 56.000 99.582 52.418 96.000 48.000 96.000 C 43.582 96.000 40.000 99.582 40.000 104.000 L 40.000 144.000 C 40.000 148.418 43.582 152.000 48.000 152.000 ZM 152.000 216.000 L 112.000 216.000 C 107.582 216.000 104.000 219.582 104.000 224.000 C 104.000 228.418 107.582 232.000 112.000 232.000 L 152.000 232.000 C 156.418 232.000 160.000 228.418 160.000 224.000 C 160.000 219.582 156.418 216.000 152.000 216.000 Z"),
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
        return _fileDashed!!
    }

private var _fileDashed: ImageVector? = null
