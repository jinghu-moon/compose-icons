package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Layout3Fill: ImageVector
    get() {
        if (_layout3Fill != null) return _layout3Fill!!
        _layout3Fill = remixIcon(
            name = "Layout3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8 10v11h-4C3.448 21 3 20.552 3 20v-10h5ZM21 10v10c0 .552-.448 1-1 1h-10v-11h11ZM20 3c.552 0 1 .448 1 1v4h-18v-4C3 3.448 3.448 3 4 3h16Z"),
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
        return _layout3Fill!!
    }

private var _layout3Fill: ImageVector? = null
