package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Building4Fill: ImageVector
    get() {
        if (_building4Fill != null) return _building4Fill!!
        _building4Fill = remixIcon(
            name = "Building4Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 20h2v2h-22v-2h2v-17C3 2.448 3.448 2 4 2h16c.552 0 1 .448 1 1v17ZM8 11v2h3v-2h-3ZM8 7v2h3v-2h-3ZM8 15v2h3v-2h-3ZM13 15v2h3v-2h-3ZM13 11v2h3v-2h-3ZM13 7v2h3v-2h-3Z"),
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
        return _building4Fill!!
    }

private var _building4Fill: ImageVector? = null
