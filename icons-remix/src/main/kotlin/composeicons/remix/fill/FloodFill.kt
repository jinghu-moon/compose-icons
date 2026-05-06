package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FloodFill: ImageVector
    get() {
        if (_floodFill != null) return _floodFill!!
        _floodFill = remixIcon(
            name = "FloodFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 17.472C17.062 18.422 18.463 19 20 19h2v2h-2c-1.457 0-2.823-.39-4-1.07C14.824 20.61 13.458 21 12 21 10.543 21 9.177 20.61 8 19.93 6.824 20.61 5.458 21 4 21h-2v-2h2c1.537 0 2.939-.578 4-1.528C9.062 18.422 10.463 19 12 19c1.537 0 2.939-.578 4-1.528ZM12.573 1.532l.099 .079L23 11h-3v6c-1.636 0-3.088-.785-4-2C15.088 16.215 13.636 17 12 17 10.364 17 8.912 16.215 8 15 7.088 16.215 5.636 17 4 17L3.999 10.999 1 11 11.327 1.612c.318-.289 .775-.337 1.14-.144l.106 .065Z"),
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
        return _floodFill!!
    }

private var _floodFill: ImageVector? = null
