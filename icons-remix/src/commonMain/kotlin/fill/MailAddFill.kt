package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MailAddFill: ImageVector
    get() {
        if (_mailAddFill != null) return _mailAddFill!!
        _mailAddFill = remixIcon(
            name = "MailAddFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 22.000 13.341 C 21.374 13.120 20.701 13.000 20.000 13.000 C 16.686 13.000 14.000 15.686 14.000 19.000 C 14.000 19.701 14.120 20.374 14.341 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 13.341 ZM 12.061 11.683 L 5.647 6.238 L 4.353 7.762 L 12.073 14.317 L 19.654 7.756 L 18.346 6.244 L 12.061 11.683 ZM 21.000 18.000 L 24.000 18.000 L 24.000 20.000 L 21.000 20.000 L 21.000 23.000 L 19.000 23.000 L 19.000 20.000 L 16.000 20.000 L 16.000 18.000 L 19.000 18.000 L 19.000 15.000 L 21.000 15.000 L 21.000 18.000 Z"),
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
        return _mailAddFill!!
    }

private var _mailAddFill: ImageVector? = null
