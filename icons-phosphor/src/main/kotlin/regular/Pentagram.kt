package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Pentagram: ImageVector
    get() {
        if (_pentagram != null) return _pentagram!!
        _pentagram = phosphorRegularIcon(
            name = "Pentagram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 239.180 91.050 C 237.109 84.424 230.942 79.935 224.000 80.000 L 163.000 80.000 L 143.230 19.260 C 141.184 12.573 135.016 8.003 128.023 7.992 C 121.031 7.980 114.848 12.530 112.780 19.210 L 93.060 80.000 L 32.000 80.000 C 25.043 79.981 18.871 84.461 16.732 91.081 C 14.593 97.701 16.977 104.944 22.630 109.000 L 72.090 144.580 L 53.150 203.000 C 50.935 209.598 53.314 216.867 59.000 220.880 C 64.572 225.019 72.198 225.019 77.770 220.880 L 128.000 184.750 L 178.230 220.880 C 183.837 224.950 191.425 224.949 197.031 220.878 C 202.637 216.807 204.985 209.591 202.850 203.000 L 183.850 144.540 L 233.340 108.930 C 239.025 104.916 241.400 97.646 239.180 91.050 ZM 128.000 24.150 L 146.120 80.000 L 109.880 80.000 ZM 32.000 96.000 L 87.870 96.000 L 77.300 128.560 ZM 68.340 208.000 L 68.340 208.000 L 85.730 154.410 L 114.270 174.950 ZM 90.910 138.430 L 104.690 96.000 L 151.310 96.000 L 165.060 138.380 L 128.000 165.000 ZM 187.600 208.000 L 187.600 208.000 L 141.700 175.000 L 170.240 154.460 ZM 178.670 128.620 L 168.130 96.000 L 224.000 96.000 Z"),
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
        return _pentagram!!
    }

private var _pentagram: ImageVector? = null
