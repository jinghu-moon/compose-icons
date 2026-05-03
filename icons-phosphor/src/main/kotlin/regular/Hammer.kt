package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Hammer: ImageVector
    get() {
        if (_hammer != null) return _hammer!!
        _hammer = phosphorRegularIcon(
            name = "Hammer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 251.340 112.000 L 183.880 44.080 C 146.366 6.641 85.624 6.641 48.110 44.080 L 48.020 44.170 L 34.250 58.400 C 31.283 61.589 31.412 66.565 34.541 69.596 C 37.669 72.626 42.647 72.597 45.740 69.530 L 59.470 55.350 C 64.994 49.827 71.298 45.144 78.180 41.450 L 124.680 88.000 L 28.680 184.000 C 25.679 187.001 23.992 191.071 23.992 195.315 C 23.992 199.559 25.679 203.629 28.680 206.630 L 49.370 227.320 C 52.371 230.321 56.441 232.008 60.685 232.008 C 64.929 232.008 68.999 230.321 72.000 227.320 L 168.000 131.320 L 182.340 145.660 L 182.340 145.660 L 200.000 163.300 C 203.001 166.301 207.071 167.988 211.315 167.988 C 215.559 167.988 219.629 166.301 222.630 163.300 L 251.320 134.610 C 257.562 128.369 257.571 118.252 251.340 112.000 ZM 60.680 216.000 L 40.000 195.310 L 108.000 127.310 L 128.680 148.000 ZM 162.340 114.320 L 140.000 136.670 L 119.310 116.000 L 141.660 93.650 C 143.162 92.149 144.006 90.113 144.006 87.990 C 144.006 85.867 143.162 83.831 141.660 82.330 L 94.320 35.000 C 122.169 27.157 152.082 34.961 172.550 55.410 L 216.770 99.920 L 188.000 128.660 L 173.660 114.320 C 172.159 112.818 170.123 111.974 168.000 111.974 C 165.877 111.974 163.841 112.818 162.340 114.320 ZM 211.340 151.980 L 199.340 139.980 L 228.000 111.250 L 240.000 123.250 Z"),
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
        return _hammer!!
    }

private var _hammer: ImageVector? = null
