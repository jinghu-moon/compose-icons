package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FilePy: ImageVector
    get() {
        if (_filePy != null) return _filePy!!
        _filePy = phosphorRegularIcon(
            name = "FilePy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 213.660 82.340 L 157.660 26.340 C 156.158 24.840 154.122 23.998 152.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 112.000 C 40.000 116.418 43.582 120.000 48.000 120.000 C 52.418 120.000 56.000 116.418 56.000 112.000 L 56.000 40.000 L 144.000 40.000 L 144.000 88.000 C 144.000 92.418 147.582 96.000 152.000 96.000 L 200.000 96.000 L 200.000 216.000 L 168.000 216.000 C 163.582 216.000 160.000 219.582 160.000 224.000 C 160.000 228.418 163.582 232.000 168.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 88.000 C 216.002 85.878 215.160 83.842 213.660 82.340 ZM 160.000 51.310 L 188.690 80.000 L 160.000 80.000 ZM 64.000 144.000 L 48.000 144.000 C 43.582 144.000 40.000 147.582 40.000 152.000 L 40.000 208.000 C 40.000 212.418 43.582 216.000 48.000 216.000 C 52.418 216.000 56.000 212.418 56.000 208.000 L 56.000 200.000 L 64.000 200.000 C 79.464 200.000 92.000 187.464 92.000 172.000 C 92.000 156.536 79.464 144.000 64.000 144.000 ZM 64.000 184.000 L 56.000 184.000 L 56.000 160.000 L 64.000 160.000 C 70.627 160.000 76.000 165.373 76.000 172.000 C 76.000 178.627 70.627 184.000 64.000 184.000 ZM 154.780 156.240 L 136.000 186.240 L 136.000 208.000 C 136.000 212.418 132.418 216.000 128.000 216.000 C 123.582 216.000 120.000 212.418 120.000 208.000 L 120.000 186.290 L 101.220 156.290 C 99.604 153.866 99.434 150.754 100.776 148.168 C 102.118 145.582 104.760 143.930 107.672 143.856 C 110.585 143.781 113.308 145.296 114.780 147.810 L 128.000 168.910 L 141.220 147.760 C 142.692 145.246 145.415 143.731 148.328 143.806 C 151.240 143.880 153.882 145.532 155.224 148.118 C 156.566 150.704 156.396 153.816 154.780 156.240 Z"),
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
        return _filePy!!
    }

private var _filePy: ImageVector? = null
