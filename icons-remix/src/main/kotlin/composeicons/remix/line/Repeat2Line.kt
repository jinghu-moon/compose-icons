package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Repeat2Line: ImageVector
    get() {
        if (_repeat2Line != null) return _repeat2Line!!
        _repeat2Line = remixIcon(
            name = "Repeat2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8 20v1.932c0 .276-.224 .5-.5 .5-.117 0-.23-.041-.32-.116L3.061 18.884c-.212-.177-.241-.492-.064-.704C3.092 18.066 3.233 18 3.381 18h14.619c1.105 0 2-.896 2-2v-8h2v8c0 2.209-1.791 4-4 4h-10ZM16 4v-1.932c0-.276 .224-.5 .5-.5 .117 0 .23 .041 .32 .116l4.119 3.432c.212 .177 .241 .492 .064 .704-.095 .114-.236 .18-.384 .18L6 6c-1.105 0-2 .895-2 2v8h-2v-8c0-2.209 1.791-4 4-4h10Z"),
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
        return _repeat2Line!!
    }

private var _repeat2Line: ImageVector? = null
