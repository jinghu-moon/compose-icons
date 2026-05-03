package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DropSlash: ImageVector
    get() {
        if (_dropSlash != null) return _dropSlash!!
        _dropSlash = phosphorThinIcon(
            name = "DropSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 51.000 37.310 C 49.514 35.653 46.967 35.514 45.310 37.000 C 43.653 38.486 43.514 41.033 45.000 42.690 L 69.810 69.930 C 52.700 94.850 44.000 119.750 44.000 144.000 C 44.004 178.477 65.075 209.451 97.141 222.117 C 129.207 234.783 165.757 226.568 189.320 201.400 L 205.000 218.690 C 205.956 219.768 207.417 220.248 208.826 219.948 C 210.235 219.647 211.374 218.613 211.807 217.239 C 212.240 215.865 211.902 214.364 210.920 213.310 ZM 128.000 220.000 C 86.045 219.956 52.044 185.955 52.000 144.000 C 52.000 121.900 59.850 99.050 75.330 76.000 L 183.920 195.460 C 169.543 211.116 149.256 220.019 128.000 220.000 ZM 92.780 47.620 C 91.206 46.098 91.148 43.593 92.650 42.000 C 102.767 31.278 113.832 21.491 125.710 12.760 C 127.086 11.799 128.914 11.799 130.290 12.760 C 145.211 23.750 158.865 36.364 171.000 50.370 C 197.810 81.210 212.000 113.580 212.000 144.000 C 212.004 151.547 210.995 159.061 209.000 166.340 C 208.522 168.078 206.942 169.281 205.140 169.280 C 204.782 169.283 204.425 169.236 204.080 169.140 C 203.056 168.860 202.185 168.183 201.660 167.260 C 201.135 166.338 200.998 165.244 201.280 164.220 C 203.093 157.633 204.008 150.832 204.000 144.000 C 204.000 81.710 140.920 30.750 128.000 21.000 C 117.464 29.034 107.580 37.888 98.440 47.480 C 97.708 48.250 96.701 48.697 95.639 48.724 C 94.577 48.750 93.549 48.353 92.780 47.620 Z"),
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
        return _dropSlash!!
    }

private var _dropSlash: ImageVector? = null
