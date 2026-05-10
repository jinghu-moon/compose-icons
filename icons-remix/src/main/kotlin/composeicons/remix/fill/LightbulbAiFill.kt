package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.LightbulbAiFill: ImageVector
    get() {
        if (_lightbulbAiFill != null) return _lightbulbAiFill!!
        _lightbulbAiFill = remixIcon(
            name = "LightbulbAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 21c0 1.105-.895 2-2 2h-4C8.895 23 8 22.105 8 21v-1h8v1ZM12.339 2.009C12.12 2.632 12 3.302 12 4c0 3.314 2.686 6 6 6 .698 0 1.367-.121 1.99-.34 .005 .113 .01 .226 .01 .34 0 1.892-.657 3.631-1.756 5.001-.55 .686-1.889 1.727-2.186 2.999h-8.117C7.644 16.727 6.304 15.686 5.754 14.999 4.656 13.63 4 11.891 4 10 4 5.582 7.582 2 12 2c.113 0 .226 .004 .339 .009ZM17.529 .328c.177-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.718 .319c.41 .183 .41 .78 0 .963l-.76 .338c-.988 .439-1.779 1.243-2.219 2.251l-.247 .565c-.18 .414-.753 .414-.934 0l-.246-.565C16.848 6.128 16.055 5.325 15.067 4.886l-.76-.338c-.41-.183-.41-.78 0-.963l.718-.319C16.038 2.815 16.844 1.982 17.276 .94l.253-.611Z"),
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
        return _lightbulbAiFill!!
    }

private var _lightbulbAiFill: ImageVector? = null
