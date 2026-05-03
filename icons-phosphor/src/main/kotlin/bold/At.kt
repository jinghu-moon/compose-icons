package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.At: ImageVector
    get() {
        if (_at != null) return _at!!
        _at = phosphorBoldIcon(
            name = "At",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 150.270 236.000 173.690 229.270 190.640 218.000 C 196.163 214.330 197.665 206.878 193.995 201.355 C 190.325 195.832 182.873 194.330 177.350 198.000 C 164.350 206.630 145.460 212.000 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 212.000 137.290 210.330 145.080 207.310 149.950 C 204.670 154.190 201.310 156.000 196.000 156.000 C 190.690 156.000 187.330 154.190 184.690 149.950 C 181.690 145.080 180.000 137.290 180.000 128.000 L 180.000 88.000 C 179.999 82.048 175.637 76.997 169.749 76.129 C 163.861 75.262 158.227 78.841 156.510 84.540 C 133.556 69.458 102.831 74.827 86.353 96.800 C 69.875 118.773 73.327 149.772 94.235 167.583 C 115.143 185.393 146.296 183.872 165.370 164.110 C 172.300 174.300 182.810 180.000 196.000 180.000 C 220.670 180.000 236.000 160.080 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 156.000 C 112.536 156.000 100.000 143.464 100.000 128.000 C 100.000 112.536 112.536 100.000 128.000 100.000 C 143.464 100.000 156.000 112.536 156.000 128.000 C 156.000 143.464 143.464 156.000 128.000 156.000 Z"),
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
        return _at!!
    }

private var _at: ImageVector? = null
