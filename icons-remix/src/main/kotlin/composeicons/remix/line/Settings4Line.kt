package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Settings4Line: ImageVector
    get() {
        if (_settings4Line != null) return _settings4Line!!
        _settings4Line = remixIcon(
            name = "Settings4Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 12c0-.865 .11-1.703 .316-2.503C3.406 9.553 4.488 9.01 5.072 8 5.655 6.99 5.584 5.783 4.991 4.867 6.184 3.695 7.668 2.82 9.326 2.361c.496 .973 1.507 1.638 2.674 1.638 1.167 0 2.178-.666 2.674-1.638 1.658 .459 3.142 1.334 4.335 2.506-.593 .916-.663 2.123-.081 3.133 .583 1.01 1.666 1.553 2.756 1.496 .206 .8 .316 1.639 .316 2.503 0 .865-.11 1.703-.316 2.503-1.09-.056-2.173 .486-2.756 1.497-.583 1.01-.512 2.217 .081 3.133-1.192 1.172-2.677 2.047-4.335 2.506C14.178 20.666 13.167 20 12 20c-1.167 0-2.178 .666-2.674 1.639C7.668 21.179 6.184 20.304 4.991 19.133c.593-.916 .663-2.123 .081-3.133C4.488 14.99 3.406 14.447 2.316 14.503 2.11 13.703 2 12.864 2 12ZM6.804 15c.63 1.091 .811 2.346 .564 3.524 .408 .29 .842 .542 1.297 .75 .897-.803 2.074-1.274 3.335-1.274 1.261 0 2.438 .471 3.335 1.274 .455-.209 .889-.46 1.297-.75-.246-1.178-.066-2.432 .564-3.524 .63-1.091 1.626-1.875 2.769-2.25 .023-.248 .035-.498 .035-.75 0-.252-.012-.502-.035-.749C18.823 10.875 17.826 10.091 17.196 9 16.566 7.908 16.385 6.654 16.632 5.476c-.408-.29-.842-.542-1.297-.751C14.438 5.528 13.261 6 12 6 10.739 6 9.562 5.528 8.665 4.726c-.455 .209-.889 .46-1.297 .751 .246 1.178 .066 2.432-.564 3.524-.63 1.091-1.626 1.875-2.769 2.251C4.012 11.498 4 11.748 4 12c0 .252 .012 .502 .035 .75 1.143 .375 2.139 1.159 2.769 2.25ZM12 15c-1.657 0-3-1.343-3-3C9 10.343 10.343 9 12 9c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3ZM12 13c.552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1 0 .552 .448 1 1 1Z"),
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
        return _settings4Line!!
    }

private var _settings4Line: ImageVector? = null
