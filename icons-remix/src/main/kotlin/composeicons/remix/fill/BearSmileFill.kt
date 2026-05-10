package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BearSmileFill: ImageVector
    get() {
        if (_bearSmileFill != null) return _bearSmileFill!!
        _bearSmileFill = remixIcon(
            name = "BearSmileFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.5 2C19.985 2 22 4.015 22 6.5c0 1.356-.6 2.572-1.549 3.397 .355 .967 .549 2.012 .549 3.103 0 4.971-4.029 9-9 9C7.029 22 3 17.971 3 13c0-1.09 .194-2.136 .549-3.103C2.6 9.072 2 7.856 2 6.5 2 4.015 4.015 2 6.5 2c1.626 0 3.05 .862 3.841 2.154C10.877 4.053 11.433 4 12 4c.567 0 1.123 .053 1.661 .153C14.45 2.862 15.875 2 17.5 2ZM10 13h-2c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4h-2c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2Z"),
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
        return _bearSmileFill!!
    }

private var _bearSmileFill: ImageVector? = null
