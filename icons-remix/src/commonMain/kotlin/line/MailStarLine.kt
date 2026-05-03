package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MailStarLine: ImageVector
    get() {
        if (_mailStarLine != null) return _mailStarLine!!
        _mailStarLine = remixIcon(
            name = "MailStarLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 22.000 13.000 L 20.000 13.000 L 20.000 7.238 L 12.072 14.338 L 4.000 7.216 L 4.000 19.000 L 14.000 19.000 L 14.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 13.000 ZM 4.511 5.000 L 12.062 11.662 L 19.501 5.000 L 4.511 5.000 ZM 19.500 21.750 L 16.855 23.141 L 17.360 20.195 L 15.220 18.109 L 18.177 17.680 L 19.500 15.000 L 20.823 17.680 L 23.780 18.109 L 21.640 20.195 L 22.145 23.141 L 19.500 21.750 Z"),
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
        return _mailStarLine!!
    }

private var _mailStarLine: ImageVector? = null
