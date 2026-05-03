package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GogglesFill: ImageVector
    get() {
        if (_gogglesFill != null) return _gogglesFill!!
        _gogglesFill = remixIcon(
            name = "GogglesFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.952 6.942 C 7.081 6.118 9.751 6.000 12.000 6.000 C 14.249 6.000 16.919 6.118 19.049 6.942 C 20.130 7.361 21.129 7.983 21.858 8.916 C 22.597 9.862 23.000 11.054 23.000 12.500 C 23.000 13.970 22.475 15.433 21.621 16.542 C 20.769 17.647 19.503 18.500 18.000 18.500 C 16.575 18.500 15.344 17.709 14.425 17.120 C 13.719 16.667 12.883 16.000 12.000 16.000 C 11.117 16.000 10.280 16.667 9.575 17.120 C 8.656 17.709 7.425 18.500 6.000 18.500 C 4.497 18.500 3.231 17.647 2.379 16.542 C 1.525 15.433 1.000 13.970 1.000 12.500 C 1.000 11.054 1.402 9.862 2.142 8.916 C 2.871 7.983 3.870 7.361 4.952 6.942 Z"),
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
        return _gogglesFill!!
    }

private var _gogglesFill: ImageVector? = null
