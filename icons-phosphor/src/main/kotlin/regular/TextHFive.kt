package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TextHFive: ImageVector
    get() {
        if (_textHFive != null) return _textHFive!!
        _textHFive = phosphorRegularIcon(
            name = "TextHFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 152.000 56.000 L 152.000 176.000 C 152.000 180.418 148.418 184.000 144.000 184.000 C 139.582 184.000 136.000 180.418 136.000 176.000 L 136.000 124.000 L 48.000 124.000 L 48.000 176.000 C 48.000 180.418 44.418 184.000 40.000 184.000 C 35.582 184.000 32.000 180.418 32.000 176.000 L 32.000 56.000 C 32.000 51.582 35.582 48.000 40.000 48.000 C 44.418 48.000 48.000 51.582 48.000 56.000 L 48.000 108.000 L 136.000 108.000 L 136.000 56.000 C 136.000 51.582 139.582 48.000 144.000 48.000 C 148.418 48.000 152.000 51.582 152.000 56.000 ZM 212.000 144.000 C 208.829 143.994 205.668 144.377 202.590 145.140 L 206.780 120.000 L 240.000 120.000 C 244.418 120.000 248.000 116.418 248.000 112.000 C 248.000 107.582 244.418 104.000 240.000 104.000 L 200.000 104.000 C 196.091 104.000 192.755 106.825 192.110 110.680 L 184.110 158.680 C 183.536 162.124 185.261 165.542 188.373 167.126 C 191.485 168.709 195.264 168.092 197.710 165.600 C 201.522 161.881 206.676 159.862 212.000 160.000 C 223.046 160.000 232.000 168.954 232.000 180.000 C 232.000 191.046 223.046 200.000 212.000 200.000 C 206.676 200.138 201.522 198.119 197.710 194.400 C 195.727 192.280 192.750 191.400 189.933 192.102 C 187.116 192.804 184.900 194.977 184.144 197.780 C 183.387 200.583 184.209 203.576 186.290 205.600 C 193.098 212.405 202.375 216.158 212.000 216.000 C 231.882 216.000 248.000 199.882 248.000 180.000 C 248.000 160.118 231.882 144.000 212.000 144.000 Z"),
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
        return _textHFive!!
    }

private var _textHFive: ImageVector? = null
