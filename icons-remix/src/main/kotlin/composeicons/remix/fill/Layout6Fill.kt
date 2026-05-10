package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Layout6Fill: ImageVector
    get() {
        if (_layout6Fill != null) return _layout6Fill!!
        _layout6Fill = remixIcon(
            name = "Layout6Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 10v11h-12C2.448 21 2 20.552 2 20v-10h13ZM22 10v10c0 .552-.448 1-1 1h-4v-11h5ZM21 3c.552 0 1 .448 1 1v4h-20v-4C2 3.448 2.448 3 3 3h18Z"),
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
        return _layout6Fill!!
    }

private var _layout6Fill: ImageVector? = null
