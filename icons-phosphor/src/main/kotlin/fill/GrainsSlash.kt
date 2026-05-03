package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GrainsSlash: ImageVector
    get() {
        if (_grainsSlash != null) return _grainsSlash!!
        _grainsSlash = phosphorFillIcon(
            name = "GrainsSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 64.000 L 216.000 144.000 C 216.007 154.406 214.162 164.731 210.550 174.490 C 210.056 175.790 208.922 176.741 207.555 177.000 C 206.189 177.259 204.785 176.790 203.850 175.760 L 162.520 130.300 C 161.707 129.399 161.348 128.178 161.542 126.980 C 161.736 125.782 162.464 124.738 163.520 124.140 C 174.659 117.564 187.119 113.544 200.000 112.370 L 200.000 72.450 C 179.842 74.742 161.573 85.395 149.650 101.810 C 148.310 103.671 146.235 104.866 143.953 105.094 C 141.671 105.322 139.402 104.559 137.720 103.000 C 134.764 100.150 134.383 95.548 136.830 92.250 C 143.581 82.994 152.073 75.144 161.830 69.140 C 152.620 49.800 135.450 37.740 128.000 33.200 C 119.217 38.598 111.323 45.325 104.600 53.140 C 103.120 54.897 100.957 55.933 98.661 55.985 C 96.365 56.036 94.157 55.098 92.600 53.410 C 89.869 50.337 89.843 45.713 92.540 42.610 C 101.491 32.143 112.291 23.411 124.400 16.850 C 126.653 15.722 129.307 15.722 131.560 16.850 C 132.880 17.510 161.830 32.280 176.150 62.000 C 186.268 58.056 197.030 56.021 207.890 56.000 C 210.031 55.971 212.094 56.800 213.618 58.304 C 215.142 59.807 216.000 61.859 216.000 64.000 ZM 213.920 210.620 C 215.883 212.729 216.561 215.730 215.694 218.478 C 214.827 221.225 212.550 223.294 209.733 223.895 C 206.915 224.496 203.992 223.535 202.080 221.380 L 189.180 207.190 C 172.922 222.982 151.185 231.872 128.520 232.000 C 79.830 232.280 40.000 191.510 40.000 142.830 L 40.000 64.000 C 40.000 61.863 40.855 59.814 42.375 58.311 C 43.895 56.808 45.953 55.976 48.090 56.000 C 49.340 56.000 50.570 56.000 51.810 56.090 L 42.080 45.380 C 40.117 43.271 39.439 40.270 40.306 37.522 C 41.173 34.775 43.450 32.706 46.267 32.105 C 49.085 31.504 52.008 32.465 53.920 34.620 ZM 136.320 149.050 L 69.180 75.190 C 64.883 73.860 60.470 72.939 56.000 72.440 L 56.000 112.380 C 87.392 115.285 114.844 134.730 128.000 163.380 C 130.318 158.353 133.103 153.555 136.320 149.050 Z"),
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
        return _grainsSlash!!
    }

private var _grainsSlash: ImageVector? = null
