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
                pathData = parseSvgPathData("M22 12C21.164 11.372 20.126 11 19 11c-2.419 0-4.437 1.718-4.9 4h-1.1v6h-10C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h18c.552 0 1 .448 1 1v8ZM12.061 11.683 5.647 6.238 4.353 7.762l7.72 6.555L19.654 7.756 18.346 6.244l-6.285 5.439ZM22 17h1v5h-8v-5h1v-1c0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3v1ZM20 17v-1c0-.552-.448-1-1-1-.552 0-1 .448-1 1v1h2Z"),
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
