package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cherries: ImageVector
    get() {
        if (_cherries != null) return _cherries!!
        _cherries = phosphorBoldIcon(
            name = "Cherries",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 176.000 68.000 C 174.120 68.000 172.240 68.080 170.380 68.220 C 164.699 59.083 157.518 50.969 149.140 44.220 C 110.000 12.600 56.560 19.800 54.300 20.120 C 49.371 20.812 45.380 24.475 44.271 29.328 C 43.161 34.180 45.162 39.214 49.300 41.980 C 64.520 52.100 72.130 68.450 75.710 85.000 C 43.022 90.309 17.535 116.174 12.707 148.936 C 7.879 181.699 24.821 213.816 54.587 228.329 C 84.354 242.843 120.091 236.411 142.930 212.430 C 171.084 226.034 204.698 221.006 227.639 199.758 C 250.579 178.511 258.165 145.381 246.755 116.268 C 235.345 87.155 207.269 68.002 176.000 68.000 ZM 153.240 121.060 C 149.842 115.398 145.728 110.199 141.000 105.590 C 145.722 101.296 151.193 97.907 157.140 95.590 C 159.422 101.720 161.136 108.046 162.260 114.490 C 158.356 115.064 154.984 117.520 153.240 121.060 ZM 134.190 63.000 C 138.356 66.382 142.123 70.227 145.420 74.460 C 136.236 78.496 127.938 84.304 121.000 91.550 C 114.418 88.369 107.408 86.163 100.190 85.000 C 97.720 71.050 93.000 56.650 84.580 44.000 C 99.780 45.680 118.750 50.480 134.190 63.000 ZM 88.000 212.000 C 61.154 211.974 38.741 191.517 36.270 164.786 C 33.799 138.054 52.084 113.835 78.470 108.890 C 78.669 116.095 78.419 123.306 77.720 130.480 C 71.512 129.626 65.692 133.692 64.359 139.815 C 63.026 145.938 66.629 152.056 72.630 153.860 C 82.678 156.713 93.322 156.713 103.370 153.860 C 108.748 152.275 112.311 147.176 111.952 141.581 C 111.593 135.985 107.407 131.385 101.870 130.500 C 102.459 123.714 102.690 116.901 102.560 110.090 C 127.385 117.349 143.101 141.750 139.443 167.355 C 135.785 192.959 113.865 211.983 88.000 212.000 ZM 176.000 196.000 C 169.411 196.005 162.882 194.756 156.760 192.320 C 164.803 175.302 166.228 155.901 160.760 137.890 C 170.784 140.723 181.396 140.723 191.420 137.890 C 197.373 136.108 200.981 130.077 199.736 123.989 C 198.491 117.902 192.804 113.771 186.630 114.470 C 185.543 106.957 183.830 99.548 181.510 92.320 C 208.893 95.369 229.144 119.247 227.682 146.760 C 226.220 174.273 203.552 195.870 176.000 196.000 Z"),
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
        return _cherries!!
    }

private var _cherries: ImageVector? = null
