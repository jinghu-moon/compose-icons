package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SubwayFill: ImageVector
    get() {
        if (_subwayFill != null) return _subwayFill!!
        _subwayFill = remixIcon(
            name = "SubwayFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.2 20 19 21.5v.5h-14v-.5L6.8 20h-1.8C3.895 20 3 19.105 3 18v-11C3 4.791 4.791 3 7 3h10c2.209 0 4 1.791 4 4v11c0 1.105-.895 2-2 2h-1.8ZM11 12v-7h-4C5.895 5 5 5.895 5 7v5h6ZM13 12h6v-5C19 5.895 18.105 5 17 5h-4v7ZM7.5 18C8.328 18 9 17.328 9 16.5 9 15.672 8.328 15 7.5 15 6.672 15 6 15.672 6 16.5 6 17.328 6.672 18 7.5 18ZM16.5 18C17.328 18 18 17.328 18 16.5 18 15.672 17.328 15 16.5 15 15.672 15 15 15.672 15 16.5c0 .828 .672 1.5 1.5 1.5Z"),
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
        return _subwayFill!!
    }

private var _subwayFill: ImageVector? = null
