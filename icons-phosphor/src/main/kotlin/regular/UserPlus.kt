package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.UserPlus: ImageVector
    get() {
        if (_userPlus != null) return _userPlus!!
        _userPlus = phosphorRegularIcon(
            name = "UserPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 256.000 136.000 C 256.000 140.418 252.418 144.000 248.000 144.000 L 232.000 144.000 L 232.000 160.000 C 232.000 164.418 228.418 168.000 224.000 168.000 C 219.582 168.000 216.000 164.418 216.000 160.000 L 216.000 144.000 L 200.000 144.000 C 195.582 144.000 192.000 140.418 192.000 136.000 C 192.000 131.582 195.582 128.000 200.000 128.000 L 216.000 128.000 L 216.000 112.000 C 216.000 107.582 219.582 104.000 224.000 104.000 C 228.418 104.000 232.000 107.582 232.000 112.000 L 232.000 128.000 L 248.000 128.000 C 252.418 128.000 256.000 131.582 256.000 136.000 ZM 198.130 194.850 C 200.974 198.236 200.536 203.286 197.150 206.130 C 193.764 208.974 188.714 208.536 185.870 205.150 C 165.750 181.190 138.090 168.000 108.000 168.000 C 77.910 168.000 50.250 181.190 30.130 205.150 C 27.286 208.533 22.238 208.969 18.855 206.125 C 15.472 203.281 15.036 198.233 17.880 194.850 C 32.820 177.070 51.400 164.440 72.050 157.680 C 46.284 141.632 34.275 110.450 42.620 81.265 C 50.966 52.079 77.645 31.960 108.000 31.960 C 138.355 31.960 165.034 52.079 173.380 81.265 C 181.725 110.450 169.716 141.632 143.950 157.680 C 164.600 164.440 183.180 177.070 198.130 194.850 ZM 108.000 152.000 C 136.719 152.000 160.000 128.719 160.000 100.000 C 160.000 71.281 136.719 48.000 108.000 48.000 C 79.281 48.000 56.000 71.281 56.000 100.000 C 56.033 128.705 79.295 151.967 108.000 152.000 Z"),
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
        return _userPlus!!
    }

private var _userPlus: ImageVector? = null
