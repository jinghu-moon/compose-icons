package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TelegramLogo: ImageVector
    get() {
        if (_telegramLogo != null) return _telegramLogo!!
        _telegramLogo = phosphorBoldIcon(
            name = "TelegramLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 231.490 23.160 C 227.840 20.012 222.748 19.143 218.260 20.900 L 15.600 100.210 C 8.044 103.153 3.342 110.735 4.065 118.812 C 4.788 126.889 10.761 133.516 18.720 135.070 L 68.000 144.740 L 68.000 200.000 C 68.000 208.156 72.953 215.496 80.516 218.548 C 88.080 221.600 96.740 219.753 102.400 213.880 L 125.070 190.370 L 162.350 223.000 C 167.640 227.652 174.988 229.178 181.693 227.017 C 188.399 224.856 193.472 219.326 195.050 212.460 L 235.670 35.910 C 236.747 31.214 235.138 26.307 231.490 23.160 ZM 139.410 77.520 L 77.220 122.090 L 42.790 115.340 ZM 92.000 190.060 L 92.000 161.350 L 107.000 174.500 ZM 173.160 200.580 L 99.280 135.810 L 205.590 59.630 Z"),
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
        return _telegramLogo!!
    }

private var _telegramLogo: ImageVector? = null
