package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MailStarFill: ImageVector
    get() {
        if (_mailStarFill != null) return _mailStarFill!!
        _mailStarFill = remixIcon(
            name = "MailStarFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 22.000 14.044 C 21.239 13.695 20.392 13.500 19.500 13.500 C 16.186 13.500 13.500 16.186 13.500 19.500 C 13.500 20.018 13.566 20.521 13.689 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 14.044 ZM 12.061 11.683 L 5.647 6.238 L 4.353 7.762 L 12.073 14.317 L 19.654 7.756 L 18.346 6.244 L 12.061 11.683 ZM 19.500 21.750 L 16.855 23.141 L 17.360 20.195 L 15.220 18.109 L 18.177 17.680 L 19.500 15.000 L 20.823 17.680 L 23.780 18.109 L 21.640 20.195 L 22.145 23.141 L 19.500 21.750 Z"),
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
        return _mailStarFill!!
    }

private var _mailStarFill: ImageVector? = null
