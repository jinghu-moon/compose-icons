package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PipeWrench: ImageVector
    get() {
        if (_pipeWrench != null) return _pipeWrench!!
        _pipeWrench = phosphorBoldIcon(
            name = "PipeWrench",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 219.110 40.200 L 218.750 39.850 L 185.920 9.640 C 178.092 2.070 165.645 2.154 157.920 9.830 L 110.360 57.110 C 97.819 45.244 78.125 45.466 65.855 57.612 C 53.584 69.758 53.162 89.449 64.900 102.110 L 49.840 117.110 C 46.088 120.861 43.979 125.949 43.979 131.255 C 43.979 136.561 46.088 141.649 49.840 145.400 L 67.560 163.120 L 37.360 193.320 C 24.862 205.818 24.862 226.082 37.360 238.580 C 49.858 251.078 70.122 251.078 82.620 238.580 L 82.620 238.580 L 174.130 146.260 C 177.932 142.446 180.035 137.260 179.963 131.875 C 179.892 126.490 177.652 121.362 173.750 117.650 L 160.750 105.250 L 172.660 93.450 L 187.390 106.450 C 195.256 113.982 207.703 113.835 215.390 106.120 L 219.100 102.410 C 227.353 94.158 231.990 82.966 231.990 71.295 C 231.990 59.624 227.353 48.432 219.100 40.180 ZM 69.650 131.320 L 81.860 119.130 L 96.730 134.000 L 84.530 146.210 ZM 65.650 221.680 C 62.521 224.800 57.455 224.794 54.335 221.665 C 51.215 218.536 51.221 213.470 54.350 210.350 L 122.210 142.490 C 124.469 140.238 125.739 137.180 125.739 133.990 C 125.739 130.800 124.469 127.742 122.210 125.490 L 82.330 85.660 C 79.204 82.534 79.204 77.466 82.330 74.340 C 85.456 71.214 90.524 71.214 93.650 74.340 C 93.710 74.410 93.780 74.470 93.840 74.530 L 154.280 132.250 ZM 202.140 85.460 L 201.140 86.460 L 186.270 73.440 C 178.401 66.070 166.115 66.238 158.450 73.820 L 143.450 88.700 L 127.730 73.700 L 172.100 29.530 L 202.290 57.330 C 209.957 65.164 209.890 77.709 202.140 85.460 Z"),
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
        return _pipeWrench!!
    }

private var _pipeWrench: ImageVector? = null
