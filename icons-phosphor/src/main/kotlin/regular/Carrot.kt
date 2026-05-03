package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Carrot: ImageVector
    get() {
        if (_carrot != null) return _carrot!!
        _carrot = phosphorRegularIcon(
            name = "Carrot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 64.000 L 203.310 64.000 L 229.660 37.660 C 232.786 34.534 232.786 29.466 229.660 26.340 C 226.534 23.214 221.466 23.214 218.340 26.340 L 192.000 52.690 L 192.000 24.000 C 192.000 19.582 188.418 16.000 184.000 16.000 C 179.582 16.000 176.000 19.582 176.000 24.000 L 176.000 56.570 C 150.938 42.102 119.286 46.251 98.800 66.690 L 98.800 66.690 L 98.800 66.690 L 98.800 66.690 C 58.700 106.080 28.550 199.770 25.610 209.140 C 22.770 215.235 24.045 222.456 28.800 227.210 C 33.554 231.965 40.775 233.240 46.870 230.400 C 56.240 227.460 150.050 197.270 189.340 157.190 C 209.764 136.698 213.900 105.053 199.430 80.000 L 232.000 80.000 C 236.418 80.000 240.000 76.418 240.000 72.000 C 240.000 67.582 236.418 64.000 232.000 64.000 ZM 177.880 146.000 C 168.940 155.120 156.630 163.800 143.030 171.730 L 117.650 146.340 C 114.524 143.214 109.456 143.214 106.330 146.340 C 103.204 149.466 103.204 154.534 106.330 157.660 L 128.420 179.750 C 87.550 200.940 42.100 215.170 41.420 215.380 C 40.928 215.540 40.452 215.747 40.000 216.000 C 40.242 215.550 40.439 215.078 40.590 214.590 C 40.880 213.660 68.590 125.010 104.590 83.920 L 138.360 117.690 C 141.486 120.816 146.554 120.816 149.680 117.690 C 152.806 114.564 152.806 109.496 149.680 106.370 L 116.180 72.880 C 136.531 58.401 164.585 61.947 180.692 81.035 C 196.799 100.124 195.576 128.375 177.880 146.000 Z"),
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
        return _carrot!!
    }

private var _carrot: ImageVector? = null
