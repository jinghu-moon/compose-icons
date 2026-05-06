package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Focus2Fill: ImageVector
    get() {
        if (_focus2Fill != null) return _focus2Fill!!
        _focus2Fill = remixIcon(
            name = "Focus2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.52 0 10 4.48 10 10 0 5.52-4.48 10-10 10C6.48 22 2 17.52 2 12 2 6.48 6.48 2 12 2ZM12 20c4.427 0 8-3.573 8-8C20 7.573 16.427 4 12 4 7.573 4 4 7.573 4 12c0 4.427 3.573 8 8 8ZM12 18C8.68 18 6 15.32 6 12 6 8.68 8.68 6 12 6c3.32 0 6 2.68 6 6 0 3.32-2.68 6-6 6ZM12 10c-1.1 0-2 .9-2 2 0 1.1 .9 2 2 2 1.1 0 2-.9 2-2 0-1.1-.9-2-2-2Z"),
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
        return _focus2Fill!!
    }

private var _focus2Fill: ImageVector? = null
