package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Pants: ImageVector
    get() {
        if (_pants != null) return _pants!!
        _pants = phosphorLightIcon(
            name = "Pants",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 221.890 214.260 L 199.890 38.260 C 199.013 31.256 193.059 26.001 186.000 26.000 L 70.000 26.000 C 62.941 26.001 56.987 31.256 56.110 38.260 L 34.110 214.260 C 33.611 218.245 34.847 222.252 37.504 225.263 C 40.162 228.275 43.984 230.000 48.000 230.000 L 88.690 230.000 C 95.097 230.000 100.686 225.650 102.260 219.440 L 128.000 120.000 L 153.730 219.440 C 155.305 225.654 160.900 230.004 167.310 230.000 L 208.000 230.000 C 212.016 230.000 215.838 228.275 218.496 225.263 C 221.153 222.252 222.389 218.245 221.890 214.260 ZM 195.220 97.660 C 180.703 95.574 169.150 84.432 166.540 70.000 L 191.770 70.000 ZM 70.000 38.000 L 186.000 38.000 C 187.014 37.992 187.873 38.744 188.000 39.750 L 190.270 58.000 L 65.730 58.000 L 68.000 39.750 C 68.127 38.744 68.986 37.992 70.000 38.000 ZM 64.230 70.000 L 89.460 70.000 C 86.850 84.432 75.297 95.574 60.780 97.660 ZM 90.630 216.490 C 90.406 217.378 89.606 218.000 88.690 218.000 L 48.000 218.000 C 47.423 218.005 46.873 217.760 46.489 217.329 C 46.106 216.898 45.928 216.322 46.000 215.750 L 59.250 109.870 C 81.032 108.298 98.718 91.648 101.600 70.000 L 122.000 70.000 L 122.000 95.240 ZM 209.500 217.320 C 209.121 217.752 208.574 217.999 208.000 218.000 L 167.310 218.000 C 166.375 218.000 165.566 217.352 165.360 216.440 L 134.000 95.240 L 134.000 70.000 L 154.400 70.000 C 157.282 91.648 174.968 108.298 196.750 109.870 L 210.000 215.750 C 210.067 216.321 209.885 216.893 209.500 217.320 Z"),
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
        return _pants!!
    }

private var _pants: ImageVector? = null
