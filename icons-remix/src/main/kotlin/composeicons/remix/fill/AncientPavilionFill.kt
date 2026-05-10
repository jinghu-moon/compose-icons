package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AncientPavilionFill: ImageVector
    get() {
        if (_ancientPavilionFill != null) return _ancientPavilionFill!!
        _ancientPavilionFill = remixIcon(
            name = "AncientPavilionFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M1.516 7.877c.164 1.953 1.573 3.575 3.484 4.011v7.114h-2v2h18v-2h-2v-7.114c1.911-.436 3.32-2.058 3.484-4.011C21.994 7.959 21.497 8 21 8 17.186 8 13.786 5.596 12.515 2h-1.03C10.214 5.596 6.814 8 3 8 2.503 8 2.006 7.959 1.516 7.877ZM17 19.001h-10v-7.001h10v7.001Z"),
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
        return _ancientPavilionFill!!
    }

private var _ancientPavilionFill: ImageVector? = null
