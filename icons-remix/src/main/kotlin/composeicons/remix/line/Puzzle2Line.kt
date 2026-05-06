package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Puzzle2Line: ImageVector
    get() {
        if (_puzzle2Line != null) return _puzzle2Line!!
        _puzzle2Line = remixIcon(
            name = "Puzzle2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 5C7 2.791 8.791 1 11 1c2.209 0 4 1.791 4 4h5c.552 0 1 .448 1 1v4.171c0 .325-.158 .629-.423 .816-.265 .187-.605 .234-.911 .126C19.459 11.04 19.236 11 19 11c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 .236 0 .459-.04 .667-.113 .306-.108 .646-.061 .911 .126 .265 .188 .423 .492 .423 .816v4.171c0 .552-.448 1-1 1h-16C3.448 21 3 20.552 3 20v-14C3 5.448 3.448 5 4 5h3ZM11 3C9.895 3 9 3.895 9 5c0 .236 .04 .46 .114 .667 .108 .306 .061 .646-.126 .911C8.8 6.842 8.495 7 8.171 7h-3.171v12h14v-2c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4v-2h-5.171c-.325 0-.629-.158-.816-.423-.187-.265-.234-.605-.126-.911C12.96 5.46 13 5.236 13 5 13 3.895 12.105 3 11 3Z"),
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
        return _puzzle2Line!!
    }

private var _puzzle2Line: ImageVector? = null
