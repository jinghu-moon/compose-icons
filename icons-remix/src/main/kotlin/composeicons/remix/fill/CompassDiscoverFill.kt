package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CompassDiscoverFill: ImageVector
    get() {
        if (_compassDiscoverFill != null) return _compassDiscoverFill!!
        _compassDiscoverFill = remixIcon(
            name = "CompassDiscoverFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 22C7.477 22 3 17.523 3 12 3 6.477 7.477 2 13 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10ZM8 11.5 12 13l1.5 4.002L17 8 8 11.5Z"),
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
        return _compassDiscoverFill!!
    }

private var _compassDiscoverFill: ImageVector? = null
