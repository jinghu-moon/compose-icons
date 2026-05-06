package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.CursorText: ImageVector
    get() {
        if (_cursorText != null) return _cursorText!!
        _cursorText = radixIcon(
            name = "CursorText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.5 1c.276 0 .5 .224 .5 .5C11 1.776 10.776 2 10.5 2 9.578 2 8.96 2.23 8.579 2.563 8.207 2.889 8 3.366 8 4v3h1.25c.276 0 .5 .224 .5 .5C9.75 7.776 9.526 8 9.25 8h-1.25v3c0 .634 .207 1.111 .579 1.436 .381 .333 .999 .564 1.921 .564 .276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5C9.422 14 8.54 13.73 7.921 13.189c-.163-.142-.302-.3-.421-.47-.118 .17-.258 .327-.421 .47C6.46 13.73 5.578 14 4.5 14 4.224 14 4 13.776 4 13.5 4 13.224 4.224 13 4.5 13c.922 0 1.54-.23 1.921-.564C6.793 12.111 7 11.634 7 11v-3h-1.25C5.474 8 5.25 7.776 5.25 7.5 5.25 7.224 5.474 7 5.75 7h1.25v-3C7 3.366 6.793 2.889 6.421 2.563 6.04 2.23 5.422 2 4.5 2 4.224 2 4 1.776 4 1.5 4 1.224 4.224 1 4.5 1c1.078 0 1.96 .27 2.579 .812 .162 .142 .303 .299 .421 .469 .118-.17 .258-.327 .421-.469C8.54 1.27 9.422 1 10.5 1Z"),
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
        return _cursorText!!
    }

private var _cursorText: ImageVector? = null
