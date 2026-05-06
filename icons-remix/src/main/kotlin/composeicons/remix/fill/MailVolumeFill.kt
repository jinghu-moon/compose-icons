package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MailVolumeFill: ImageVector
    get() {
        if (_mailVolumeFill != null) return _mailVolumeFill!!
        _mailVolumeFill = remixIcon(
            name = "MailVolumeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 14.5v9L16.667 21h-2.667v-4h2.667L20 14.5ZM21 3c.552 0 1 .448 1 1l.001 10.529C20.939 13.578 19.537 13 18 13c-3.314 0-6 2.686-6 6 0 .701 .12 1.375 .342 2.001L3 21C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h18ZM21 17c1.105 0 2 .895 2 2 0 1.054-.816 1.918-1.851 1.994L21 21v-4ZM5.647 6.238 4.353 7.762l7.72 6.555L19.654 7.756 18.346 6.244l-6.286 5.438L5.647 6.238Z"),
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
        return _mailVolumeFill!!
    }

private var _mailVolumeFill: ImageVector? = null
