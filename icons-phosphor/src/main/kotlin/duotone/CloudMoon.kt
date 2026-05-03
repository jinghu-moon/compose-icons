package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CloudMoon: ImageVector
    get() {
        if (_cloudMoon != null) return _cloudMoon!!
        _cloudMoon = phosphorDuotoneIcon(
            name = "CloudMoon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 106.310 130.380 ZM 102.380 17.620 L 102.380 17.620 C 107.311 39.119 100.835 61.642 85.239 77.239 C 69.642 92.835 47.119 99.311 25.620 94.380 L 25.620 94.380 C 30.242 114.351 44.135 130.909 63.000 138.930 L 63.000 138.930 C 74.873 128.531 91.399 125.274 106.330 130.390 C 112.391 107.875 129.545 90.023 151.800 83.070 L 151.950 83.070 C 151.950 82.070 152.020 81.070 152.020 80.070 C 152.058 50.226 131.464 24.316 102.380 17.620 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 172.000 72.000 C 167.860 71.998 163.726 72.333 159.640 73.000 C 156.660 42.205 134.321 16.766 104.170 9.830 C 101.486 9.213 98.673 10.021 96.725 11.967 C 94.776 13.913 93.966 16.725 94.580 19.410 C 98.397 36.038 94.433 53.500 83.809 66.850 C 73.186 80.200 57.061 87.985 40.000 88.000 C 35.763 88.001 31.540 87.524 27.410 86.580 C 24.724 85.962 21.909 86.770 19.959 88.719 C 18.010 90.669 17.202 93.484 17.820 96.170 C 22.161 114.887 33.781 131.103 50.110 141.230 C 38.515 157.026 36.784 177.998 45.633 195.481 C 54.481 212.964 72.405 223.989 92.000 224.000 L 172.000 224.000 C 213.974 224.000 248.000 189.974 248.000 148.000 C 248.000 106.026 213.974 72.000 172.000 72.000 ZM 37.370 104.000 C 38.240 104.000 39.120 104.000 40.000 104.000 C 79.746 103.956 111.956 71.746 112.000 32.000 C 112.000 31.110 112.000 30.220 112.000 29.330 C 130.778 38.117 143.111 56.617 144.000 77.330 C 124.246 85.174 108.661 100.904 101.000 120.730 C 87.339 118.366 73.299 121.556 62.000 129.590 C 51.240 123.946 42.599 114.967 37.370 104.000 ZM 172.000 208.000 L 92.000 208.000 C 78.582 207.975 66.291 200.490 60.111 188.579 C 53.932 176.669 54.889 162.310 62.595 151.325 C 70.301 140.340 83.477 134.553 96.780 136.310 C 96.410 138.680 96.150 141.100 96.010 143.540 C 95.756 147.958 99.132 151.746 103.550 152.000 C 107.968 152.254 111.756 148.878 112.010 144.460 C 112.234 140.470 112.864 136.513 113.890 132.650 C 113.890 132.490 113.980 132.330 114.010 132.170 C 122.178 102.155 151.912 83.343 182.533 88.817 C 213.154 94.292 234.528 122.241 231.789 153.227 C 229.051 184.213 203.107 207.981 172.000 208.000 Z"),
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
