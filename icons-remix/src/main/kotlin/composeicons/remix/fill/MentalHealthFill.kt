package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MentalHealthFill: ImageVector
    get() {
        if (_mentalHealthFill != null) return _mentalHealthFill!!
        _mentalHealthFill = remixIcon(
            name = "MentalHealthFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 2c4.068 0 7.426 3.036 7.934 6.965l2.25 3.539c.148 .233 .118 .581-.225 .728L19 14.071v2.929c0 1.105-.895 2-2 2h-1.999L15 22h-9l0-3.694C6 17.125 5.564 16.009 4.755 15.001 3.657 13.631 3 11.892 3 10 3 5.582 6.582 2 11 2ZM10.47 7.763c-.683-.683-1.791-.683-2.475 0-.683 .683-.683 1.791 0 2.475L11 13.243l3.005-3.005c.683-.683 .683-1.791 0-2.475-.683-.683-1.792-.683-2.475 0L11 8.293l-.53-.53Z"),
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
        return _mentalHealthFill!!
    }

private var _mentalHealthFill: ImageVector? = null
