package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.HeartHalf: ImageVector
    get() {
        if (_heartHalf != null) return _heartHalf!!
        _heartHalf = phosphorRegularIcon(
            name = "HeartHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 169.470 56.790 C 173.814 55.978 176.677 51.799 175.865 47.455 C 175.053 43.111 170.874 40.248 166.530 41.060 C 150.420 44.080 137.000 52.180 128.000 64.000 C 116.740 49.000 98.640 40.000 78.000 40.000 C 43.774 40.039 16.039 67.774 16.000 102.000 C 16.000 172.000 119.790 228.670 124.210 231.000 C 126.573 232.286 129.427 232.286 131.790 231.000 L 131.790 231.000 C 146.141 222.956 159.875 213.857 172.880 203.780 C 175.238 202.070 176.480 199.212 176.122 196.321 C 175.765 193.430 173.863 190.962 171.159 189.878 C 168.455 188.794 165.376 189.266 163.120 191.110 C 152.810 199.050 143.120 205.480 136.000 209.930 L 136.000 81.700 C 141.840 68.750 153.940 59.700 169.470 56.790 ZM 120.000 210.000 C 93.580 193.410 32.000 149.710 32.000 102.000 C 32.033 76.609 52.609 56.033 78.000 56.000 C 96.910 56.000 112.860 65.780 120.000 81.640 ZM 232.550 104.000 C 232.254 104.015 231.956 104.015 231.660 104.000 C 227.587 103.994 224.168 100.929 223.720 96.880 C 222.228 83.394 214.843 71.261 203.550 63.740 C 201.094 62.185 199.676 59.420 199.844 56.518 C 200.013 53.616 201.742 51.034 204.361 49.773 C 206.980 48.513 210.077 48.772 212.450 50.450 C 227.666 60.590 237.614 76.945 239.620 95.120 C 239.867 97.236 239.260 99.364 237.933 101.031 C 236.605 102.698 234.668 103.767 232.550 104.000 ZM 230.460 139.620 C 224.790 150.990 216.520 162.620 205.870 174.110 C 203.956 176.309 200.996 177.292 198.146 176.677 C 195.296 176.061 193.007 173.943 192.172 171.150 C 191.336 168.356 192.086 165.330 194.130 163.250 C 203.740 152.850 211.130 142.500 216.130 132.480 C 217.351 129.831 219.917 128.056 222.827 127.849 C 225.737 127.642 228.529 129.035 230.113 131.484 C 231.697 133.934 231.822 137.051 230.440 139.620 Z"),
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
        return _heartHalf!!
    }

private var _heartHalf: ImageVector? = null
