package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Gavel: ImageVector
    get() {
        if (_gavel != null) return _gavel!!
        _gavel = phosphorBoldIcon(
            name = "Gavel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M246.14 113.86l-16-16c-6.082-6.076-15.366-7.586-23.06-3.75L161.88 48.91c3.839-7.692 2.333-16.976-3.74-23.06l-16-16c-7.81-7.808-20.47-7.808-28.28 0l-64 64c-7.808 7.81-7.808 20.47 0 28.28l16 16c6.062 6.062 15.313 7.587 23 3.79L29.36 181.38c-12.498 12.498-12.498 32.762 0 45.26 12.498 12.498 32.762 12.498 45.26 0L134 167.21c-3.763 7.675-2.232 16.893 3.81 22.94l16 16c3.751 3.752 8.839 5.861 14.145 5.861 5.306 0 10.394-2.108 14.145-5.861l64-64c3.752-3.751 5.861-8.839 5.861-14.145 0-5.306-2.108-10.394-5.861-14.145ZM80 98.34 69.64 88 128 29.65 138.34 40ZM57.64 209.67c-3.126 3.123-8.192 3.121-11.315-.005-3.123-3.126-3.121-8.192 .005-11.315l59.52-59.52 11.31 11.32ZM150.34 149.38 106.62 105.66l39-39 43.72 43.72ZM167.99 186.38 157.65 176 216 117.66 226.34 128Z"),
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
        return _gavel!!
    }

private var _gavel: ImageVector? = null
