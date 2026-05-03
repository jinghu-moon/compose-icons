package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Infinity: ImageVector
    get() {
        if (_infinity != null) return _infinity!!
        _infinity = phosphorFillIcon(
            name = "Infinity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 204.280 156.280 C 188.725 171.836 163.528 171.912 147.880 156.450 L 97.290 111.340 L 97.000 111.000 C 87.619 101.651 72.438 101.669 63.079 111.039 C 53.719 120.410 53.719 135.590 63.079 144.961 C 72.438 154.331 87.619 154.349 97.000 145.000 C 97.360 144.640 97.710 144.270 98.000 143.900 C 100.927 140.586 105.986 140.273 109.300 143.200 C 112.614 146.127 112.927 151.186 110.000 154.500 C 109.450 155.120 108.870 155.730 108.290 156.310 C 92.692 171.912 67.407 171.939 51.775 156.371 C 36.144 140.803 36.068 115.519 51.606 99.857 C 67.144 84.196 92.429 84.072 108.120 99.580 L 158.700 144.690 L 159.030 145.000 C 168.419 154.340 183.600 154.309 192.951 144.931 C 202.303 135.552 202.289 120.371 192.921 111.009 C 183.554 101.647 168.373 101.643 159.000 111.000 C 158.640 111.360 158.300 111.720 158.000 112.100 C 155.076 115.414 150.019 115.729 146.705 112.805 C 143.391 109.881 143.076 104.824 146.000 101.510 C 146.540 100.890 147.120 100.270 147.710 99.690 C 163.379 84.366 188.461 84.504 203.960 100.000 C 219.459 115.496 219.602 140.579 204.280 156.250 Z"),
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
        return _infinity!!
    }

private var _infinity: ImageVector? = null
