package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Watch: ImageVector
    get() {
        if (_watch != null) return _watch!!
        _watch = phosphorRegularIcon(
            name = "Watch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 128C207.994 102.528 195.849 78.583 175.3 63.53L169.06 29.15C167.682 21.538 161.056 16.002 153.32 16h-50.64c-7.736 .002-14.362 5.538-15.74 13.15L80.7 63.53C60.145 78.578 47.998 102.526 47.998 128c0 25.474 12.147 49.422 32.702 64.47l6.24 34.38c1.378 7.612 8.004 13.148 15.74 13.15h50.64c7.736-.002 14.362-5.538 15.74-13.15l6.24-34.38C195.849 177.417 207.994 153.472 208 128ZM102.68 32h50.64l3.91 21.55c-18.784-7.4-39.676-7.4-58.46 0ZM64 128C64 92.654 92.654 64 128 64c35.346 0 64 28.654 64 64 0 35.346-28.654 64-64 64C92.67 191.961 64.039 163.33 64 128ZM153.32 224h-50.64L98.77 202.45c18.784 7.4 39.676 7.4 58.46 0ZM120 128v-40c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v32h32c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-40c-4.418 0-8-3.582-8-8Z"),
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
        return _watch!!
    }

private var _watch: ImageVector? = null
