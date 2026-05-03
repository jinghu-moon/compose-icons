package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ListNumbers: ImageVector
    get() {
        if (_listNumbers != null) return _listNumbers!!
        _listNumbers = phosphorLightIcon(
            name = "ListNumbers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 222.000 128.000 C 222.000 131.314 219.314 134.000 216.000 134.000 L 104.000 134.000 C 100.686 134.000 98.000 131.314 98.000 128.000 C 98.000 124.686 100.686 122.000 104.000 122.000 L 216.000 122.000 C 219.314 122.000 222.000 124.686 222.000 128.000 ZM 104.000 70.000 L 216.000 70.000 C 219.314 70.000 222.000 67.314 222.000 64.000 C 222.000 60.686 219.314 58.000 216.000 58.000 L 104.000 58.000 C 100.686 58.000 98.000 60.686 98.000 64.000 C 98.000 67.314 100.686 70.000 104.000 70.000 ZM 216.000 186.000 L 104.000 186.000 C 100.686 186.000 98.000 188.686 98.000 192.000 C 98.000 195.314 100.686 198.000 104.000 198.000 L 216.000 198.000 C 219.314 198.000 222.000 195.314 222.000 192.000 C 222.000 188.686 219.314 186.000 216.000 186.000 ZM 42.680 53.370 L 50.000 49.710 L 50.000 104.000 C 50.000 107.314 52.686 110.000 56.000 110.000 C 59.314 110.000 62.000 107.314 62.000 104.000 L 62.000 40.000 C 62.001 37.921 60.925 35.990 59.157 34.896 C 57.389 33.802 55.180 33.701 53.320 34.630 L 37.320 42.630 C 34.354 44.110 33.150 47.714 34.630 50.680 C 36.110 53.646 39.714 54.850 42.680 53.370 ZM 72.000 202.000 L 52.000 202.000 L 73.480 173.260 C 77.065 168.650 78.621 162.780 77.790 157.000 C 76.973 151.133 73.799 145.853 69.000 142.380 C 59.084 135.183 45.256 137.084 37.650 146.690 C 36.260 148.484 35.154 150.480 34.370 152.610 C 33.235 155.725 34.840 159.170 37.955 160.305 C 41.070 161.440 44.515 159.835 45.650 156.720 C 46.002 155.759 46.501 154.858 47.130 154.050 C 50.726 149.533 57.243 148.651 61.910 152.050 C 64.084 153.620 65.528 156.005 65.910 158.660 C 66.261 161.258 65.539 163.886 63.910 165.940 L 63.850 166.030 L 35.200 204.410 C 33.842 206.228 33.626 208.656 34.642 210.686 C 35.658 212.715 37.731 213.997 40.000 214.000 L 72.000 214.000 C 75.314 214.000 78.000 211.314 78.000 208.000 C 78.000 204.686 75.314 202.000 72.000 202.000 Z"),
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
        return _listNumbers!!
    }

private var _listNumbers: ImageVector? = null
