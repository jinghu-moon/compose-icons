package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ChatQuoteLine: ImageVector
    get() {
        if (_chatQuoteLine != null) return _chatQuoteLine!!
        _chatQuoteLine = remixIcon(
            name = "ChatQuoteLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 18.000 C 22.000 18.552 21.552 19.000 21.000 19.000 L 6.455 19.000 L 2.000 22.500 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 21.000 3.000 ZM 20.000 5.000 L 4.000 5.000 L 4.000 18.385 L 5.763 17.000 L 20.000 17.000 L 20.000 5.000 ZM 10.515 7.412 L 10.962 8.100 C 9.294 9.003 9.323 10.452 9.323 10.764 C 9.478 10.743 9.641 10.740 9.802 10.755 C 10.705 10.839 11.416 11.580 11.416 12.500 C 11.416 13.467 10.632 14.250 9.666 14.250 C 9.129 14.250 8.616 14.005 8.292 13.660 C 7.777 13.114 7.500 12.500 7.500 11.505 C 7.500 9.755 8.728 8.187 10.515 7.412 ZM 15.515 7.412 L 15.962 8.100 C 14.294 9.003 14.323 10.452 14.323 10.764 C 14.478 10.743 14.641 10.740 14.802 10.755 C 15.705 10.839 16.416 11.580 16.416 12.500 C 16.416 13.467 15.632 14.250 14.666 14.250 C 14.129 14.250 13.616 14.005 13.292 13.660 C 12.777 13.114 12.500 12.500 12.500 11.505 C 12.500 9.755 13.728 8.187 15.515 7.412 Z"),
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
        return _chatQuoteLine!!
    }

private var _chatQuoteLine: ImageVector? = null
