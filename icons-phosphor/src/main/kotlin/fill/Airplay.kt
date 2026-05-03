package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Airplay: ImageVector
    get() {
        if (_airplay != null) return _airplay!!
        _airplay = phosphorFillIcon(
            name = "Airplay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 174.150 210.880 C 176.137 213.265 176.564 216.585 175.247 219.395 C 173.929 222.206 171.104 224.001 168.000 224.000 L 88.000 224.000 C 84.896 224.001 82.071 222.206 80.753 219.395 C 79.436 216.585 79.863 213.265 81.850 210.880 L 121.850 162.880 C 123.370 161.057 125.621 160.002 127.995 160.002 C 130.369 160.002 132.620 161.057 134.140 162.880 ZM 208.000 40.000 L 48.000 40.000 C 34.745 40.000 24.000 50.745 24.000 64.000 L 24.000 176.000 C 24.000 189.255 34.745 200.000 48.000 200.000 L 68.220 200.000 C 69.406 199.999 70.531 199.471 71.290 198.560 L 109.570 152.640 C 114.706 146.469 122.587 143.276 130.570 144.130 C 136.943 144.884 142.772 148.091 146.820 153.070 L 184.730 198.560 C 185.489 199.471 186.614 199.999 187.800 200.000 L 208.000 200.000 C 221.255 200.000 232.000 189.255 232.000 176.000 L 232.000 64.000 C 232.000 50.745 221.255 40.000 208.000 40.000 Z"),
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
        return _airplay!!
    }

private var _airplay: ImageVector? = null
