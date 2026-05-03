package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MailCloseFill: ImageVector
    get() {
        if (_mailCloseFill != null) return _mailCloseFill!!
        _mailCloseFill = remixIcon(
            name = "MailCloseFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 22.000 13.341 C 21.374 13.120 20.701 13.000 20.000 13.000 C 16.686 13.000 14.000 15.686 14.000 19.000 C 14.000 19.701 14.120 20.374 14.341 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 13.341 ZM 12.061 11.683 L 5.647 6.238 L 4.353 7.762 L 12.073 14.317 L 19.654 7.756 L 18.346 6.244 L 12.061 11.683 ZM 21.414 19.000 L 23.535 21.121 L 22.121 22.535 L 20.000 20.414 L 17.879 22.535 L 16.465 21.121 L 18.586 19.000 L 16.465 16.879 L 17.879 15.465 L 20.000 17.586 L 22.121 15.465 L 23.535 16.879 L 21.414 19.000 Z"),
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
        return _mailCloseFill!!
    }

private var _mailCloseFill: ImageVector? = null
