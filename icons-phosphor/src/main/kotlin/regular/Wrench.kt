package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Wrench: ImageVector
    get() {
        if (_wrench != null) return _wrench!!
        _wrench = phosphorRegularIcon(
            name = "Wrench",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 226.760 69.000 C 225.775 66.565 223.658 64.769 221.095 64.194 C 218.532 63.620 215.851 64.339 213.920 66.120 L 173.620 103.310 L 156.390 99.610 L 152.690 82.380 L 189.880 42.080 C 191.661 40.149 192.380 37.468 191.806 34.905 C 191.231 32.342 189.435 30.225 187.000 29.240 C 164.804 20.261 139.596 22.904 119.745 36.291 C 99.893 49.677 87.995 72.057 88.000 96.000 C 87.987 105.957 90.030 115.809 94.000 124.940 L 33.790 177.000 C 33.640 177.120 33.500 177.260 33.360 177.390 C 20.862 189.888 20.862 210.152 33.360 222.650 C 45.858 235.148 66.122 235.148 78.620 222.650 C 78.750 222.520 78.890 222.370 79.010 222.230 L 131.060 162.000 C 153.335 171.778 179.042 169.647 199.402 156.334 C 219.763 143.021 232.024 120.327 232.000 96.000 C 232.016 86.746 230.236 77.577 226.760 69.000 ZM 160.000 152.000 C 150.531 151.987 141.219 149.579 132.930 145.000 C 129.621 143.172 125.483 143.910 123.010 146.770 L 67.110 211.510 C 60.819 217.486 50.912 217.360 44.776 211.224 C 38.640 205.089 38.514 195.181 44.490 188.890 L 109.180 133.000 C 112.045 130.526 112.784 126.382 110.950 123.070 C 100.543 104.248 101.836 81.129 114.276 63.584 C 126.715 46.039 148.104 37.168 169.310 40.760 L 138.110 74.570 C 136.348 76.481 135.625 79.129 136.170 81.670 L 141.830 108.000 C 142.491 111.076 144.894 113.479 147.970 114.140 L 174.320 119.800 C 176.861 120.345 179.509 119.622 181.420 117.860 L 215.230 86.660 C 217.958 102.913 213.396 119.543 202.758 132.130 C 192.119 144.716 176.480 151.983 160.000 152.000 Z"),
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
        return _wrench!!
    }

private var _wrench: ImageVector? = null
