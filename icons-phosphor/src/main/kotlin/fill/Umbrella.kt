package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Umbrella: ImageVector
    get() {
        if (_umbrella != null) return _umbrella!!
        _umbrella = phosphorFillIcon(
            name = "Umbrella",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 126.630 C 235.020 68.508 186.335 23.896 128.000 24.000 L 128.000 24.000 C 69.684 23.922 21.029 68.527 16.050 126.630 C 15.666 131.097 17.174 135.520 20.206 138.822 C 23.238 142.124 27.517 144.002 32.000 144.000 L 120.000 144.000 L 120.000 200.000 C 120.000 217.673 134.327 232.000 152.000 232.000 C 169.673 232.000 184.000 217.673 184.000 200.000 C 184.000 195.582 180.418 192.000 176.000 192.000 C 171.582 192.000 168.000 195.582 168.000 200.000 C 168.000 208.837 160.837 216.000 152.000 216.000 C 143.163 216.000 136.000 208.837 136.000 200.000 L 136.000 144.000 L 224.000 144.000 C 228.492 144.016 232.784 142.144 235.827 138.840 C 238.870 135.536 240.385 131.105 240.000 126.630 ZM 32.000 128.000 C 35.641 85.682 66.617 50.767 108.200 42.110 C 96.480 58.000 81.850 86.110 80.170 128.000 L 32.000 128.000 ZM 175.830 128.000 C 174.150 86.110 159.520 58.000 147.830 42.060 C 189.432 50.710 220.409 85.661 224.000 128.000 Z"),
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
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
