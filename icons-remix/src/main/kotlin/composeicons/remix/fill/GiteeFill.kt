package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GiteeFill: ImageVector
    get() {
        if (_giteeFill != null) return _giteeFill!!
        _giteeFill = remixIcon(
            name = "GiteeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM10.148 6.444c-2.045 0-3.704 1.659-3.704 3.704v6.913c0 .273 .221 .494 .494 .494h7.284c1.84-0 3.333-1.493 3.333-3.333v-2.84c0-.273-.221-.494-.494-.494h-5.679c-.273 0-.494 .221-.494 .494v1.234c-0 .273 .22 .494 .493 .494h3.458c.272 0 .493 .221 .493 .493v.247c0 .818-.663 1.481-1.481 1.481h-4.691c-.273 0-.494-.221-.494-.493v-4.691C8.666 9.33 9.329 8.667 10.148 8.667h6.913c.273-0 .494-.222 .494-.494v-1.234c0-.273-.22-.494-.493-.494h-6.913Z"),
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
        return _giteeFill!!
    }

private var _giteeFill: ImageVector? = null
