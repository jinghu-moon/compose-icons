package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Wrench: ImageVector
    get() {
        if (_wrench != null) return _wrench!!
        _wrench = phosphorLightIcon(
            name = "Wrench",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.910 69.750 C 224.171 67.924 222.583 66.577 220.661 66.146 C 218.739 65.715 216.728 66.254 215.280 67.590 L 174.210 105.490 L 154.700 101.300 L 150.510 81.790 L 188.410 40.720 C 189.746 39.272 190.285 37.261 189.854 35.339 C 189.423 33.417 188.076 31.829 186.250 31.090 C 159.597 20.286 129.048 26.882 109.229 47.722 C 89.409 68.561 84.353 99.403 96.480 125.480 L 35.090 178.480 C 34.980 178.570 34.880 178.670 34.770 178.780 C 23.048 190.497 23.043 209.498 34.760 221.220 C 46.477 232.942 65.478 232.947 77.200 221.230 C 77.310 221.120 77.410 221.020 77.500 220.910 L 130.500 159.520 C 156.577 171.647 187.419 166.591 208.258 146.771 C 229.098 126.952 235.694 96.403 224.890 69.750 ZM 160.000 154.000 C 150.207 153.996 140.574 151.512 132.000 146.780 C 129.515 145.404 126.405 145.959 124.550 148.110 L 68.570 212.880 C 61.500 219.653 50.313 219.533 43.390 212.610 C 36.467 205.687 36.347 194.500 43.120 187.430 L 107.880 131.490 C 110.048 129.627 110.601 126.492 109.200 124.000 C 98.105 103.931 99.876 79.210 113.718 60.928 C 127.560 42.646 150.874 34.235 173.200 39.470 L 139.580 75.930 C 138.259 77.365 137.718 79.353 138.130 81.260 L 143.780 107.610 C 144.275 109.920 146.080 111.725 148.390 112.220 L 174.740 117.870 C 176.647 118.282 178.635 117.741 180.070 116.420 L 216.490 82.800 C 220.495 100.038 216.420 118.162 205.420 132.026 C 194.420 145.891 177.698 153.981 160.000 154.000 Z"),
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
