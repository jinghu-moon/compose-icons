package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ChromeLine: ImageVector
    get() {
        if (_chromeLine != null) return _chromeLine!!
        _chromeLine = remixIcon(
            name = "ChromeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.365 19.833l1.93-3.342c-.097 .006-.195 .01-.294 .01-1.696 0-3.173-.939-3.94-2.325L4.795 8.52C4.285 9.572 4 10.753 4 12c0 3.858 2.731 7.078 6.365 7.833ZM12.59 19.979C16.733 19.677 20 16.22 20 12c0-.873-.14-1.714-.398-2.5h-3.859c.479 .715 .758 1.575 .758 2.5 0 .848-.234 1.641-.642 2.318l-3.268 5.661ZM14.143 13.288l.022-.038c.213-.368 .335-.795 .335-1.25C14.5 10.619 13.381 9.5 12 9.5 10.619 9.5 9.5 10.619 9.5 12c0 .438 .113 .85 .311 1.208l.024 .042c.432 .747 1.24 1.25 2.165 1.25 .91 0 1.706-.486 2.143-1.212ZM6.035 6.669l1.928 3.34C8.698 8.522 10.23 7.5 12 7.5h6.615C17.175 5.387 14.75 4 12 4 9.63 4 7.5 5.031 6.035 6.669ZM12 22C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10Z"),
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
        return _chromeLine!!
    }

private var _chromeLine: ImageVector? = null
