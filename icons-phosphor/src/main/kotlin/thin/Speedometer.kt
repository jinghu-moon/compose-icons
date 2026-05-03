package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Speedometer: ImageVector
    get() {
        if (_speedometer != null) return _speedometer!!
        _speedometer = phosphorThinIcon(
            name = "Speedometer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 117.170 157.170 L 213.170 61.170 C 214.733 59.607 217.267 59.607 218.830 61.170 C 220.393 62.733 220.393 65.267 218.830 66.830 L 122.830 162.830 C 121.267 164.393 118.733 164.393 117.170 162.830 C 115.607 161.267 115.607 158.733 117.170 157.170 ZM 128.000 84.000 C 135.384 83.992 142.720 85.187 149.720 87.540 C 151.109 88.171 152.735 87.958 153.914 86.990 C 155.093 86.022 155.619 84.468 155.269 82.983 C 154.920 81.498 153.757 80.341 152.270 80.000 C 129.081 72.186 103.548 76.015 83.672 90.287 C 63.795 104.560 52.007 127.530 52.000 152.000 C 52.003 154.820 52.157 157.637 52.460 160.440 C 52.685 162.476 54.412 164.012 56.460 164.000 L 56.910 164.000 C 57.966 163.884 58.933 163.353 59.597 162.524 C 60.261 161.695 60.568 160.636 60.450 159.580 C 58.293 140.351 64.430 121.113 77.325 106.686 C 90.220 92.258 108.650 84.007 128.000 84.000 ZM 224.170 102.820 C 223.569 101.465 222.268 100.554 220.789 100.451 C 219.311 100.349 217.897 101.073 217.115 102.332 C 216.333 103.592 216.312 105.180 217.060 106.460 C 229.522 130.915 231.423 159.407 222.320 185.300 C 221.764 186.918 220.241 188.003 218.530 188.000 L 37.460 188.000 C 35.742 187.980 34.221 186.884 33.660 185.260 C 20.072 146.656 31.366 103.668 62.174 76.727 C 92.982 49.787 137.092 44.326 173.540 62.940 C 174.817 63.641 176.375 63.593 177.606 62.813 C 178.837 62.033 179.547 60.645 179.458 59.191 C 179.369 57.736 178.497 56.445 177.180 55.820 C 162.268 48.160 145.764 44.111 129.000 44.000 L 128.000 44.000 C 92.960 44.018 60.104 61.026 39.858 89.625 C 19.613 118.225 14.492 154.866 26.120 187.920 C 27.809 192.742 32.351 195.978 37.460 196.000 L 218.530 196.000 C 223.625 196.011 228.172 192.804 229.870 188.000 C 239.700 160.036 237.640 129.264 224.170 102.860 Z"),
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
        return _speedometer!!
    }

private var _speedometer: ImageVector? = null
