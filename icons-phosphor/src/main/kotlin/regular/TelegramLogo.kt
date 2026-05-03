package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TelegramLogo: ImageVector
    get() {
        if (_telegramLogo != null) return _telegramLogo!!
        _telegramLogo = phosphorRegularIcon(
            name = "TelegramLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.880 26.190 C 226.354 24.009 222.828 23.404 219.720 24.620 L 17.060 103.930 C 11.160 106.224 7.487 112.143 8.050 118.448 C 8.613 124.754 13.277 129.928 19.490 131.140 L 72.000 141.450 L 72.000 200.000 C 71.979 206.526 75.942 212.403 82.000 214.830 C 88.049 217.300 94.993 215.821 99.510 211.100 L 124.830 184.840 L 165.000 220.000 C 167.898 222.571 171.636 223.993 175.510 224.000 C 177.208 223.999 178.895 223.732 180.510 223.210 C 185.881 221.506 189.944 217.078 191.180 211.580 L 231.770 35.000 C 232.510 31.755 231.398 28.366 228.880 26.190 ZM 167.740 62.190 L 78.150 126.350 L 28.550 116.620 ZM 88.000 200.000 L 88.000 152.520 L 112.790 174.260 ZM 175.530 208.000 L 92.850 135.500 L 211.850 50.210 Z"),
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
        return _telegramLogo!!
    }

private var _telegramLogo: ImageVector? = null
