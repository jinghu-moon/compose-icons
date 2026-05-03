package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CloudMoon: ImageVector
    get() {
        if (_cloudMoon != null) return _cloudMoon!!
        _cloudMoon = phosphorFillIcon(
            name = "CloudMoon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 172.000 72.000 C 167.860 71.998 163.726 72.332 159.640 73.000 C 156.660 42.205 134.321 16.766 104.170 9.830 C 101.486 9.213 98.673 10.021 96.725 11.967 C 94.776 13.913 93.966 16.725 94.580 19.410 C 98.397 36.038 94.433 53.500 83.809 66.850 C 73.186 80.200 57.061 87.985 40.000 88.000 C 35.763 88.001 31.540 87.524 27.410 86.580 C 24.724 85.962 21.909 86.770 19.959 88.719 C 18.010 90.669 17.202 93.484 17.820 96.170 C 22.161 114.887 33.781 131.103 50.110 141.230 C 38.515 157.026 36.784 177.998 45.633 195.481 C 54.481 212.964 72.405 223.989 92.000 224.000 L 172.000 224.000 C 213.974 224.000 248.000 189.974 248.000 148.000 C 248.000 106.026 213.974 72.000 172.000 72.000 ZM 37.370 104.000 C 38.240 104.000 39.120 104.000 40.000 104.000 C 79.746 103.956 111.956 71.746 112.000 32.000 C 112.000 31.110 112.000 30.220 112.000 29.330 C 130.791 38.127 143.127 56.650 144.000 77.380 C 124.254 85.237 108.674 100.963 101.000 120.780 C 98.028 120.261 95.017 120.000 92.000 120.000 C 81.246 119.998 70.759 123.350 62.000 129.590 C 51.240 123.946 42.599 114.967 37.370 104.000 Z"),
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
        return _cloudMoon!!
    }

private var _cloudMoon: ImageVector? = null
