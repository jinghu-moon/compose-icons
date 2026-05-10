package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TruckFill: ImageVector
    get() {
        if (_truckFill != null) return _truckFill!!
        _truckFill = remixIcon(
            name = "TruckFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 8h3l3 4.056v5.944h-2.035c-.243 1.696-1.701 3-3.465 3-1.763 0-3.222-1.304-3.465-3h-5.071c-.243 1.696-1.701 3-3.465 3C3.737 21 2.278 19.696 2.035 18h-1.035v-12C1 5.448 1.448 5 2 5h14c.552 0 1 .448 1 1v2ZM17 10v3h4v-.285L18.992 10h-1.992Z"),
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
        return _truckFill!!
    }

private var _truckFill: ImageVector? = null
