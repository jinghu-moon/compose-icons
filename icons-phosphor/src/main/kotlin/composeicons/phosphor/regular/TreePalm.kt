package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TreePalm: ImageVector
    get() {
        if (_treePalm != null) return _treePalm!!
        _treePalm = phosphorRegularIcon(
            name = "TreePalm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M237.79 53.23C225.145 39.687 207.448 31.999 188.92 31.999c-18.528 0-36.225 7.688-48.87 21.231C135.233 58.284 131.174 64.011 128 70.23 124.842 64.014 120.8 58.288 116 53.23 103.355 39.687 85.658 31.999 67.13 31.999c-18.528 0-36.225 7.688-48.87 21.231-1.8 1.891-2.564 4.543-2.046 7.102 .518 2.559 2.252 4.705 4.646 5.748L77 90.55C58.718 95.438 43.123 107.383 33.64 123.76c-9.611 16.4-12.206 35.982-7.2 54.32 .696 2.568 2.623 4.623 5.141 5.481 2.519 .858 5.299 .408 7.419-1.201l81-61.68v103.32c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-103.32l81 61.68c2.119 1.614 4.903 2.067 7.425 1.208 2.522-.859 4.451-2.916 5.145-5.488 5.006-18.338 2.411-37.92-7.2-54.32C212.885 107.38 197.286 95.436 179 90.55L235.22 66.08c2.394-1.043 4.129-3.188 4.646-5.748 .518-2.559-.246-5.211-2.046-7.102ZM67.08 48c14.14 .032 27.636 5.918 37.28 16.26 7.129 7.502 12.061 16.817 14.26 26.93L39 56.53C47.309 50.97 57.082 48.001 67.08 48ZM40 161.5c-.382-10.409 2.209-20.711 7.47-29.7 7.428-12.819 19.668-22.139 34-25.89 4.772-1.273 9.691-1.915 14.63-1.91 5.499-.001 10.968 .812 16.23 2.41ZM208.5 131.8c5.271 8.986 7.873 19.288 7.5 29.7L143.7 106.4c24.882-7.513 51.674 2.983 64.83 25.4ZM137.38 91.19c2.199-10.113 7.131-19.428 14.26-26.93C161.284 53.918 174.78 48.032 188.92 48c9.998 .001 19.771 2.97 28.08 8.53Z"),
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
        return _treePalm!!
    }

private var _treePalm: ImageVector? = null
