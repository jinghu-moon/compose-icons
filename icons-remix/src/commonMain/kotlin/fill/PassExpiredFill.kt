package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PassExpiredFill: ImageVector
    get() {
        if (_passExpiredFill != null) return _passExpiredFill!!
        _passExpiredFill = remixIcon(
            name = "PassExpiredFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.000 10.000 C 9.000 10.552 8.552 11.000 8.000 11.000 C 7.448 11.000 7.000 10.552 7.000 10.000 C 7.000 9.448 7.448 9.000 8.000 9.000 C 8.552 9.000 9.000 9.448 9.000 10.000 ZM 2.000 4.000 C 1.448 4.000 1.000 4.448 1.000 5.000 L 1.000 19.000 C 1.000 19.552 1.448 20.000 2.000 20.000 L 22.000 20.000 C 22.552 20.000 23.000 19.552 23.000 19.000 L 23.000 5.000 C 23.000 4.448 22.552 4.000 22.000 4.000 L 2.000 4.000 ZM 11.000 10.000 C 11.000 11.657 9.657 13.000 8.000 13.000 C 6.343 13.000 5.000 11.657 5.000 10.000 C 5.000 8.343 6.343 7.000 8.000 7.000 C 9.657 7.000 11.000 8.343 11.000 10.000 ZM 5.527 17.025 L 4.113 15.611 C 5.107 14.617 6.484 14.000 8.002 14.000 C 9.521 14.000 10.897 14.617 11.891 15.611 L 10.477 17.025 C 9.843 16.391 8.969 16.000 8.002 16.000 C 7.035 16.000 6.162 16.391 5.527 17.025 ZM 16.000 10.586 L 17.793 8.793 L 19.207 10.207 L 17.414 12.000 L 19.207 13.793 L 17.793 15.207 L 16.000 13.414 L 14.207 15.207 L 12.793 13.793 L 14.586 12.000 L 12.793 10.207 L 14.207 8.793 L 16.000 10.586 Z"),
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
        return _passExpiredFill!!
    }

private var _passExpiredFill: ImageVector? = null
