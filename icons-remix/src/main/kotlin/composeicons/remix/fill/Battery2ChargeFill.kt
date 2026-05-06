package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Battery2ChargeFill: ImageVector
    get() {
        if (_battery2ChargeFill != null) return _battery2ChargeFill!!
        _battery2ChargeFill = remixIcon(
            name = "Battery2ChargeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 4v-1C9 2.448 9.448 2 10 2h4c.552 0 1 .448 1 1v1h3c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-12C5.448 22 5 21.552 5 21v-16C5 4.448 5.448 4 6 4h3ZM13 12v-5L8 14h3v5l5-7h-3Z"),
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
        return _battery2ChargeFill!!
    }

private var _battery2ChargeFill: ImageVector? = null
