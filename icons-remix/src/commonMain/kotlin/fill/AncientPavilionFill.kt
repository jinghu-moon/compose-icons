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
                pathData = parseSvgPathData("M 1.516 7.877 C 1.680 9.830 3.089 11.452 5.000 11.887 L 5.000 19.001 L 3.000 19.001 L 3.000 21.001 L 21.000 21.001 L 21.000 19.001 L 19.000 19.001 L 19.000 11.887 C 20.911 11.452 22.320 9.830 22.484 7.877 C 21.994 7.959 21.497 8.000 21.000 8.000 C 17.186 8.000 13.786 5.596 12.515 2.000 L 11.485 2.000 C 10.214 5.596 6.814 8.000 3.000 8.000 C 2.503 8.000 2.006 7.959 1.516 7.877 ZM 17.000 19.001 L 7.000 19.001 L 7.000 12.000 L 17.000 12.000 L 17.000 19.001 Z"),
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
