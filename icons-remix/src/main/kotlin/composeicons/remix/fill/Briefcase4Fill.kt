package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Briefcase4Fill: ImageVector
    get() {
        if (_briefcase4Fill != null) return _briefcase4Fill!!
        _briefcase4Fill = remixIcon(
            name = "Briefcase4Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 13v3h6v-3h7v7c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-7h7ZM11 11h2v3h-2v-3ZM7 5v-3C7 1.448 7.448 1 8 1h8c.552 0 1 .448 1 1v3h4c.552 0 1 .448 1 1v5h-7v-2h-6v2h-7v-5C2 5.448 2.448 5 3 5h4ZM9 3v2h6v-2h-6Z"),
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
        return _briefcase4Fill!!
    }

private var _briefcase4Fill: ImageVector? = null
