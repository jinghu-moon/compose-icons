package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UserPlus: ImageVector
    get() {
        if (_userPlus != null) return _userPlus!!
        _userPlus = phosphorFillIcon(
            name = "UserPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 256.000 136.000 C 256.000 140.418 252.418 144.000 248.000 144.000 L 232.000 144.000 L 232.000 160.000 C 232.000 164.418 228.418 168.000 224.000 168.000 C 219.582 168.000 216.000 164.418 216.000 160.000 L 216.000 144.000 L 200.000 144.000 C 195.582 144.000 192.000 140.418 192.000 136.000 C 192.000 131.582 195.582 128.000 200.000 128.000 L 216.000 128.000 L 216.000 112.000 C 216.000 107.582 219.582 104.000 224.000 104.000 C 228.418 104.000 232.000 107.582 232.000 112.000 L 232.000 128.000 L 248.000 128.000 C 252.418 128.000 256.000 131.582 256.000 136.000 ZM 144.000 157.680 C 169.766 141.632 181.775 110.450 173.430 81.265 C 165.084 52.079 138.405 31.960 108.050 31.960 C 77.695 31.960 51.016 52.079 42.670 81.265 C 34.325 110.450 46.334 141.632 72.100 157.680 C 51.450 164.440 32.870 177.070 17.930 194.850 C 15.933 197.223 15.488 200.537 16.788 203.353 C 18.088 206.169 20.899 207.980 24.000 208.000 L 192.000 208.000 C 195.112 208.003 197.944 206.201 199.259 203.380 C 200.574 200.559 200.134 197.232 198.130 194.850 C 183.180 177.070 164.600 164.440 144.000 157.680 Z"),
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
        return _userPlus!!
    }

private var _userPlus: ImageVector? = null
