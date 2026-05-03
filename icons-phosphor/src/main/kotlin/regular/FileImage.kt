package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FileImage: ImageVector
    get() {
        if (_fileImage != null) return _fileImage!!
        _fileImage = phosphorRegularIcon(
            name = "FileImage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 110.660 147.560 C 109.177 145.331 106.677 143.992 104.000 143.992 C 101.323 143.992 98.823 145.331 97.340 147.560 L 76.490 178.850 L 66.730 163.670 C 65.258 161.380 62.722 159.995 60.000 159.995 C 57.278 159.995 54.742 161.380 53.270 163.670 L 17.270 219.670 C 15.685 222.132 15.572 225.263 16.975 227.833 C 18.378 230.403 21.072 232.001 24.000 232.000 L 152.000 232.000 C 154.952 232.002 157.665 230.378 159.058 227.776 C 160.451 225.174 160.298 222.015 158.660 219.560 ZM 38.650 216.000 L 60.000 182.790 L 69.630 197.790 C 71.089 200.062 73.596 201.444 76.295 201.466 C 78.995 201.488 81.524 200.147 83.020 197.900 L 104.020 166.430 L 137.050 216.000 ZM 213.650 82.340 L 157.650 26.340 C 156.151 24.843 154.119 24.001 152.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 128.000 C 40.000 132.418 43.582 136.000 48.000 136.000 C 52.418 136.000 56.000 132.418 56.000 128.000 L 56.000 40.000 L 144.000 40.000 L 144.000 88.000 C 144.000 92.418 147.582 96.000 152.000 96.000 L 200.000 96.000 L 200.000 216.000 L 192.000 216.000 C 187.582 216.000 184.000 219.582 184.000 224.000 C 184.000 228.418 187.582 232.000 192.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 88.000 C 216.002 85.878 215.160 83.842 213.660 82.340 ZM 160.000 51.310 L 188.690 80.000 L 160.000 80.000 Z"),
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
