package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RepeatOneLine: ImageVector
    get() {
        if (_repeatOneLine != null) return _repeatOneLine!!
        _repeatOneLine = remixIcon(
            name = "RepeatOneLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8 20v1.933c0 .276-.224 .5-.5 .5-.117 0-.23-.041-.32-.116L3.061 18.884c-.212-.177-.241-.492-.064-.704C3.092 18.066 3.233 18 3.381 18h14.619c1.105 0 2-.895 2-2v-8h2v8c0 2.209-1.791 4-4 4h-10ZM16 2.068c0-.276 .224-.5 .5-.5 .117 0 .23 .041 .32 .116l4.119 3.432c.212 .177 .241 .492 .064 .704-.095 .114-.236 .18-.384 .18L6 6C4.895 6 4 6.895 4 8v8h-2v-8C2 5.791 3.791 4 6 4h10v-1.932ZM11 8h2v8h-2v-6h-2v-1L11 8Z"),
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
        return _repeatOneLine!!
    }

private var _repeatOneLine: ImageVector? = null
