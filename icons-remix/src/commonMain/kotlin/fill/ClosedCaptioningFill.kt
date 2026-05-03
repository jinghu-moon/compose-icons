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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 21.000 3.000 ZM 9.000 8.000 C 6.792 8.000 5.000 9.792 5.000 12.000 C 5.000 14.208 6.792 16.000 9.000 16.000 C 10.100 16.000 11.100 15.550 11.828 14.828 L 10.414 13.414 C 10.052 13.776 9.552 14.000 9.000 14.000 C 7.895 14.000 7.000 13.105 7.000 12.000 C 7.000 10.895 7.895 10.000 9.000 10.000 C 9.550 10.000 10.048 10.220 10.415 10.587 L 11.829 9.173 C 11.105 8.448 10.104 8.000 9.000 8.000 ZM 16.000 8.000 C 13.792 8.000 12.000 9.792 12.000 12.000 C 12.000 14.208 13.792 16.000 16.000 16.000 C 17.104 16.000 18.104 15.552 18.828 14.828 L 17.414 13.414 C 17.052 13.776 16.552 14.000 16.000 14.000 C 14.895 14.000 14.000 13.105 14.000 12.000 C 14.000 10.895 14.895 10.000 16.000 10.000 C 16.553 10.000 17.053 10.224 17.415 10.587 L 18.829 9.173 C 18.105 8.448 17.104 8.000 16.000 8.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _closedCaptioningFill!!
    }

private var _closedCaptioningFill: ImageVector? = null
