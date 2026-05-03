package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MailOpenFill: ImageVector
    get() {
        if (_mailOpenFill != null) return _mailOpenFill!!
        _mailOpenFill = remixIcon(
            name = "MailOpenFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.243 6.854 L 11.490 1.309 C 11.806 1.119 12.202 1.119 12.519 1.309 L 21.757 6.854 C 21.908 6.945 22.000 7.107 22.000 7.283 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 7.283 C 2.000 7.107 2.092 6.945 2.243 6.854 ZM 18.346 8.244 L 12.061 13.683 L 5.647 8.238 L 4.353 9.762 L 12.073 16.317 L 19.654 9.756 L 18.346 8.244 Z"),
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
        return _mailOpenFill!!
    }

private var _mailOpenFill: ImageVector? = null
