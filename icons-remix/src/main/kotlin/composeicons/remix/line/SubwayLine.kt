package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SubwayLine: ImageVector
    get() {
        if (_subwayLine != null) return _subwayLine!!
        _subwayLine = remixIcon(
            name = "SubwayLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.2 20 19 21.5v.5h-14v-.5L6.8 20h-1.8C3.895 20 3 19.105 3 18v-11C3 4.791 4.791 3 7 3h10c2.209 0 4 1.791 4 4v11c0 1.105-.895 2-2 2h-1.8ZM13 5v6h6v-4C19 5.895 18.105 5 17 5h-4ZM11 5h-4C5.895 5 5 5.895 5 7v4h6v-6ZM19 13h-14v5h14v-5ZM7.5 17C6.672 17 6 16.328 6 15.5 6 14.672 6.672 14 7.5 14 8.328 14 9 14.672 9 15.5 9 16.328 8.328 17 7.5 17ZM16.5 17C15.672 17 15 16.328 15 15.5 15 14.672 15.672 14 16.5 14c.828 0 1.5 .672 1.5 1.5C18 16.328 17.328 17 16.5 17Z"),
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
        return _subwayLine!!
    }

private var _subwayLine: ImageVector? = null
