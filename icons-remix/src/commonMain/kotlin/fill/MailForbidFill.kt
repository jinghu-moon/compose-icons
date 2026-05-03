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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.266 11.554 L 19.654 7.756 L 18.346 6.244 L 12.061 11.683 L 5.647 6.238 L 4.353 7.762 L 12.055 14.302 C 11.387 15.375 11.000 16.642 11.000 18.000 C 11.000 19.074 11.242 20.091 11.674 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 12.255 C 20.866 11.464 19.487 11.000 18.000 11.000 C 17.030 11.000 16.106 11.197 15.266 11.554 ZM 16.707 20.708 C 17.098 20.895 17.537 21.000 18.000 21.000 C 19.657 21.000 21.000 19.657 21.000 18.000 C 21.000 17.537 20.895 17.098 20.708 16.707 L 16.707 20.708 ZM 15.292 19.293 L 19.293 15.292 C 18.902 15.105 18.463 15.000 18.000 15.000 C 16.343 15.000 15.000 16.343 15.000 18.000 C 15.000 18.463 15.105 18.902 15.292 19.293 ZM 18.000 23.000 C 15.239 23.000 13.000 20.761 13.000 18.000 C 13.000 15.239 15.239 13.000 18.000 13.000 C 20.761 13.000 23.000 15.239 23.000 18.000 C 23.000 20.761 20.761 23.000 18.000 23.000 Z"),
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
        return _mailForbidFill!!
    }

private var _mailForbidFill: ImageVector? = null
