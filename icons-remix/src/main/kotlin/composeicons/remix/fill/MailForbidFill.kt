package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MailForbidFill: ImageVector
    get() {
        if (_mailForbidFill != null) return _mailForbidFill!!
        _mailForbidFill = remixIcon(
            name = "MailForbidFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.266 11.554 19.654 7.756 18.346 6.244l-6.285 5.439L5.647 6.238 4.353 7.762l7.703 6.54C11.387 15.375 11 16.642 11 18c0 1.074 .242 2.091 .674 3h-8.674C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h18c.552 0 1 .448 1 1v8.255C20.866 11.464 19.487 11 18 11c-.97 0-1.894 .197-2.734 .554ZM16.707 20.708c.392 .187 .83 .292 1.293 .292 1.657 0 3-1.343 3-3 0-.463-.105-.902-.292-1.293l-4.001 4.001ZM15.292 19.293l4.001-4.001C18.902 15.105 18.463 15 18 15c-1.657 0-3 1.343-3 3 0 .463 .105 .902 .292 1.293ZM18 23c-2.761 0-5-2.239-5-5 0-2.761 2.239-5 5-5 2.761 0 5 2.239 5 5 0 2.761-2.239 5-5 5Z"),
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
        return _mailForbidFill!!
    }

private var _mailForbidFill: ImageVector? = null
