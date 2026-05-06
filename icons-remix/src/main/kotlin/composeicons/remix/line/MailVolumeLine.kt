package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MailVolumeLine: ImageVector
    get() {
        if (_mailVolumeLine != null) return _mailVolumeLine!!
        _mailVolumeLine = remixIcon(
            name = "MailVolumeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 14.5v9L16.667 21h-2.667v-4h2.667L20 14.5ZM21 3c.552 0 1 .448 1 1v9h-2v-5.763l-7.928 7.101L4 7.215v11.785h8v2h-9C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h18ZM21 17c1.105 0 2 .895 2 2 0 1.054-.816 1.918-1.851 1.994L21 21v-4ZM19.5 5h-14.989l7.55 6.662L19.5 5Z"),
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
        return _mailVolumeLine!!
    }

private var _mailVolumeLine: ImageVector? = null
