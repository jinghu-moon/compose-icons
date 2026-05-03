package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ChatQuoteFill: ImageVector
    get() {
        if (_chatQuoteFill != null) return _chatQuoteFill!!
        _chatQuoteFill = remixIcon(
            name = "ChatQuoteFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 18.000 C 22.000 18.552 21.552 19.000 21.000 19.000 L 6.455 19.000 L 2.000 22.500 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 21.000 3.000 ZM 10.515 7.412 C 8.728 8.187 7.500 9.755 7.500 11.505 C 7.500 12.500 7.777 13.114 8.292 13.660 C 8.616 14.005 9.129 14.250 9.666 14.250 C 10.632 14.250 11.416 13.467 11.416 12.500 C 11.416 11.580 10.705 10.839 9.802 10.755 C 9.641 10.740 9.478 10.743 9.323 10.764 L 9.323 10.673 C 9.329 10.232 9.422 8.933 10.962 8.100 L 10.515 7.412 ZM 15.515 7.412 C 13.728 8.187 12.500 9.755 12.500 11.505 C 12.500 12.500 12.777 13.114 13.292 13.660 C 13.616 14.005 14.129 14.250 14.666 14.250 C 15.632 14.250 16.416 13.467 16.416 12.500 C 16.416 11.580 15.705 10.839 14.802 10.755 C 14.641 10.740 14.478 10.743 14.323 10.764 L 14.323 10.673 C 14.329 10.232 14.422 8.933 15.962 8.100 L 15.515 7.412 Z"),
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
        return _chatQuoteFill!!
    }

private var _chatQuoteFill: ImageVector? = null
