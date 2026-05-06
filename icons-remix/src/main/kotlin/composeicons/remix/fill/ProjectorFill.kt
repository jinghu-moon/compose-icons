package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ProjectorFill: ImageVector
    get() {
        if (_projectorFill != null) return _projectorFill!!
        _projectorFill = remixIcon(
            name = "ProjectorFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 3h18c.552 0 1 .448 1 1v6h-3.126C18.43 8.275 16.864 7 15 7c-1.864 0-3.43 1.275-3.874 3h-9.126v-6C2 3.448 2.448 3 3 3ZM2 12v8c0 .552 .448 1 1 1h18c.552 0 1-.448 1-1v-8h-3.126c-.444 1.725-2.01 3-3.874 3-1.864 0-3.43-1.275-3.874-3h-9.126ZM15 9c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C17 9.895 16.105 9 15 9ZM6 15h2v2h-2v-2Z"),
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
        return _projectorFill!!
    }

private var _projectorFill: ImageVector? = null
