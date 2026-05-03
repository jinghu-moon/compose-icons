package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Binoculars: ImageVector
    get() {
        if (_binoculars != null) return _binoculars!!
        _binoculars = phosphorFillIcon(
            name = "Binoculars",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 237.220 151.900 L 237.220 151.800 C 237.203 151.725 237.179 151.651 237.150 151.580 C 236.486 149.769 235.715 147.999 234.840 146.280 L 193.270 51.800 C 192.870 50.890 192.303 50.063 191.600 49.360 C 185.599 43.357 177.458 39.985 168.970 39.985 C 160.482 39.985 152.341 43.357 146.340 49.360 C 144.845 50.857 144.004 52.885 144.000 55.000 L 144.000 80.000 L 112.000 80.000 L 112.000 55.000 C 112.002 52.878 111.160 50.842 109.660 49.340 C 103.659 43.337 95.518 39.965 87.030 39.965 C 78.542 39.965 70.401 43.337 64.400 49.340 C 63.697 50.043 63.130 50.870 62.730 51.780 L 21.200 146.280 C 20.325 147.999 19.554 149.769 18.890 151.580 C 18.862 151.648 18.839 151.719 18.820 151.790 C 18.820 151.790 18.820 151.870 18.820 151.900 C 10.225 176.734 23.198 203.862 47.924 212.762 C 72.650 221.662 99.936 209.025 109.140 184.410 C 111.087 179.097 112.069 173.479 112.040 167.820 L 112.040 96.000 L 144.040 96.000 L 144.040 167.830 C 144.011 173.489 144.993 179.107 146.940 184.420 C 156.144 209.035 183.430 221.672 208.156 212.772 C 232.882 203.872 245.855 176.744 237.260 151.910 ZM 94.070 178.900 C 87.922 195.303 69.728 203.715 53.249 197.772 C 36.771 191.829 28.133 173.742 33.870 157.190 L 35.680 153.060 C 42.525 140.048 57.357 133.375 71.635 136.883 C 85.913 140.391 95.964 153.177 96.000 167.880 L 96.000 168.000 L 96.000 168.000 C 95.999 171.731 95.346 175.434 94.070 178.940 ZM 203.000 198.070 C 193.183 201.664 182.229 200.235 173.661 194.244 C 165.094 188.253 159.993 178.454 160.000 168.000 L 160.000 168.000 L 160.000 167.890 C 160.054 153.195 170.111 140.425 184.384 136.928 C 198.657 133.431 213.478 140.104 220.320 153.110 L 222.130 157.240 C 228.053 173.794 219.511 192.026 203.000 198.070 Z"),
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
        return _binoculars!!
    }

private var _binoculars: ImageVector? = null
