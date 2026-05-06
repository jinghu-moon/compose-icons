package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SidebarFoldFill: ImageVector
    get() {
        if (_sidebarFoldFill != null) return _sidebarFoldFill!!
        _sidebarFoldFill = remixIcon(
            name = "SidebarFoldFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 3h-9C3.448 3 3 3.448 3 4v16c0 .552 .448 1 1 1h9v-18ZM15 21v-18h5c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-5ZM11 8.5v7L7 12 11 8.5Z"),
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
        return _sidebarFoldFill!!
    }

private var _sidebarFoldFill: ImageVector? = null
