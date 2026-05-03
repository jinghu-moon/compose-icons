package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Quote: ImageVector
    get() {
        if (_quote != null) return _quote!!
        _quote = tablerFilledIcon(
            name = "Quote",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.000 5.000 C 10.105 5.000 11.000 5.895 11.000 7.000 L 11.000 13.000 C 11.000 16.130 9.350 18.193 6.243 18.970 C 5.895 19.060 5.526 18.956 5.276 18.699 C 5.026 18.442 4.933 18.070 5.032 17.725 C 5.132 17.380 5.408 17.115 5.757 17.030 C 7.984 16.473 9.000 15.203 9.000 13.000 L 9.000 12.000 L 6.000 12.000 C 4.953 12.000 4.083 11.194 4.005 10.150 L 4.000 10.000 L 4.000 7.000 C 4.000 5.895 4.895 5.000 6.000 5.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 18.000 5.000 C 19.105 5.000 20.000 5.895 20.000 7.000 L 20.000 13.000 C 20.000 16.130 18.350 18.193 15.243 18.970 C 14.895 19.060 14.526 18.956 14.276 18.699 C 14.026 18.442 13.933 18.070 14.032 17.725 C 14.132 17.380 14.408 17.115 14.757 17.030 C 16.984 16.473 18.000 15.203 18.000 13.000 L 18.000 12.000 L 15.000 12.000 C 13.953 12.000 13.083 11.194 13.005 10.150 L 13.000 10.000 L 13.000 7.000 C 13.000 5.895 13.895 5.000 15.000 5.000 Z"),
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
        return _quote!!
    }

private var _quote: ImageVector? = null
