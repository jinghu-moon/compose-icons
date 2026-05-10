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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 13.341C21.374 13.12 20.701 13 20 13c-3.314 0-6 2.686-6 6 0 .701 .12 1.374 .341 2h-11.341C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h18c.552 0 1 .448 1 1v9.341ZM12.061 11.683 5.647 6.238 4.353 7.762l7.72 6.555L19.654 7.756 18.346 6.244l-6.285 5.439ZM21.414 19l2.121 2.121-1.414 1.414L20 20.414l-2.121 2.121L16.465 21.121 18.586 19 16.465 16.879l1.414-1.414L20 17.586l2.121-2.121 1.414 1.414L21.414 19Z"),
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
        return _mailCloseFill!!
    }

private var _mailCloseFill: ImageVector? = null
