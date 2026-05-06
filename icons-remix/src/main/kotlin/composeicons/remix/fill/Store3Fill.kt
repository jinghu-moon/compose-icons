package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Store3Fill: ImageVector
    get() {
        if (_store3Fill != null) return _store3Fill!!
        _store3Fill = remixIcon(
            name = "Store3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 13v7c0 .552-.448 1-1 1h-16C3.448 21 3 20.552 3 20v-7h-1v-2L3 6h18l1 5v2h-1ZM5 13v6h14v-6h-14ZM6 14h8v3h-8v-3ZM3 3h18v2h-18v-2Z"),
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
        return _store3Fill!!
    }

private var _store3Fill: ImageVector? = null
