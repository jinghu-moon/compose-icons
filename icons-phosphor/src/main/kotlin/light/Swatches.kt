package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Swatches: ImageVector
    get() {
        if (_swatches != null) return _swatches!!
        _swatches = phosphorLightIcon(
            name = "Swatches",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 86.000 180.000 C 86.000 185.523 81.523 190.000 76.000 190.000 C 70.477 190.000 66.000 185.523 66.000 180.000 C 66.000 174.477 70.477 170.000 76.000 170.000 C 81.523 170.000 86.000 174.477 86.000 180.000 ZM 238.000 156.190 L 238.000 208.000 C 238.000 215.732 231.732 222.000 224.000 222.000 L 76.000 222.000 C 73.459 222.002 70.923 221.784 68.420 221.350 C 45.689 217.198 30.581 195.464 34.610 172.710 L 59.610 29.580 C 60.239 25.917 62.305 22.657 65.349 20.523 C 68.392 18.390 72.162 17.561 75.820 18.220 L 130.490 27.940 C 138.078 29.310 143.130 36.557 141.790 44.150 L 129.120 116.590 L 200.120 90.840 C 207.356 88.226 215.346 91.942 218.010 99.160 L 237.100 151.380 C 237.650 152.926 237.954 154.549 238.000 156.190 ZM 104.930 185.190 L 130.000 42.080 C 130.196 41.005 129.492 39.972 128.420 39.760 L 73.720 30.000 L 73.380 30.000 C 72.996 30.002 72.621 30.124 72.310 30.350 C 71.874 30.657 71.579 31.125 71.490 31.650 L 46.490 174.780 C 43.599 191.019 54.360 206.546 70.580 209.540 C 78.272 210.914 86.194 209.153 92.580 204.650 C 99.127 200.082 103.569 193.080 104.910 185.210 ZM 113.180 198.360 L 224.710 158.000 C 225.195 157.823 225.593 157.464 225.820 157.000 C 226.038 156.542 226.060 156.014 225.880 155.540 L 206.790 103.330 C 206.402 102.320 205.281 101.801 204.260 102.160 L 126.730 130.250 L 116.730 187.320 C 116.066 191.154 114.871 194.876 113.180 198.380 ZM 226.000 170.270 L 116.350 210.000 L 224.000 210.000 C 225.105 210.000 226.000 209.105 226.000 208.000 Z"),
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
        return _swatches!!
    }

private var _swatches: ImageVector? = null
