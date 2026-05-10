package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Plug3Fill: ImageVector
    get() {
        if (_plug3Fill != null) return _plug3Fill!!
        _plug3Fill = remixIcon(
            name = "Plug3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 22h-10v-2h10v2ZM10 5h4v-3h2v3h4c.552 0 1 .448 1 1v9c0 2.209-1.791 4-4 4h-10C4.791 19 3 17.209 3 15v-9C3 5.448 3.448 5 4 5h4v-3h2v3Z"),
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
        return _plug3Fill!!
    }

private var _plug3Fill: ImageVector? = null
