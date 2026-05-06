package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Folder4Fill: ImageVector
    get() {
        if (_folder4Fill != null) return _folder4Fill!!
        _folder4Fill = remixIcon(
            name = "Folder4Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8 21v-10h14v9c0 .552-.448 1-1 1h-13ZM6 21h-3C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h7.414l2 2h8.586c.552 0 1 .448 1 1v3h-15C6.448 9 6 9.448 6 10v11Z"),
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
        return _folder4Fill!!
    }

private var _folder4Fill: ImageVector? = null
