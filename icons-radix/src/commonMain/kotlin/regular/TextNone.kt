package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.TextNone: ImageVector
    get() {
        if (_textNone != null) return _textNone!!
        _textNone = radixIcon(
            name = "TextNone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.646 1.646 C 12.842 1.451 13.158 1.451 13.354 1.646 C 13.549 1.842 13.549 2.158 13.354 2.353 L 8.050 7.657 L 8.050 12.050 L 9.254 12.050 C 9.502 12.050 9.704 12.252 9.704 12.500 C 9.704 12.717 9.550 12.898 9.345 12.940 L 9.254 12.950 L 5.754 12.950 L 5.663 12.940 C 5.458 12.898 5.304 12.717 5.304 12.500 C 5.304 12.283 5.458 12.102 5.663 12.059 L 5.754 12.050 L 6.950 12.050 L 6.950 8.757 L 2.353 13.354 C 2.158 13.549 1.842 13.549 1.646 13.354 C 1.451 13.158 1.451 12.842 1.646 12.646 L 6.950 7.343 L 6.950 2.950 L 3.950 2.950 L 3.950 4.500 C 3.950 4.748 3.748 4.950 3.500 4.950 C 3.252 4.950 3.050 4.748 3.050 4.500 L 3.050 2.500 C 3.050 2.445 3.060 2.393 3.078 2.345 C 3.080 2.340 3.080 2.335 3.082 2.331 C 3.087 2.318 3.094 2.307 3.101 2.295 C 3.107 2.282 3.113 2.270 3.121 2.258 C 3.128 2.247 3.135 2.237 3.143 2.227 C 3.148 2.220 3.154 2.212 3.160 2.205 L 3.182 2.182 C 3.186 2.177 3.191 2.173 3.196 2.169 C 3.208 2.158 3.220 2.147 3.233 2.138 C 3.242 2.131 3.252 2.125 3.262 2.119 C 3.274 2.111 3.287 2.104 3.301 2.098 C 3.312 2.092 3.323 2.086 3.335 2.081 C 3.350 2.075 3.367 2.071 3.383 2.066 C 3.393 2.064 3.403 2.060 3.414 2.058 C 3.442 2.052 3.471 2.050 3.500 2.050 L 11.500 2.050 L 11.579 2.057 C 11.582 2.057 11.586 2.058 11.589 2.059 L 11.591 2.060 C 11.596 2.061 11.601 2.062 11.606 2.063 C 11.624 2.068 11.642 2.073 11.658 2.079 C 11.671 2.084 11.683 2.090 11.695 2.096 C 11.705 2.100 11.715 2.104 11.724 2.109 L 11.733 2.115 C 11.739 2.118 11.744 2.122 11.749 2.126 C 11.783 2.149 11.815 2.177 11.842 2.208 C 11.880 2.253 11.909 2.306 11.928 2.364 L 12.646 1.646 ZM 8.050 6.243 L 11.050 3.243 L 11.050 2.950 L 8.050 2.950 L 8.050 6.243 Z"),
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
        return _textNone!!
    }

private var _textNone: ImageVector? = null
