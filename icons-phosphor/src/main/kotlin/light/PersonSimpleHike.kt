package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PersonSimpleHike: ImageVector
    get() {
        if (_personSimpleHike != null) return _personSimpleHike!!
        _personSimpleHike = phosphorLightIcon(
            name = "PersonSimpleHike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 152.000 78.000 C 168.569 78.000 182.000 64.569 182.000 48.000 C 182.000 31.431 168.569 18.000 152.000 18.000 C 135.431 18.000 122.000 31.431 122.000 48.000 C 122.000 64.569 135.431 78.000 152.000 78.000 ZM 152.000 30.000 C 161.941 30.000 170.000 38.059 170.000 48.000 C 170.000 57.941 161.941 66.000 152.000 66.000 C 142.059 66.000 134.000 57.941 134.000 48.000 C 134.000 38.059 142.059 30.000 152.000 30.000 ZM 198.000 144.000 L 198.000 232.000 C 198.000 235.314 195.314 238.000 192.000 238.000 C 188.686 238.000 186.000 235.314 186.000 232.000 L 186.000 149.810 C 159.770 148.080 151.240 134.920 143.650 123.220 C 140.220 117.920 136.970 112.910 132.150 108.700 L 117.000 143.610 L 155.520 171.120 C 157.084 172.253 158.007 174.069 158.000 176.000 L 158.000 232.000 C 158.000 235.314 155.314 238.000 152.000 238.000 C 148.686 238.000 146.000 235.314 146.000 232.000 L 146.000 179.090 L 112.080 154.860 L 77.500 234.390 C 76.114 237.316 72.656 238.615 69.686 237.324 C 66.717 236.034 65.307 232.620 66.500 229.610 L 124.000 97.290 C 124.662 95.768 125.925 94.589 127.488 94.032 C 129.051 93.475 130.775 93.590 132.250 94.350 C 134.998 95.776 137.566 97.525 139.900 99.560 C 146.050 104.900 149.900 110.890 153.690 116.690 C 161.440 128.590 167.540 138.000 192.000 138.000 C 195.314 138.000 198.000 140.686 198.000 144.000 ZM 72.000 150.000 C 74.403 150.001 76.575 148.569 77.520 146.360 L 101.520 90.360 C 102.147 88.896 102.166 87.243 101.573 85.765 C 100.981 84.287 99.825 83.105 98.360 82.480 L 70.360 70.480 C 67.314 69.181 63.792 70.596 62.490 73.640 L 38.490 129.640 C 37.190 132.683 38.599 136.204 41.640 137.510 L 69.640 149.510 C 70.385 149.831 71.188 149.998 72.000 150.000 ZM 51.880 128.850 L 71.150 83.850 L 88.150 91.120 L 68.880 136.120 Z"),
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
        return _personSimpleHike!!
    }

private var _personSimpleHike: ImageVector? = null
