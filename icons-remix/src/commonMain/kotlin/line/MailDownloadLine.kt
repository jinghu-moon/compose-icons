package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MailDownloadLine: ImageVector
    get() {
        if (_mailDownloadLine != null) return _mailDownloadLine!!
        _mailDownloadLine = remixIcon(
            name = "MailDownloadLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.000 7.238 L 12.072 14.338 L 4.000 7.216 L 4.000 19.000 L 13.000 19.000 L 13.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 12.000 L 20.000 12.000 L 20.000 7.238 ZM 19.501 5.000 L 4.511 5.000 L 12.062 11.662 L 19.501 5.000 ZM 20.000 18.000 L 23.000 18.000 L 19.000 22.000 L 15.000 18.000 L 18.000 18.000 L 18.000 14.000 L 20.000 14.000 L 20.000 18.000 Z"),
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
        return _mailDownloadLine!!
    }

private var _mailDownloadLine: ImageVector? = null
