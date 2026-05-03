package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.StripeLogo: ImageVector
    get() {
        if (_stripeLogo != null) return _stripeLogo!!
        _stripeLogo = phosphorBoldIcon(
            name = "StripeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 28.000 L 48.000 28.000 C 36.954 28.000 28.000 36.954 28.000 48.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 ZM 204.000 204.000 L 52.000 204.000 L 52.000 52.000 L 204.000 52.000 ZM 148.000 152.000 C 148.000 145.630 141.710 142.680 124.000 137.580 C 107.860 132.930 85.770 126.580 85.770 104.000 C 85.770 83.480 103.920 68.000 127.990 68.000 C 145.230 68.000 160.050 76.140 166.680 89.240 C 168.686 93.073 168.475 97.689 166.126 101.321 C 163.777 104.954 159.654 107.041 155.336 106.784 C 151.017 106.527 147.171 103.966 145.270 100.080 C 142.800 95.170 136.000 92.000 128.000 92.000 C 117.780 92.000 109.780 97.270 109.780 104.000 C 109.780 105.090 109.780 106.210 113.060 108.170 C 117.240 110.650 124.060 112.620 130.660 114.520 C 139.410 117.040 148.460 119.650 156.040 124.380 C 169.230 132.610 172.040 143.940 172.040 152.000 C 172.040 172.190 152.710 188.000 128.040 188.000 C 106.780 188.000 88.580 175.650 84.770 158.620 C 83.390 152.181 87.457 145.832 93.883 144.394 C 100.310 142.956 106.695 146.966 108.190 153.380 C 109.300 158.490 117.210 164.000 128.000 164.000 C 137.440 164.000 148.000 158.870 148.000 152.000 Z"),
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
        return _stripeLogo!!
    }

private var _stripeLogo: ImageVector? = null
