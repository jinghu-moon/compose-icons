package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Unite: ImageVector
    get() {
        if (_unite != null) return _unite!!
        _unite = phosphorRegularIcon(
            name = "Unite",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 174.630 81.370 C 167.254 41.643 131.412 13.653 91.082 16.124 C 50.752 18.595 18.595 50.752 16.124 91.082 C 13.653 131.412 41.643 167.254 81.370 174.630 C 88.746 214.357 124.588 242.347 164.918 239.876 C 205.248 237.405 237.405 205.248 239.876 164.918 C 242.347 124.588 214.357 88.746 174.630 81.370 ZM 224.000 160.000 C 224.000 161.520 223.930 163.000 223.820 164.510 L 173.820 114.510 C 175.119 109.097 175.850 103.564 176.000 98.000 C 204.246 105.333 223.976 130.817 224.000 160.000 ZM 45.470 56.790 L 98.090 109.400 C 94.202 114.151 90.870 119.332 88.160 124.840 L 36.300 73.000 C 38.550 67.178 41.639 61.717 45.470 56.790 ZM 73.000 36.300 L 124.860 88.160 C 119.352 90.870 114.171 94.202 109.420 98.090 L 56.790 45.470 C 61.717 41.639 67.178 38.550 73.000 36.300 ZM 134.460 147.130 L 108.890 121.560 C 112.509 116.761 116.781 112.489 121.580 108.870 L 147.150 134.440 C 143.524 139.241 139.246 143.512 134.440 147.130 ZM 155.310 120.000 L 136.000 100.690 C 143.620 97.586 151.772 95.993 160.000 96.000 C 160.007 104.228 158.414 112.380 155.310 120.000 ZM 100.690 136.000 L 120.000 155.310 C 112.380 158.414 104.228 160.007 96.000 160.000 C 95.993 151.772 97.586 143.620 100.690 136.000 ZM 146.600 157.910 L 199.210 210.530 C 194.283 214.361 188.822 217.450 183.000 219.700 L 131.140 167.840 C 136.655 165.131 141.843 161.799 146.600 157.910 ZM 157.910 146.600 C 161.798 141.849 165.130 136.668 167.840 131.160 L 219.700 183.000 C 217.448 188.815 214.359 194.269 210.530 199.190 ZM 158.000 80.050 C 152.444 80.185 146.918 80.899 141.510 82.180 L 91.510 32.180 C 93.000 32.070 94.480 32.000 96.000 32.000 C 125.197 32.030 150.686 51.784 158.000 80.050 ZM 32.000 96.000 C 32.000 94.480 32.070 93.000 32.180 91.490 L 82.180 141.490 C 80.898 146.904 80.184 152.438 80.050 158.000 C 51.784 150.686 32.030 125.197 32.000 96.000 ZM 98.000 176.000 C 103.556 175.865 109.082 175.151 114.490 173.870 L 164.490 223.870 C 163.000 223.980 161.490 224.050 159.980 224.050 C 130.790 224.011 105.312 204.259 98.000 176.000 Z"),
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
        return _unite!!
    }

private var _unite: ImageVector? = null
