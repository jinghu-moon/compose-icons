package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UserSound: ImageVector
    get() {
        if (_userSound != null) return _userSound!!
        _userSound = phosphorLightIcon(
            name = "UserSound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 139.000 166.260 C 165.748 152.029 179.371 121.415 172.037 92.018 C 164.704 62.622 138.298 41.993 108.000 41.993 C 77.702 41.993 51.296 62.622 43.963 92.018 C 36.629 121.415 50.252 152.029 77.000 166.260 C 55.000 172.480 35.120 185.410 19.390 204.140 C 17.378 206.684 17.751 210.367 20.234 212.455 C 22.717 214.542 26.409 214.279 28.570 211.860 C 49.110 187.450 77.310 174.000 108.000 174.000 C 138.690 174.000 166.900 187.450 187.410 211.860 C 188.766 213.575 190.948 214.416 193.105 214.055 C 195.261 213.695 197.051 212.190 197.776 210.127 C 198.501 208.064 198.047 205.770 196.590 204.140 C 180.860 185.410 161.000 172.480 139.000 166.260 ZM 54.000 108.000 C 54.000 78.177 78.177 54.000 108.000 54.000 C 137.823 54.000 162.000 78.177 162.000 108.000 C 162.000 137.823 137.823 162.000 108.000 162.000 C 78.190 161.967 54.033 137.810 54.000 108.000 ZM 205.520 66.390 C 216.826 92.978 216.826 123.022 205.520 149.610 C 204.071 152.394 200.721 153.591 197.836 152.355 C 194.951 151.120 193.505 147.870 194.520 144.900 C 204.547 121.322 204.547 94.678 194.520 71.100 C 193.505 68.130 194.951 64.880 197.836 63.645 C 200.721 62.409 204.071 63.606 205.520 66.390 ZM 246.000 108.000 C 246.037 126.692 242.253 145.194 234.880 162.370 C 233.450 165.201 230.063 166.430 227.150 165.175 C 224.237 163.920 222.804 160.614 223.880 157.630 C 237.414 125.927 237.414 90.073 223.880 58.370 C 222.804 55.386 224.237 52.080 227.150 50.825 C 230.063 49.570 233.450 50.799 234.880 53.630 C 242.253 70.806 246.037 89.308 246.000 108.000 Z"),
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
        return _userSound!!
    }

private var _userSound: ImageVector? = null
