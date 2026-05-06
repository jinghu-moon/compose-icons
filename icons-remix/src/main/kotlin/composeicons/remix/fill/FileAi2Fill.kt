package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileAi2Fill: ImageVector
    get() {
        if (_fileAi2Fill != null) return _fileAi2Fill!!
        _fileAi2Fill = remixIcon(
            name = "FileAi2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.529 15.319c.177-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.875 2.251 2.326l.718 .319c.41 .183 .41 .78 0 .963l-.76 .338c-.988 .439-1.779 1.242-2.219 2.251l-.247 .566c-.18 .414-.753 .414-.934 0l-.246-.566c-.439-1.009-1.232-1.812-2.22-2.251l-.76-.338c-.41-.183-.41-.78 0-.963l.718-.319c1.013-.451 1.819-1.283 2.251-2.326l.253-.611ZM20.002 2c.551 0 .998 .456 .998 .992v10.35C20.374 13.121 19.701 13 19 13c-3.314 0-6 2.686-6 6 0 1.093 .294 2.117 .805 3h-9.812C3.445 22 3 21.551 3 20.992v-11.992h6c.552 0 1-.448 1-1v-6h10.002ZM8 7h-5L8 2.003v4.997Z"),
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
        return _fileAi2Fill!!
    }

private var _fileAi2Fill: ImageVector? = null
