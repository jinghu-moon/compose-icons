package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AncientPavilionLine: ImageVector
    get() {
        if (_ancientPavilionLine != null) return _ancientPavilionLine!!
        _ancientPavilionLine = remixIcon(
            name = "AncientPavilionLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M1.516 7.877c.164 1.953 1.573 3.575 3.484 4.011v7.114h-2v2h18v-2h-2v-7.114c1.911-.436 3.32-2.058 3.484-4.011C21.994 7.959 21.497 8 21 8 17.186 8 13.786 5.596 12.515 2h-1.03C10.214 5.596 6.814 8 3 8 2.503 8 2.006 7.959 1.516 7.877ZM17 19.001h-10v-7.001h10v7.001ZM18.556 9.937 18.281 10h-12.563L5.445 9.937C5.308 9.906 5.178 9.866 5.053 9.816 6.59 9.532 8.023 8.921 9.351 7.981c1.057-.747 1.94-1.626 2.649-2.635 .71 1.01 1.592 1.888 2.649 2.635 1.328 .939 2.761 1.551 4.297 1.834-.125 .05-.255 .091-.391 .122Z"),
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
        return _ancientPavilionLine!!
    }

private var _ancientPavilionLine: ImageVector? = null
