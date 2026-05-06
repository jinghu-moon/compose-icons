package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Ghost3Fill: ImageVector
    get() {
        if (_ghost3Fill != null) return _ghost3Fill!!
        _ghost3Fill = remixIcon(
            name = "Ghost3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c4.971 0 9 4.029 9 9v8c0 .265-.105 .52-.293 .707l-2 2c-.337 .337-.865 .389-1.262 .125L15 20.201l-2.445 1.631c-.336 .224-.773 .224-1.109 0L9 20.201 6.555 21.832c-.397 .264-.925 .212-1.262-.125l-2-2C3.105 19.52 3 19.265 3 19v-8C3 6.029 7.029 2 12 2ZM9.5 8C8.672 8 8 8.672 8 9.5 8 10.328 8.672 11 9.5 11 10.328 11 11 10.328 11 9.5 11 8.672 10.328 8 9.5 8ZM14.5 8C13.672 8 13 8.672 13 9.5c0 .828 .672 1.5 1.5 1.5C15.328 11 16 10.328 16 9.5 16 8.672 15.328 8 14.5 8Z"),
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
        return _ghost3Fill!!
    }

private var _ghost3Fill: ImageVector? = null
