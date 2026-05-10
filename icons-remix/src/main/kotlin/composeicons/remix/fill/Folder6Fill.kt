package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Folder6Fill: ImageVector
    get() {
        if (_folder6Fill != null) return _folder6Fill!!
        _folder6Fill = remixIcon(
            name = "Folder6Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 3C2.448 3 2 3.448 2 4v3h7.586L12 4.586 10.414 3h-7.414ZM14.414 5l-4 4h-8.414v11c0 .552 .448 1 1 1h18c.552 0 1-.448 1-1v-14C22 5.448 21.552 5 21 5h-6.586Z"),
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
        return _folder6Fill!!
    }

private var _folder6Fill: ImageVector? = null
