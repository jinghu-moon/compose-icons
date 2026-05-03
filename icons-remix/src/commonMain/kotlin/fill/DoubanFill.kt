package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DoubanFill: ImageVector
    get() {
        if (_doubanFill != null) return _doubanFill!!
        _doubanFill = remixIcon(
            name = "DoubanFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.314 19.138 L 20.379 19.138 C 20.722 19.138 21.000 19.416 21.000 19.759 L 21.000 20.379 C 21.000 20.722 20.722 21.000 20.379 21.000 L 3.621 21.000 C 3.278 21.000 3.000 20.722 3.000 20.379 L 3.000 19.759 C 3.000 19.416 3.278 19.138 3.621 19.138 L 7.374 19.138 L 6.414 16.035 L 8.604 16.035 C 8.872 16.035 9.109 16.205 9.193 16.459 L 10.086 19.138 L 13.599 19.138 L 14.824 15.103 L 5.172 15.103 C 4.830 15.103 4.552 14.826 4.552 14.483 L 4.552 7.345 C 4.552 7.002 4.830 6.724 5.172 6.724 L 18.828 6.724 C 19.170 6.724 19.448 7.002 19.448 7.345 L 19.448 14.483 C 19.448 14.826 19.170 15.103 18.828 15.103 L 17.539 15.103 L 16.314 19.138 ZM 3.931 3.000 L 20.069 3.000 C 20.412 3.000 20.690 3.278 20.690 3.621 L 20.690 4.241 C 20.690 4.584 20.412 4.862 20.069 4.862 L 3.931 4.862 C 3.588 4.862 3.310 4.584 3.310 4.241 L 3.310 3.621 C 3.310 3.278 3.588 3.000 3.931 3.000 ZM 7.190 8.586 C 7.104 8.586 7.034 8.656 7.034 8.741 L 7.034 12.776 C 7.034 12.862 7.104 12.931 7.190 12.931 L 16.810 12.931 C 16.896 12.931 16.965 12.862 16.965 12.776 L 16.965 8.741 C 16.965 8.656 16.896 8.586 16.810 8.586 L 7.190 8.586 Z"),
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
        return _doubanFill!!
    }

private var _doubanFill: ImageVector? = null
