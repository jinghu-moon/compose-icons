package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.LayoutGrid2Fill: ImageVector
    get() {
        if (_layoutGrid2Fill != null) return _layoutGrid2Fill!!
        _layoutGrid2Fill = remixIcon(
            name = "LayoutGrid2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 3C2.448 3 2 3.448 2 4v4h5.5v-5h-4.5ZM9.5 3v5h5v-5h-5ZM16.5 3v5h5.5v-4C22 3.448 21.552 3 21 3h-4.5ZM22 10h-5.5v4h5.5v-4ZM22 16h-5.5v5h4.5c.552 0 1-.448 1-1v-4ZM14.5 21v-5h-5v5h5ZM7.5 21v-5h-5.5v4c0 .552 .448 1 1 1h4.5ZM2 14h5.5v-4h-5.5v4ZM9.5 10h5v4h-5v-4Z"),
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
        return _layoutGrid2Fill!!
    }

private var _layoutGrid2Fill: ImageVector? = null
