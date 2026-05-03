package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ThumbUp: ImageVector
    get() {
        if (_thumbUp != null) return _thumbUp!!
        _thumbUp = tablerFilledIcon(
            name = "ThumbUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.000 3.000 C 14.589 3.000 15.902 4.238 15.995 5.824 L 16.000 6.000 L 16.000 10.000 L 18.000 10.000 C 19.522 10.000 20.802 11.139 20.980 12.650 L 20.995 12.824 L 21.000 13.000 L 20.980 13.196 L 19.974 18.228 C 19.593 19.854 18.472 21.024 17.164 21.008 L 17.000 21.000 L 9.000 21.000 C 8.493 21.000 8.066 20.620 8.007 20.117 L 8.000 20.000 L 8.001 10.464 C 8.001 10.107 8.192 9.777 8.501 9.599 C 9.367 9.099 9.927 8.200 9.993 7.202 L 10.000 7.000 L 10.000 6.000 C 10.000 4.343 11.343 3.000 13.000 3.000 Z"),
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
                pathData = parseSvgPathData("M 5.000 10.000 C 5.507 10.000 5.934 10.380 5.993 10.883 L 6.000 11.000 L 6.000 20.000 C 6.000 20.507 5.620 20.934 5.117 20.993 L 5.000 21.000 L 4.000 21.000 C 2.953 21.000 2.083 20.194 2.005 19.150 L 2.000 19.000 L 2.000 12.000 C 2.000 10.953 2.806 10.083 3.850 10.005 L 4.000 10.000 L 5.000 10.000 Z"),
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
        return _thumbUp!!
    }

private var _thumbUp: ImageVector? = null
