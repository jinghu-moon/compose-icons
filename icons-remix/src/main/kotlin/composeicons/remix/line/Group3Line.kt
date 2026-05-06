package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Group3Line: ImageVector
    get() {
        if (_group3Line != null) return _group3Line!!
        _group3Line = remixIcon(
            name = "Group3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.5 7c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2ZM2.5 7c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4ZM9 16.5C9 15.119 7.881 14 6.5 14 5.119 14 4 15.119 4 16.5v2.5h5v-2.5ZM11 21h-9v-4.5C2 14.015 4.015 12 6.5 12 8.985 12 11 14.015 11 16.5v4.5ZM19.5 7c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2ZM13.5 7c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4ZM20 16.5C20 15.119 18.881 14 17.5 14 16.119 14 15 15.119 15 16.5v2.5h5v-2.5ZM13 19v-2.5C13 14.015 15.015 12 17.5 12 19.985 12 22 14.015 22 16.5v4.5h-9v-2Z"),
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
        return _group3Line!!
    }

private var _group3Line: ImageVector? = null
