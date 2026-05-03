package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ThumbDown: ImageVector
    get() {
        if (_thumbDown != null) return _thumbDown!!
        _thumbDown = tablerFilledIcon(
            name = "ThumbDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.000 21.008 C 14.588 21.008 15.901 19.770 15.995 18.185 L 16.000 18.008 L 16.000 14.008 L 18.000 14.008 C 19.522 14.008 20.802 12.869 20.980 11.358 L 20.995 11.185 L 21.000 11.008 L 20.980 10.812 L 19.974 5.780 C 19.593 4.155 18.472 2.984 17.164 3.000 L 17.000 3.008 L 9.000 3.008 C 8.493 3.008 8.066 3.388 8.007 3.892 L 8.000 4.008 L 8.001 13.544 C 8.001 13.901 8.192 14.231 8.501 14.410 C 9.367 14.910 9.926 15.809 9.993 16.806 L 10.000 17.008 L 10.000 18.008 C 10.000 19.665 11.343 21.008 13.000 21.008 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 5.000 14.008 C 5.507 14.008 5.934 13.628 5.993 13.125 L 6.000 13.008 L 6.000 4.008 C 6.000 3.501 5.620 3.074 5.117 3.015 L 5.000 3.008 L 4.000 3.008 C 2.953 3.008 2.083 3.816 2.005 4.860 L 2.000 5.010 L 2.000 12.010 C 2.000 13.056 2.807 13.926 3.850 14.004 L 4.000 14.009 L 5.000 14.009 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _thumbDown!!
    }

private var _thumbDown: ImageVector? = null
