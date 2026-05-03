package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Wrench: ImageVector
    get() {
        if (_wrench != null) return _wrench!!
        _wrench = phosphorDuotoneIcon(
            name = "Wrench",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 96.000 C 223.991 118.643 212.019 139.597 192.515 151.101 C 173.012 162.605 148.882 162.947 129.060 152.000 L 73.000 217.000 C 63.611 226.389 48.389 226.389 39.000 217.000 C 29.611 207.611 29.611 192.389 39.000 183.000 L 104.000 126.940 C 90.895 103.224 94.145 73.824 112.115 53.544 C 130.084 33.263 158.878 26.496 184.000 36.650 L 144.000 80.000 L 149.660 106.340 L 176.000 112.000 L 219.350 72.000 C 222.433 79.625 224.012 87.775 224.000 96.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 226.760 69.000 C 225.775 66.565 223.658 64.769 221.095 64.194 C 218.532 63.620 215.851 64.339 213.920 66.120 L 173.620 103.310 L 156.390 99.610 L 152.690 82.380 L 189.880 42.080 C 191.661 40.149 192.380 37.468 191.806 34.905 C 191.231 32.342 189.435 30.225 187.000 29.240 C 164.804 20.261 139.596 22.904 119.745 36.291 C 99.893 49.677 87.995 72.057 88.000 96.000 C 87.987 105.957 90.030 115.809 94.000 124.940 L 33.790 177.000 C 33.640 177.120 33.500 177.260 33.360 177.390 C 20.862 189.888 20.862 210.152 33.360 222.650 C 45.858 235.148 66.122 235.148 78.620 222.650 C 78.750 222.520 78.890 222.370 79.010 222.230 L 131.060 162.000 C 153.335 171.778 179.042 169.647 199.402 156.334 C 219.763 143.021 232.024 120.327 232.000 96.000 C 232.016 86.746 230.236 77.577 226.760 69.000 ZM 160.000 152.000 C 150.531 151.987 141.219 149.579 132.930 145.000 C 129.621 143.172 125.483 143.910 123.010 146.770 L 67.110 211.510 C 60.819 217.486 50.912 217.360 44.776 211.224 C 38.640 205.089 38.514 195.181 44.490 188.890 L 109.180 133.000 C 112.045 130.526 112.784 126.382 110.950 123.070 C 100.543 104.248 101.836 81.129 114.276 63.584 C 126.715 46.039 148.104 37.168 169.310 40.760 L 138.110 74.570 C 136.348 76.481 135.625 79.129 136.170 81.670 L 141.830 108.000 C 142.491 111.076 144.894 113.479 147.970 114.140 L 174.320 119.800 C 176.861 120.345 179.509 119.622 181.420 117.860 L 215.230 86.660 C 217.958 102.913 213.396 119.543 202.758 132.130 C 192.119 144.716 176.480 151.983 160.000 152.000 Z"),
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
        return _wrench!!
    }

private var _wrench: ImageVector? = null
