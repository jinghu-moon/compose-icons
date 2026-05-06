package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ClipboardText: ImageVector
    get() {
        if (_clipboardText != null) return _clipboardText!!
        _clipboardText = phosphorRegularIcon(
            name = "ClipboardText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 152c0 4.418-3.582 8-8 8h-64c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h64c4.418 0 8 3.582 8 8ZM160 112h-64c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h64c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM216 48v168c0 8.837-7.163 16-16 16h-144c-8.837 0-16-7.163-16-16v-168C40 39.163 47.163 32 56 32h36.26C101.351 21.821 114.352 16.001 128 16.001c13.648 0 26.648 5.82 35.74 15.999h36.26c8.837 0 16 7.163 16 16ZM96 64h64C160 46.327 145.673 32 128 32 110.327 32 96 46.327 96 64ZM200 48h-26.75c1.82 5.138 2.75 10.549 2.75 16v8c0 4.418-3.582 8-8 8h-80c-4.418 0-8-3.582-8-8v-8c0-5.451 .93-10.862 2.75-16h-26.75v168h144Z"),
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
        return _clipboardText!!
    }

private var _clipboardText: ImageVector? = null
