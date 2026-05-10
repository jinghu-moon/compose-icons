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
                pathData = parseSvgPathData("M11 18h-3.059C7.644 16.727 6.304 15.686 5.754 14.999 4.656 13.63 4 11.892 4 10 4 5.582 7.582 2 12 2c4.418 0 8 3.582 8 8 0 1.892-.657 3.632-1.756 5.001-.55 .686-1.889 1.726-2.185 2.999h-3.059v-5h-2v5ZM16 20v1c0 1.105-.895 2-2 2h-4C8.895 23 8 22.105 8 21v-1h8Z"),
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
