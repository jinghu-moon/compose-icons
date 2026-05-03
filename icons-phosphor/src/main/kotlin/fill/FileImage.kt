package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileImage: ImageVector
    get() {
        if (_fileImage != null) return _fileImage!!
        _fileImage = phosphorFillIcon(
            name = "FileImage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 158.660 219.560 C 160.298 222.015 160.451 225.174 159.058 227.776 C 157.665 230.378 154.952 232.002 152.000 232.000 L 24.000 232.000 C 21.072 232.001 18.378 230.403 16.975 227.833 C 15.572 225.263 15.685 222.132 17.270 219.670 L 53.270 163.670 C 54.742 161.380 57.278 159.995 60.000 159.995 C 62.722 159.995 65.258 161.380 66.730 163.670 L 76.490 178.850 L 97.340 147.560 C 98.823 145.331 101.323 143.992 104.000 143.992 C 106.677 143.992 109.177 145.331 110.660 147.560 ZM 216.000 88.000 L 216.000 216.000 C 216.000 224.837 208.837 232.000 200.000 232.000 L 192.000 232.000 C 187.582 232.000 184.000 228.418 184.000 224.000 C 184.000 219.582 187.582 216.000 192.000 216.000 L 200.000 216.000 L 200.000 96.000 L 152.000 96.000 C 147.582 96.000 144.000 92.418 144.000 88.000 L 144.000 40.000 L 56.000 40.000 L 56.000 128.000 C 56.000 132.418 52.418 136.000 48.000 136.000 C 43.582 136.000 40.000 132.418 40.000 128.000 L 40.000 40.000 C 40.000 31.163 47.163 24.000 56.000 24.000 L 152.000 24.000 C 154.122 23.998 156.158 24.840 157.660 26.340 L 213.660 82.340 C 215.160 83.842 216.002 85.878 216.000 88.000 ZM 160.000 80.000 L 188.690 80.000 L 160.000 51.310 Z"),
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
        return _fileImage!!
    }

private var _fileImage: ImageVector? = null
