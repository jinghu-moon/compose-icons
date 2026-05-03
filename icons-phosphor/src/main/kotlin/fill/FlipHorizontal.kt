package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FlipHorizontal: ImageVector
    get() {
        if (_flipHorizontal != null) return _flipHorizontal!!
        _flipHorizontal = phosphorFillIcon(
            name = "FlipHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 120.000 40.000 L 120.000 200.000 C 120.000 208.837 112.837 216.000 104.000 216.000 L 40.000 216.000 C 34.649 216.003 29.652 213.331 26.682 208.881 C 23.712 204.430 23.163 198.789 25.220 193.850 L 89.220 33.920 L 89.280 33.780 C 92.256 26.794 99.733 22.862 107.175 24.369 C 114.618 25.876 119.976 32.406 120.000 40.000 ZM 229.330 208.840 C 226.367 213.310 221.362 215.998 216.000 216.000 L 152.000 216.000 C 143.163 216.000 136.000 208.837 136.000 200.000 L 136.000 40.000 C 135.997 32.386 141.360 25.825 148.822 24.312 C 156.284 22.800 163.778 26.756 166.740 33.770 L 166.800 33.910 L 230.800 193.840 C 232.843 198.772 232.292 204.398 229.330 208.840 ZM 216.000 200.000 L 215.940 199.850 L 152.000 40.000 L 152.000 200.000 Z"),
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
        return _flipHorizontal!!
    }

private var _flipHorizontal: ImageVector? = null
