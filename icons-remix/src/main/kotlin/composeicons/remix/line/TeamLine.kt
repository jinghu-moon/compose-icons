package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TeamLine: ImageVector
    get() {
        if (_teamLine != null) return _teamLine!!
        _teamLine = remixIcon(
            name = "TeamLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 11c2.761 0 5 2.239 5 5v6h-2v-6c0-1.598-1.249-2.904-2.824-2.995L12 13c-1.598 0-2.904 1.249-2.995 2.824L9 16v6h-2v-6c0-2.761 2.239-5 5-5ZM5.5 14c.279 0 .55 .033 .81 .094-.168 .5-.271 1.028-.301 1.575L6 16l.001 .086c-.113-.04-.232-.067-.356-.079L5.5 16c-.78 0-1.42 .595-1.493 1.355L4 17.5v4.5h-2v-4.5C2 15.567 3.567 14 5.5 14ZM18.5 14C20.433 14 22 15.567 22 17.5v4.5h-2v-4.5c0-.78-.595-1.42-1.355-1.493L18.5 16c-.175 0-.343 .03-.5 .085L18 16c0-.666-.108-1.306-.309-1.904 .258-.063 .53-.096 .809-.096ZM5.5 8C6.881 8 8 9.119 8 10.5 8 11.881 6.881 13 5.5 13 4.119 13 3 11.881 3 10.5 3 9.119 4.119 8 5.5 8ZM18.5 8C19.881 8 21 9.119 21 10.5 21 11.881 19.881 13 18.5 13 17.119 13 16 11.881 16 10.5 16 9.119 17.119 8 18.5 8ZM5.5 10C5.224 10 5 10.224 5 10.5c0 .276 .224 .5 .5 .5C5.776 11 6 10.776 6 10.5 6 10.224 5.776 10 5.5 10ZM18.5 10c-.276 0-.5 .224-.5 .5 0 .276 .224 .5 .5 .5 .276 0 .5-.224 .5-.5C19 10.224 18.776 10 18.5 10ZM12 2c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4C9.791 10 8 8.209 8 6 8 3.791 9.791 2 12 2ZM12 4c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C14 4.895 13.105 4 12 4Z"),
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
        return _teamLine!!
    }

private var _teamLine: ImageVector? = null
