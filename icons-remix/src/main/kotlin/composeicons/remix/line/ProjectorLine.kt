package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ProjectorLine: ImageVector
    get() {
        if (_projectorLine != null) return _projectorLine!!
        _projectorLine = remixIcon(
            name = "ProjectorLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 3h18c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3ZM11.126 12h-7.126v7h16v-7h-1.126c-.444 1.725-2.01 3-3.874 3-1.864 0-3.43-1.275-3.874-3ZM11.126 10C11.57 8.275 13.136 7 15 7c1.864 0 3.43 1.275 3.874 3h1.126v-5h-16v5h7.126ZM15 13c1.105 0 2-.895 2-2C17 9.895 16.105 9 15 9c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2ZM6 15h2v2h-2v-2Z"),
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
        return _projectorLine!!
    }

private var _projectorLine: ImageVector? = null
