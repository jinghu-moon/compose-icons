package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LightbulbAiLine: ImageVector
    get() {
        if (_lightbulbAiLine != null) return _lightbulbAiLine!!
        _lightbulbAiLine = remixIcon(
            name = "LightbulbAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.339 2.009 12 4C8.686 4 6 6.686 6 10c0 1.384 .468 2.691 1.314 3.748 .085 .106 .806 .853 .917 .974 .996 1.085 1.609 2.077 1.741 3.278h4.055c.132-1.201 .745-2.193 1.74-3.277 .112-.122 .83-.866 .916-.973C17.531 12.693 18 11.385 18 10l1.99-.34c.005 .113 .01 .226 .01 .34 0 1.892-.657 3.631-1.756 5.001C17.624 15.774 16 17 16 18.5v2.5c0 1.105-.895 2-2 2h-4C8.895 23 8 22.105 8 21v-2.5C8 17 6.375 15.773 5.754 14.999 4.656 13.63 4 11.892 4 10 4 5.582 7.582 2 12 2c.113 0 .226 .004 .339 .009ZM10 21h4v-1h-4v1ZM17.529 .328c.177-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.718 .319c.41 .183 .41 .78 0 .963l-.76 .338c-.988 .439-1.779 1.242-2.219 2.251l-.247 .565c-.18 .414-.753 .414-.934 0l-.246-.565C16.848 6.128 16.055 5.325 15.067 4.886l-.76-.338c-.41-.183-.41-.78 0-.963l.718-.319C16.038 2.815 16.844 1.982 17.276 .94l.253-.611Z"),
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
        return _lightbulbAiLine!!
    }

private var _lightbulbAiLine: ImageVector? = null
