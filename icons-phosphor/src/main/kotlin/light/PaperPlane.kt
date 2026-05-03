package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) return _paperPlane!!
        _paperPlane = phosphorLightIcon(
            name = "PaperPlane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 236.170 201.090 L 140.100 33.160 C 137.621 28.749 132.955 26.018 127.895 26.018 C 122.835 26.018 118.169 28.749 115.690 33.160 L 19.810 201.160 C 16.959 206.244 17.556 212.562 21.308 217.021 C 25.061 221.481 31.184 223.150 36.680 221.210 L 128.000 190.340 L 219.330 221.190 C 220.831 221.718 222.409 221.991 224.000 222.000 C 228.975 221.984 233.568 219.328 236.064 215.025 C 238.560 210.722 238.586 205.417 236.130 201.090 ZM 225.510 209.270 C 224.998 209.946 224.095 210.192 223.310 209.870 L 223.210 209.870 L 134.000 179.700 L 134.000 120.000 C 134.000 116.686 131.314 114.000 128.000 114.000 C 124.686 114.000 122.000 116.686 122.000 120.000 L 122.000 179.700 L 32.800 209.830 L 32.700 209.830 C 31.915 210.152 31.012 209.906 30.500 209.230 C 29.929 208.629 29.831 207.720 30.260 207.010 L 126.140 39.000 C 126.487 38.368 127.159 37.982 127.880 38.000 C 128.627 37.997 129.313 38.409 129.660 39.070 L 225.730 207.000 C 226.184 207.718 226.093 208.652 225.510 209.270 Z"),
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
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
