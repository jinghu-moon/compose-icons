package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Needle: ImageVector
    get() {
        if (_needle != null) return _needle!!
        _needle = phosphorLightIcon(
            name = "Needle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 188.240 67.760 C 190.580 70.103 190.580 73.897 188.240 76.240 L 172.240 92.240 C 169.876 94.443 166.192 94.378 163.907 92.093 C 161.622 89.808 161.557 86.124 163.760 83.760 L 179.760 67.760 C 182.103 65.420 185.897 65.420 188.240 67.760 ZM 222.000 72.000 C 222.029 82.084 218.021 91.760 210.870 98.870 L 186.870 122.870 C 185.992 123.747 184.863 124.331 183.640 124.540 C 131.500 133.540 45.110 219.380 44.240 220.240 C 43.719 220.769 43.101 221.193 42.420 221.490 L 42.420 221.490 C 41.656 221.823 40.833 221.996 40.000 222.000 C 37.575 221.998 35.389 220.536 34.462 218.295 C 33.534 216.055 34.046 213.476 35.760 211.760 L 35.760 211.760 C 37.160 210.350 122.540 124.320 131.450 72.370 C 131.659 71.147 132.243 70.018 133.120 69.140 L 157.120 45.140 C 167.986 34.266 184.332 31.010 198.535 36.890 C 212.738 42.770 222.000 56.628 222.000 72.000 ZM 210.000 72.000 C 209.996 61.487 203.661 52.011 193.948 47.988 C 184.235 43.965 173.056 46.188 165.620 53.620 L 142.930 76.300 C 138.790 97.090 124.310 123.910 99.800 156.200 C 132.090 131.690 158.910 117.200 179.700 113.070 L 202.380 90.380 C 207.276 85.519 210.021 78.899 210.000 72.000 Z"),
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
        return _needle!!
    }

private var _needle: ImageVector? = null
