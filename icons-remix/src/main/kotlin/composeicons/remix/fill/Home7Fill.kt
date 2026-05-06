package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Home7Fill: ImageVector
    get() {
        if (_home7Fill != null) return _home7Fill!!
        _home7Fill = remixIcon(
            name = "Home7Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 20c0 .552-.448 1-1 1h-14C4.448 21 4 20.552 4 20v-9h-3L11.327 1.612c.381-.347 .964-.347 1.345 0L23 11h-3v9ZM12 15c1.381 0 2.5-1.119 2.5-2.5C14.5 11.119 13.381 10 12 10c-1.381 0-2.5 1.119-2.5 2.5C9.5 13.881 10.619 15 12 15Z"),
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
        return _home7Fill!!
    }

private var _home7Fill: ImageVector? = null
