package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.At: ImageVector
    get() {
        if (_at != null) return _at!!
        _at = phosphorFillIcon(
            name = "At",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 128c0 .51 0 1 0 1.52C231.66 143.78 226.37 160 204 160c-23.14 0-28-17.4-28-32v-40c.005-2.217-.91-4.336-2.527-5.853C171.856 80.631 169.682 79.853 167.47 80c-4.275 .367-7.538 3.979-7.47 8.27v4C145.217 79.02 123.802 76.238 106.124 85.271 88.446 94.304 78.152 113.287 80.227 133.031c2.075 19.743 16.089 36.173 35.258 41.334 19.169 5.161 39.538-2.011 51.245-18.044 1 1.749 2.13 3.42 3.38 5C175.48 168 185.71 176 204 176c3.089 .01 6.173-.241 9.22-.75 1.538-.256 3.085 .404 3.963 1.693 .878 1.288 .928 2.97 .127 4.307C198.17 213.355 163.281 232.728 125.91 232 71.13 230.9 26.2 186.86 24.08 132.11 22.604 94.501 41.563 59.029 73.654 39.361 105.744 19.693 145.957 18.898 178.8 37.283 211.642 55.667 231.989 90.362 232 128ZM96 128c0 17.673 14.327 32 32 32 17.673 0 32-14.327 32-32C160 110.327 145.673 96 128 96c-17.673 0-32 14.327-32 32Z"),
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
        return _at!!
    }

private var _at: ImageVector? = null
