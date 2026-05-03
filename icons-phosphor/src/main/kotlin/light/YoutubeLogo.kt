package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.YoutubeLogo: ImageVector
    get() {
        if (_youtubeLogo != null) return _youtubeLogo!!
        _youtubeLogo = phosphorLightIcon(
            name = "YoutubeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 163.330 123.000 L 115.330 91.000 C 113.488 89.771 111.118 89.656 109.166 90.703 C 107.214 91.749 105.997 93.785 106.000 96.000 L 106.000 160.000 C 105.997 162.215 107.214 164.251 109.166 165.297 C 111.118 166.344 113.488 166.229 115.330 165.000 L 163.330 133.000 C 165.006 131.888 166.013 130.011 166.013 128.000 C 166.013 125.989 165.006 124.112 163.330 123.000 ZM 118.000 148.790 L 118.000 107.210 L 149.180 128.000 ZM 232.400 70.000 C 230.639 63.158 225.699 57.577 219.120 55.000 C 185.000 41.790 130.270 42.000 128.000 42.000 C 125.730 42.000 71.000 41.790 36.840 55.000 C 30.277 57.588 25.353 63.166 23.600 70.000 C 21.050 79.890 18.000 98.000 18.000 128.000 C 18.000 158.000 21.050 176.110 23.600 186.000 C 25.361 192.842 30.301 198.423 36.880 201.000 C 71.000 214.210 125.720 214.000 128.000 214.000 L 128.710 214.000 C 135.620 214.000 186.710 213.560 219.160 201.000 C 225.739 198.423 230.679 192.842 232.440 186.000 C 234.990 176.130 238.040 158.070 238.040 128.000 C 238.040 97.930 235.000 79.890 232.400 70.000 ZM 220.780 183.000 C 219.999 186.118 217.766 188.671 214.780 189.860 C 182.780 202.190 128.580 202.000 128.000 202.000 C 127.420 202.000 73.290 202.200 41.250 189.830 C 38.264 188.641 36.031 186.088 35.250 182.970 C 32.840 173.780 30.000 156.780 30.000 128.000 C 30.000 99.220 32.840 82.220 35.220 73.000 C 36.001 69.882 38.234 67.329 41.220 66.140 C 72.060 54.260 123.530 54.000 127.760 54.000 L 128.000 54.000 C 128.540 54.000 182.710 53.800 214.750 66.170 C 217.736 67.359 219.969 69.912 220.750 73.030 C 223.130 82.220 225.970 99.220 225.970 128.030 C 225.970 156.840 223.160 173.780 220.780 183.000 Z"),
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
        return _youtubeLogo!!
    }

private var _youtubeLogo: ImageVector? = null
