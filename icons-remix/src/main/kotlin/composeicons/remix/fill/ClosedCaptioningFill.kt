package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ClosedCaptioningFill: ImageVector
    get() {
        if (_closedCaptioningFill != null) return _closedCaptioningFill!!
        _closedCaptioningFill = remixIcon(
            name = "ClosedCaptioningFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 3c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h18ZM9 8C6.792 8 5 9.792 5 12c0 2.208 1.792 4 4 4 1.1 0 2.1-.45 2.828-1.172L10.414 13.414C10.052 13.776 9.552 14 9 14 7.895 14 7 13.105 7 12c0-1.105 .895-2 2-2 .55 0 1.048 .22 1.415 .587L11.829 9.173C11.105 8.448 10.104 8 9 8ZM16 8c-2.208 0-4 1.792-4 4 0 2.208 1.792 4 4 4 1.104 0 2.104-.448 2.828-1.172L17.414 13.414C17.052 13.776 16.552 14 16 14c-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 .553 0 1.053 .224 1.415 .587L18.829 9.173C18.105 8.448 17.104 8 16 8Z"),
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
        return _closedCaptioningFill!!
    }

private var _closedCaptioningFill: ImageVector? = null
