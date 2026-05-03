package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UserMinus: ImageVector
    get() {
        if (_userMinus != null) return _userMinus!!
        _userMinus = phosphorFillIcon(
            name = "UserMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 198.130 194.850 C 200.134 197.232 200.574 200.559 199.259 203.380 C 197.944 206.201 195.112 208.003 192.000 208.000 L 24.000 208.000 C 20.889 207.999 18.061 206.196 16.749 203.376 C 15.436 200.555 15.878 197.230 17.880 194.850 C 32.820 177.070 51.400 164.440 72.050 157.680 C 46.284 141.632 34.275 110.450 42.620 81.265 C 50.966 52.079 77.645 31.960 108.000 31.960 C 138.355 31.960 165.034 52.079 173.380 81.265 C 181.725 110.450 169.716 141.632 143.950 157.680 C 164.600 164.440 183.180 177.070 198.130 194.850 ZM 248.000 128.000 L 200.000 128.000 C 195.582 128.000 192.000 131.582 192.000 136.000 C 192.000 140.418 195.582 144.000 200.000 144.000 L 248.000 144.000 C 252.418 144.000 256.000 140.418 256.000 136.000 C 256.000 131.582 252.418 128.000 248.000 128.000 Z"),
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
        return _userMinus!!
    }

private var _userMinus: ImageVector? = null
