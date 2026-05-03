package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.LightbulbFill: ImageVector
    get() {
        if (_lightbulbFill != null) return _lightbulbFill!!
        _lightbulbFill = remixIcon(
            name = "LightbulbFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.000 18.000 L 7.941 18.000 C 7.644 16.727 6.304 15.686 5.754 14.999 C 4.656 13.630 4.000 11.892 4.000 10.000 C 4.000 5.582 7.582 2.000 12.000 2.000 C 16.418 2.000 20.000 5.582 20.000 10.000 C 20.000 11.892 19.343 13.632 18.244 15.001 C 17.694 15.687 16.356 16.728 16.059 18.000 L 13.000 18.000 L 13.000 13.000 L 11.000 13.000 L 11.000 18.000 ZM 16.000 20.000 L 16.000 21.000 C 16.000 22.105 15.105 23.000 14.000 23.000 L 10.000 23.000 C 8.895 23.000 8.000 22.105 8.000 21.000 L 8.000 20.000 L 16.000 20.000 Z"),
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
        return _lightbulbFill!!
    }

private var _lightbulbFill: ImageVector? = null
