package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Battery2ChargeLine: ImageVector
    get() {
        if (_battery2ChargeLine != null) return _battery2ChargeLine!!
        _battery2ChargeLine = remixIcon(
            name = "Battery2ChargeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 12h3l-5 7v-5h-3L13 7v5ZM11 6h-4v14h10v-14h-4v-2h-2v2ZM9 4v-1C9 2.448 9.448 2 10 2h4c.552 0 1 .448 1 1v1h3c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-12C5.448 22 5 21.552 5 21v-16C5 4.448 5.448 4 6 4h3Z"),
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
        return _battery2ChargeLine!!
    }

private var _battery2ChargeLine: ImageVector? = null
