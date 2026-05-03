package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Seatbelt: ImageVector
    get() {
        if (_seatbelt != null) return _seatbelt!!
        _seatbelt = phosphorFillIcon(
            name = "Seatbelt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 112.000 C 103.699 112.000 84.000 92.301 84.000 68.000 C 84.000 43.699 103.699 24.000 128.000 24.000 C 152.301 24.000 172.000 43.699 172.000 68.000 C 171.972 92.289 152.289 111.972 128.000 112.000 ZM 200.000 216.000 L 77.160 216.000 L 197.290 110.000 C 197.695 109.641 198.064 109.242 198.390 108.810 C 199.486 107.348 200.054 105.557 200.000 103.730 C 199.896 100.635 198.016 97.877 195.172 96.651 C 192.328 95.425 189.032 95.950 186.710 98.000 L 162.170 119.650 C 139.430 108.901 112.959 109.472 90.703 121.193 C 68.448 132.913 53.001 154.418 49.000 179.250 C 48.942 179.614 48.909 179.982 48.900 180.350 L 48.000 223.830 C 47.954 225.981 48.777 228.060 50.282 229.597 C 51.787 231.134 53.848 232.000 56.000 232.000 L 200.000 232.000 C 204.418 232.000 208.000 228.418 208.000 224.000 C 208.000 219.582 204.418 216.000 200.000 216.000 ZM 188.120 143.000 C 185.855 142.726 183.581 143.432 181.870 144.940 L 119.470 200.000 L 200.000 200.000 C 204.418 200.000 208.000 196.418 208.000 192.000 C 208.029 175.691 203.048 159.766 193.730 146.380 C 192.428 144.504 190.387 143.274 188.120 143.000 Z"),
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
        return _seatbelt!!
    }

private var _seatbelt: ImageVector? = null
