package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.StethoscopeLine: ImageVector
    get() {
        if (_stethoscopeLine != null) return _stethoscopeLine!!
        _stethoscopeLine = remixIcon(
            name = "StethoscopeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8 3v2h-2v4c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-4h-2v-2h3c.552 0 1 .448 1 1v5c0 2.973-2.162 5.441-4.999 5.917L11 16.5C11 18.433 12.567 20 14.5 20c1.497 0 2.775-.94 3.275-2.263C16.728 17.27 16 16.22 16 15c0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3 0 1.371-.92 2.527-2.176 2.885C19.21 20.252 17.059 22 14.5 22 11.462 22 9 19.538 9 16.5l0-1.583C6.162 14.441 4 11.973 4 9v-5C4 3.448 4.448 3 5 3h3ZM19 14c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1Z"),
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
        return _stethoscopeLine!!
    }

private var _stethoscopeLine: ImageVector? = null
