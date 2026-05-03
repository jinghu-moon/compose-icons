package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.UserGear: ImageVector
    get() {
        if (_userGear != null) return _userGear!!
        _userGear = phosphorDuotoneIcon(
            name = "UserGear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 168.000 100.000 C 168.000 133.137 141.137 160.000 108.000 160.000 C 74.863 160.000 48.000 133.137 48.000 100.000 C 48.000 66.863 74.863 40.000 108.000 40.000 C 141.137 40.000 168.000 66.863 168.000 100.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 144.000 157.680 C 169.766 141.632 181.775 110.450 173.430 81.265 C 165.084 52.079 138.405 31.960 108.050 31.960 C 77.695 31.960 51.016 52.079 42.670 81.265 C 34.325 110.450 46.334 141.632 72.100 157.680 C 51.450 164.440 32.870 177.070 17.930 194.850 C 16.025 197.029 15.445 200.067 16.414 202.794 C 17.382 205.522 19.749 207.513 22.602 208.001 C 25.455 208.490 28.349 207.400 30.170 205.150 C 50.250 181.190 77.910 168.000 108.000 168.000 C 138.090 168.000 165.750 181.190 185.870 205.150 C 188.714 208.536 193.764 208.974 197.150 206.130 C 200.536 203.286 200.974 198.236 198.130 194.850 C 183.180 177.070 164.600 164.440 144.000 157.680 ZM 56.000 100.000 C 56.000 71.281 79.281 48.000 108.000 48.000 C 136.719 48.000 160.000 71.281 160.000 100.000 C 160.000 128.719 136.719 152.000 108.000 152.000 C 79.295 151.967 56.033 128.705 56.000 100.000 ZM 252.250 143.070 L 247.590 140.380 C 248.137 137.486 248.137 134.514 247.590 131.620 L 252.250 128.930 C 256.077 126.721 257.389 121.827 255.180 118.000 C 252.971 114.173 248.077 112.861 244.250 115.070 L 239.580 117.770 C 237.345 115.853 234.775 114.364 232.000 113.380 L 232.000 108.000 C 232.000 103.582 228.418 100.000 224.000 100.000 C 219.582 100.000 216.000 103.582 216.000 108.000 L 216.000 113.380 C 213.225 114.364 210.655 115.853 208.420 117.770 L 203.750 115.070 C 199.923 112.861 195.029 114.173 192.820 118.000 C 190.611 121.827 191.923 126.721 195.750 128.930 L 200.410 131.620 C 199.863 134.514 199.863 137.486 200.410 140.380 L 195.750 143.070 C 191.923 145.279 190.611 150.173 192.820 154.000 C 195.029 157.827 199.923 159.139 203.750 156.930 L 208.420 154.230 C 210.655 156.147 213.225 157.636 216.000 158.620 L 216.000 164.000 C 216.000 168.418 219.582 172.000 224.000 172.000 C 228.418 172.000 232.000 168.418 232.000 164.000 L 232.000 158.620 C 234.775 157.636 237.345 156.147 239.580 154.230 L 244.250 156.930 C 245.465 157.635 246.845 158.004 248.250 158.000 C 251.872 158.001 255.043 155.569 255.981 152.070 C 256.918 148.572 255.388 144.880 252.250 143.070 ZM 224.000 144.000 C 219.582 144.000 216.000 140.418 216.000 136.000 C 216.000 131.582 219.582 128.000 224.000 128.000 C 228.418 128.000 232.000 131.582 232.000 136.000 C 232.000 140.418 228.418 144.000 224.000 144.000 Z"),
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
