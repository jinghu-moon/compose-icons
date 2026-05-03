package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HandsPraying: ImageVector
    get() {
        if (_handsPraying != null) return _handsPraying!!
        _handsPraying = phosphorLightIcon(
            name = "HandsPraying",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 233.900 181.420 L 197.310 144.820 L 160.710 24.000 C 158.705 17.396 153.399 12.318 146.713 10.605 C 140.028 8.892 132.933 10.794 128.000 15.620 C 123.067 10.794 115.972 8.892 109.287 10.605 C 102.601 12.318 97.295 17.396 95.290 24.000 L 58.690 144.820 L 22.100 181.420 C 16.639 186.886 16.639 195.744 22.100 201.210 L 54.790 233.900 C 60.256 239.361 69.114 239.361 74.580 233.900 L 122.870 185.620 C 124.805 183.684 126.525 181.545 128.000 179.240 C 129.475 181.545 131.195 183.684 133.130 185.620 L 181.420 233.900 C 186.886 239.361 195.744 239.361 201.210 233.900 L 233.900 201.210 C 239.361 195.744 239.361 186.886 233.900 181.420 ZM 66.100 225.420 C 65.725 225.796 65.216 226.007 64.685 226.007 C 64.154 226.007 63.645 225.796 63.270 225.420 L 30.580 192.730 C 30.204 192.355 29.993 191.846 29.993 191.315 C 29.993 190.784 30.204 190.275 30.580 189.900 L 44.690 175.800 L 80.200 211.310 ZM 114.380 177.130 L 88.690 202.830 L 53.170 167.310 L 68.240 152.240 C 68.938 151.543 69.453 150.684 69.740 149.740 L 106.740 27.520 C 107.812 23.766 111.499 21.388 115.361 21.960 C 119.222 22.532 122.062 25.877 122.000 29.780 L 122.000 158.780 C 122.008 165.668 119.265 172.274 114.380 177.130 ZM 134.000 158.750 L 134.000 29.750 C 134.007 25.900 136.829 22.635 140.637 22.069 C 144.445 21.504 148.094 23.808 149.220 27.490 L 186.220 149.710 C 186.507 150.654 187.022 151.513 187.720 152.210 L 203.650 168.150 L 167.370 202.890 L 141.580 177.100 C 136.710 172.237 133.981 165.632 134.000 158.750 ZM 225.420 192.750 L 192.730 225.440 C 192.355 225.816 191.846 226.027 191.315 226.027 C 190.784 226.027 190.275 225.816 189.900 225.440 L 175.900 211.440 L 212.190 176.700 L 225.430 189.930 C 226.190 190.710 226.185 191.955 225.420 192.730 Z"),
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
        return _handsPraying!!
    }

private var _handsPraying: ImageVector? = null
