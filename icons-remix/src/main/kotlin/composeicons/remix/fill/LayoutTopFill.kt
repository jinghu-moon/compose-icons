package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.LayoutTopFill: ImageVector
    get() {
        if (_layoutTopFill != null) return _layoutTopFill!!
        _layoutTopFill = remixIcon(
            name = "LayoutTopFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 10v10c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-10h20ZM21 3c.552 0 1 .448 1 1v4h-20v-4C2 3.448 2.448 3 3 3h18Z"),
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
        return _layoutTopFill!!
    }

private var _layoutTopFill: ImageVector? = null
