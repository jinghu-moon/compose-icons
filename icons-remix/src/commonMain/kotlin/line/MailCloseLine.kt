package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MailCloseLine: ImageVector
    get() {
        if (_mailCloseLine != null) return _mailCloseLine!!
        _mailCloseLine = remixIcon(
            name = "MailCloseLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 22.000 14.000 L 20.000 14.000 L 20.000 7.238 L 12.072 14.338 L 4.000 7.216 L 4.000 19.000 L 15.000 19.000 L 15.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 14.000 ZM 4.511 5.000 L 12.062 11.662 L 19.501 5.000 L 4.511 5.000 ZM 21.414 19.000 L 23.535 21.121 L 22.121 22.535 L 20.000 20.414 L 17.879 22.535 L 16.465 21.121 L 18.586 19.000 L 16.465 16.879 L 17.879 15.465 L 20.000 17.586 L 22.121 15.465 L 23.535 16.879 L 21.414 19.000 Z"),
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
        return _mailCloseLine!!
    }

private var _mailCloseLine: ImageVector? = null
