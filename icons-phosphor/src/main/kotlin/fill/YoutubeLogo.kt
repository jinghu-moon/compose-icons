package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.YoutubeLogo: ImageVector
    get() {
        if (_youtubeLogo != null) return _youtubeLogo!!
        _youtubeLogo = phosphorFillIcon(
            name = "YoutubeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 234.330 69.520 C 232.418 62.041 227.026 55.938 219.840 53.120 C 185.560 39.880 131.000 40.000 128.000 40.000 C 125.000 40.000 70.440 39.880 36.160 53.120 C 28.974 55.938 23.582 62.041 21.670 69.520 C 19.080 79.500 16.000 97.740 16.000 128.000 C 16.000 158.260 19.080 176.500 21.670 186.480 C 23.579 193.963 28.971 200.070 36.160 202.890 C 69.000 215.560 120.400 216.000 127.340 216.000 L 128.660 216.000 C 135.600 216.000 187.030 215.560 219.840 202.890 C 227.029 200.070 232.421 193.963 234.330 186.480 C 236.920 176.480 240.000 158.260 240.000 128.000 C 240.000 97.740 236.920 79.500 234.330 69.520 ZM 160.590 134.520 L 120.590 162.520 C 118.151 164.229 114.965 164.441 112.321 163.072 C 109.677 161.702 108.012 158.978 108.000 156.000 L 108.000 100.000 C 108.001 97.017 109.661 94.282 112.308 92.905 C 114.954 91.528 118.147 91.738 120.590 93.450 L 160.590 121.450 C 162.725 122.947 163.997 125.392 163.997 128.000 C 163.997 130.608 162.725 133.053 160.590 134.550 Z"),
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
        return _youtubeLogo!!
    }

private var _youtubeLogo: ImageVector? = null
