package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PaperPlaneRight: ImageVector
    get() {
        if (_paperPlaneRight != null) return _paperPlaneRight!!
        _paperPlaneRight = phosphorLightIcon(
            name = "PaperPlaneRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 230.880 115.690 L 62.880 19.810 C 57.799 16.994 51.508 17.609 47.068 21.354 C 42.627 25.099 40.961 31.197 42.880 36.680 L 73.660 128.000 L 42.810 219.330 C 41.294 223.614 41.952 228.367 44.574 232.078 C 47.196 235.789 51.456 237.997 56.000 238.000 C 58.429 237.995 60.815 237.365 62.930 236.170 L 230.840 140.100 C 235.251 137.621 237.982 132.955 237.982 127.895 C 237.982 122.835 235.251 118.169 230.840 115.690 ZM 224.930 129.690 L 57.000 225.730 C 56.272 226.138 55.368 226.051 54.731 225.512 C 54.094 224.973 53.858 224.095 54.140 223.310 C 54.144 223.277 54.144 223.243 54.140 223.210 L 84.300 134.000 L 144.000 134.000 C 147.314 134.000 150.000 131.314 150.000 128.000 C 150.000 124.686 147.314 122.000 144.000 122.000 L 84.300 122.000 L 54.170 32.800 C 54.176 32.767 54.176 32.733 54.170 32.700 C 53.848 31.915 54.094 31.012 54.770 30.500 C 55.372 29.924 56.285 29.822 57.000 30.250 L 225.000 126.140 C 225.632 126.487 226.018 127.159 226.000 127.880 C 226.003 128.627 225.591 129.313 224.930 129.660 Z"),
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
        return _paperPlaneRight!!
    }

private var _paperPlaneRight: ImageVector? = null
