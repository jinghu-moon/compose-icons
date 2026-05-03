package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Text: ImageVector
    get() {
        if (_text != null) return _text!!
        _text = radixIcon(
            name = "Text",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.579 2.057 C 11.583 2.057 11.586 2.058 11.589 2.059 L 11.591 2.060 C 11.596 2.061 11.601 2.062 11.607 2.064 C 11.624 2.068 11.642 2.073 11.658 2.079 C 11.671 2.084 11.683 2.090 11.696 2.096 C 11.705 2.101 11.715 2.104 11.724 2.110 L 11.734 2.115 C 11.739 2.119 11.744 2.123 11.749 2.126 C 11.784 2.149 11.815 2.177 11.842 2.208 C 11.909 2.287 11.950 2.389 11.950 2.500 L 11.950 4.500 C 11.950 4.749 11.748 4.950 11.500 4.950 C 11.252 4.950 11.050 4.749 11.050 4.500 L 11.050 2.950 L 8.050 2.950 L 8.050 12.050 L 9.254 12.050 C 9.503 12.050 9.704 12.252 9.704 12.500 C 9.704 12.717 9.550 12.899 9.345 12.941 L 9.254 12.950 L 5.754 12.950 L 5.663 12.941 C 5.458 12.899 5.304 12.717 5.304 12.500 C 5.304 12.283 5.458 12.102 5.663 12.060 L 5.754 12.050 L 6.950 12.050 L 6.950 2.950 L 3.950 2.950 L 3.950 4.500 C 3.950 4.749 3.749 4.950 3.500 4.950 C 3.252 4.950 3.050 4.749 3.050 4.500 L 3.050 2.500 C 3.050 2.446 3.060 2.393 3.078 2.345 C 3.080 2.341 3.080 2.336 3.082 2.331 C 3.087 2.319 3.095 2.307 3.101 2.295 C 3.107 2.283 3.114 2.270 3.121 2.258 C 3.128 2.248 3.135 2.238 3.143 2.228 C 3.149 2.220 3.154 2.212 3.160 2.205 L 3.182 2.182 C 3.186 2.177 3.192 2.174 3.196 2.169 C 3.208 2.158 3.221 2.148 3.234 2.138 C 3.243 2.131 3.252 2.125 3.262 2.119 C 3.274 2.111 3.288 2.105 3.301 2.098 C 3.312 2.092 3.323 2.086 3.335 2.081 C 3.351 2.075 3.367 2.071 3.383 2.067 C 3.393 2.064 3.404 2.060 3.414 2.058 C 3.442 2.052 3.471 2.050 3.500 2.050 L 11.500 2.050 L 11.579 2.057 Z"),
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
        return _text!!
    }

private var _text: ImageVector? = null
