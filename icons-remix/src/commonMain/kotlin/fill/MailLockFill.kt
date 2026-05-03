package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MailLockFill: ImageVector
    get() {
        if (_mailLockFill != null) return _mailLockFill!!
        _mailLockFill = remixIcon(
            name = "MailLockFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 22.000 12.000 C 21.164 11.372 20.126 11.000 19.000 11.000 C 16.581 11.000 14.563 12.718 14.100 15.000 L 13.000 15.000 L 13.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 12.000 ZM 12.061 11.683 L 5.647 6.238 L 4.353 7.762 L 12.073 14.317 L 19.654 7.756 L 18.346 6.244 L 12.061 11.683 ZM 22.000 17.000 L 23.000 17.000 L 23.000 22.000 L 15.000 22.000 L 15.000 17.000 L 16.000 17.000 L 16.000 16.000 C 16.000 14.343 17.343 13.000 19.000 13.000 C 20.657 13.000 22.000 14.343 22.000 16.000 L 22.000 17.000 ZM 20.000 17.000 L 20.000 16.000 C 20.000 15.448 19.552 15.000 19.000 15.000 C 18.448 15.000 18.000 15.448 18.000 16.000 L 18.000 17.000 L 20.000 17.000 Z"),
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
        return _mailLockFill!!
    }

private var _mailLockFill: ImageVector? = null
