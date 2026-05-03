package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ClosedCaptioningLine: ImageVector
    get() {
        if (_closedCaptioningLine != null) return _closedCaptioningLine!!
        _closedCaptioningLine = remixIcon(
            name = "ClosedCaptioningLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 21.000 3.000 ZM 20.000 5.000 L 4.000 5.000 L 4.000 19.000 L 20.000 19.000 L 20.000 5.000 ZM 9.000 8.000 C 10.104 8.000 11.105 8.448 11.829 9.173 L 10.415 10.587 C 10.053 10.224 9.553 10.000 9.000 10.000 C 7.895 10.000 7.000 10.895 7.000 12.000 C 7.000 13.105 7.895 14.000 9.000 14.000 C 9.552 14.000 10.052 13.776 10.414 13.414 L 11.828 14.828 C 11.104 15.552 10.104 16.000 9.000 16.000 C 6.792 16.000 5.000 14.208 5.000 12.000 C 5.000 9.792 6.792 8.000 9.000 8.000 ZM 16.000 8.000 C 17.104 8.000 18.105 8.448 18.829 9.173 L 17.415 10.587 C 17.053 10.224 16.553 10.000 16.000 10.000 C 14.895 10.000 14.000 10.895 14.000 12.000 C 14.000 13.105 14.895 14.000 16.000 14.000 C 16.552 14.000 17.052 13.776 17.414 13.414 L 18.828 14.828 C 18.104 15.552 17.104 16.000 16.000 16.000 C 13.792 16.000 12.000 14.208 12.000 12.000 C 12.000 9.792 13.792 8.000 16.000 8.000 Z"),
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
        return _closedCaptioningLine!!
    }

private var _closedCaptioningLine: ImageVector? = null
