package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PaintBucket: ImageVector
    get() {
        if (_paintBucket != null) return _paintBucket!!
        _paintBucket = phosphorLightIcon(
            name = "PaintBucket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 237.000 164.670 C 235.888 162.994 234.011 161.987 232.000 161.987 C 229.989 161.987 228.112 162.994 227.000 164.670 C 226.300 165.670 210.000 190.390 210.000 208.000 C 210.000 220.150 219.850 230.000 232.000 230.000 C 244.150 230.000 254.000 220.150 254.000 208.000 C 254.000 190.390 237.690 165.710 237.000 164.670 ZM 232.000 218.000 C 226.477 218.000 222.000 213.523 222.000 208.000 C 222.000 199.830 227.370 188.080 232.000 179.660 C 236.630 188.070 242.000 199.810 242.000 208.000 C 242.000 213.523 237.523 218.000 232.000 218.000 ZM 233.900 137.180 C 235.874 136.522 237.366 134.888 237.843 132.863 C 238.320 130.837 237.713 128.710 236.240 127.240 L 120.760 11.760 C 119.635 10.633 118.107 10.000 116.515 10.000 C 114.923 10.000 113.395 10.633 112.270 11.760 L 70.270 53.760 L 44.270 27.760 C 41.923 25.448 38.150 25.461 35.819 27.789 C 33.488 30.118 33.471 33.890 35.780 36.240 L 61.780 62.240 L 16.440 107.590 C 7.850 116.181 7.850 130.109 16.440 138.700 L 101.300 223.560 C 109.891 232.150 123.819 232.150 132.410 223.560 L 211.240 144.730 ZM 203.760 135.240 L 123.930 215.070 C 120.025 218.974 113.695 218.974 109.790 215.070 L 24.930 130.210 C 21.026 126.305 21.026 119.975 24.930 116.070 L 70.250 70.750 L 101.870 102.360 C 95.564 112.609 97.115 125.846 105.620 134.360 C 115.773 144.507 132.227 144.507 142.380 134.360 L 142.380 134.360 C 151.648 125.027 152.487 110.244 144.334 99.923 C 136.181 89.602 121.605 86.995 110.380 93.850 L 78.740 62.260 L 116.520 24.490 L 220.890 128.860 L 206.100 133.790 C 205.219 134.088 204.419 134.584 203.760 135.240 ZM 114.100 106.110 L 114.100 106.110 C 119.570 100.651 128.429 100.657 133.892 106.124 C 139.355 111.591 139.355 120.449 133.892 125.916 C 128.429 131.383 119.570 131.389 114.100 125.930 C 111.446 123.316 109.951 119.746 109.951 116.020 C 109.951 112.294 111.446 108.724 114.100 106.110 Z"),
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
        return _paintBucket!!
    }

private var _paintBucket: ImageVector? = null
