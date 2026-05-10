package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HomeSmileFill: ImageVector
    get() {
        if (_homeSmileFill != null) return _homeSmileFill!!
        _homeSmileFill = remixIcon(
            name = "HomeSmileFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 20c0 .552-.448 1-1 1h-14C4.448 21 4 20.552 4 20v-9h-3L11.327 1.612c.381-.347 .964-.347 1.345 0L23 11h-3v9ZM7.5 13c0 2.485 2.015 4.5 4.5 4.5 2.485 0 4.5-2.015 4.5-4.5h-2c0 1.381-1.119 2.5-2.5 2.5C10.619 15.5 9.5 14.381 9.5 13h-2Z"),
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
        return _homeSmileFill!!
    }

private var _homeSmileFill: ImageVector? = null
