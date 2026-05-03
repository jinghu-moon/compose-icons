package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SteeringWheel: ImageVector
    get() {
        if (_steeringWheel != null) return _steeringWheel!!
        _steeringWheel = phosphorThinIcon(
            name = "SteeringWheel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 148.000 C 123.582 148.000 120.000 144.418 120.000 140.000 C 120.000 135.582 123.582 132.000 128.000 132.000 C 132.418 132.000 136.000 135.582 136.000 140.000 C 136.000 144.418 132.418 148.000 128.000 148.000 ZM 228.000 128.000 C 228.000 183.228 183.228 228.000 128.000 228.000 C 72.772 228.000 28.000 183.228 28.000 128.000 C 28.000 72.772 72.772 28.000 128.000 28.000 C 183.203 28.061 227.939 72.797 228.000 128.000 ZM 36.000 128.000 Q 36.000 132.530 36.440 136.940 C 87.544 87.686 168.456 87.686 219.560 136.940 Q 220.000 132.530 220.000 128.000 C 220.000 77.190 178.810 36.000 128.000 36.000 C 77.190 36.000 36.000 77.190 36.000 128.000 ZM 113.750 218.900 L 94.200 166.600 C 93.615 165.035 92.120 163.999 90.450 164.000 L 43.340 164.000 C 55.811 193.188 82.402 213.922 113.750 218.900 ZM 128.000 220.000 C 129.780 220.000 131.550 219.940 133.300 219.840 L 154.300 163.790 C 156.057 159.100 160.542 155.995 165.550 156.000 L 215.640 156.000 C 216.609 152.974 217.420 149.900 218.070 146.790 C 194.650 122.038 162.076 108.016 128.000 108.016 C 93.924 108.016 61.350 122.038 37.930 146.790 C 38.580 149.900 39.391 152.974 40.360 156.000 L 90.450 156.000 C 95.457 156.000 99.938 159.110 101.690 163.800 L 122.690 219.800 C 124.420 219.940 126.200 220.000 128.000 220.000 ZM 212.660 164.000 L 165.550 164.000 C 163.880 163.999 162.385 165.035 161.800 166.600 L 142.200 218.900 C 173.570 213.947 200.188 193.208 212.660 164.000 Z"),
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
        return _steeringWheel!!
    }

private var _steeringWheel: ImageVector? = null
