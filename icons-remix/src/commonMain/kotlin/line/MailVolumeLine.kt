package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MailVolumeLine: ImageVector
    get() {
        if (_mailVolumeLine != null) return _mailVolumeLine!!
        _mailVolumeLine = remixIcon(
            name = "MailVolumeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 14.500 L 20.000 23.500 L 16.667 21.000 L 14.000 21.000 L 14.000 17.000 L 16.667 17.000 L 20.000 14.500 ZM 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 13.000 L 20.000 13.000 L 20.000 7.237 L 12.072 14.338 L 4.000 7.215 L 4.000 19.000 L 12.000 19.000 L 12.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 21.000 3.000 ZM 21.000 17.000 C 22.105 17.000 23.000 17.895 23.000 19.000 C 23.000 20.054 22.184 20.918 21.149 20.994 L 21.000 21.000 L 21.000 17.000 ZM 19.500 5.000 L 4.511 5.000 L 12.061 11.662 L 19.500 5.000 Z"),
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
        return _mailVolumeLine!!
    }

private var _mailVolumeLine: ImageVector? = null
