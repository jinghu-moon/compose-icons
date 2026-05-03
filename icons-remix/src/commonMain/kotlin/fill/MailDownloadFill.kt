package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MailDownloadFill: ImageVector
    get() {
        if (_mailDownloadFill != null) return _mailDownloadFill!!
        _mailDownloadFill = remixIcon(
            name = "MailDownloadFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 22.000 12.803 C 21.118 12.292 20.093 12.000 19.000 12.000 C 15.686 12.000 13.000 14.686 13.000 18.000 C 13.000 19.093 13.292 20.118 13.803 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 12.803 ZM 12.061 11.683 L 5.647 6.238 L 4.353 7.762 L 12.073 14.317 L 19.654 7.756 L 18.346 6.244 L 12.061 11.683 ZM 20.000 18.000 L 23.000 18.000 L 19.000 22.000 L 15.000 18.000 L 18.000 18.000 L 18.000 14.000 L 20.000 14.000 L 20.000 18.000 Z"),
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
        return _mailDownloadFill!!
    }

private var _mailDownloadFill: ImageVector? = null
