package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Search2Fill: ImageVector
    get() {
        if (_search2Fill != null) return _search2Fill!!
        _search2Fill = remixIcon(
            name = "Search2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 2c4.968 0 9 4.032 9 9 0 4.968-4.032 9-9 9C6.032 20 2 15.968 2 11 2 6.032 6.032 2 11 2ZM19.485 18.071l2.828 2.828-1.414 1.414L18.071 19.485l1.414-1.414Z"),
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
        return _search2Fill!!
    }

private var _search2Fill: ImageVector? = null
