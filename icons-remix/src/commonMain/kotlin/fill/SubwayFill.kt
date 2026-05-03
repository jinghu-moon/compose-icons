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
                pathData = parseSvgPathData("M 17.200 20.000 L 19.000 21.500 L 19.000 22.000 L 5.000 22.000 L 5.000 21.500 L 6.800 20.000 L 5.000 20.000 C 3.895 20.000 3.000 19.105 3.000 18.000 L 3.000 7.000 C 3.000 4.791 4.791 3.000 7.000 3.000 L 17.000 3.000 C 19.209 3.000 21.000 4.791 21.000 7.000 L 21.000 18.000 C 21.000 19.105 20.105 20.000 19.000 20.000 L 17.200 20.000 ZM 11.000 12.000 L 11.000 5.000 L 7.000 5.000 C 5.895 5.000 5.000 5.895 5.000 7.000 L 5.000 12.000 L 11.000 12.000 ZM 13.000 12.000 L 19.000 12.000 L 19.000 7.000 C 19.000 5.895 18.105 5.000 17.000 5.000 L 13.000 5.000 L 13.000 12.000 ZM 7.500 18.000 C 8.328 18.000 9.000 17.328 9.000 16.500 C 9.000 15.672 8.328 15.000 7.500 15.000 C 6.672 15.000 6.000 15.672 6.000 16.500 C 6.000 17.328 6.672 18.000 7.500 18.000 ZM 16.500 18.000 C 17.328 18.000 18.000 17.328 18.000 16.500 C 18.000 15.672 17.328 15.000 16.500 15.000 C 15.672 15.000 15.000 15.672 15.000 16.500 C 15.000 17.328 15.672 18.000 16.500 18.000 Z"),
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
