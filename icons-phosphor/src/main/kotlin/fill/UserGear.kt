package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UserGear: ImageVector
    get() {
        if (_userGear != null) return _userGear!!
        _userGear = phosphorFillIcon(
            name = "UserGear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 198.130 194.850 C 200.134 197.232 200.574 200.559 199.259 203.380 C 197.944 206.201 195.112 208.003 192.000 208.000 L 24.000 208.000 C 20.889 207.999 18.061 206.196 16.749 203.376 C 15.436 200.555 15.878 197.230 17.880 194.850 C 32.820 177.070 51.400 164.440 72.050 157.680 C 46.284 141.632 34.275 110.450 42.620 81.265 C 50.966 52.079 77.645 31.960 108.000 31.960 C 138.355 31.960 165.034 52.079 173.380 81.265 C 181.725 110.450 169.716 141.632 143.950 157.680 C 164.600 164.440 183.180 177.070 198.130 194.850 ZM 255.180 154.000 C 253.749 156.479 251.102 158.004 248.240 158.000 C 246.835 158.004 245.455 157.635 244.240 156.930 L 239.570 154.230 C 237.335 156.147 234.765 157.636 231.990 158.620 L 231.990 164.000 C 231.990 168.418 228.408 172.000 223.990 172.000 C 219.572 172.000 215.990 168.418 215.990 164.000 L 215.990 158.620 C 213.215 157.636 210.645 156.147 208.410 154.230 L 203.740 156.930 C 202.525 157.635 201.145 158.004 199.740 158.000 C 196.118 158.001 192.947 155.569 192.009 152.070 C 191.072 148.572 192.602 144.880 195.740 143.070 L 200.400 140.380 C 199.853 137.486 199.853 134.514 200.400 131.620 L 195.740 128.930 C 191.913 126.721 190.601 121.827 192.810 118.000 C 195.019 114.173 199.913 112.861 203.740 115.070 L 208.410 117.770 C 210.645 115.853 213.215 114.364 215.990 113.380 L 215.990 108.000 C 215.990 103.582 219.572 100.000 223.990 100.000 C 228.408 100.000 231.990 103.582 231.990 108.000 L 231.990 113.380 C 234.765 114.364 237.335 115.853 239.570 117.770 L 244.240 115.070 C 248.067 112.861 252.961 114.173 255.170 118.000 C 257.379 121.827 256.067 126.721 252.240 128.930 L 247.580 131.620 C 248.127 134.514 248.127 137.486 247.580 140.380 L 252.240 143.070 C 254.080 144.129 255.424 145.876 255.975 147.926 C 256.526 149.976 256.240 152.161 255.180 154.000 ZM 224.000 144.000 C 228.418 144.000 232.000 140.418 232.000 136.000 C 232.000 131.582 228.418 128.000 224.000 128.000 C 219.582 128.000 216.000 131.582 216.000 136.000 C 216.000 140.418 219.582 144.000 224.000 144.000 Z"),
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
        return _userGear!!
    }

private var _userGear: ImageVector? = null
