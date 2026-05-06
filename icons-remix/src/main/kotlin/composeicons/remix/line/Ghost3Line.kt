package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Ghost3Line: ImageVector
    get() {
        if (_ghost3Line != null) return _ghost3Line!!
        _ghost3Line = remixIcon(
            name = "Ghost3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c4.971 0 9 4.029 9 9v8c0 .265-.105 .52-.293 .707l-2 2c-.337 .337-.865 .389-1.262 .125L15 20.201l-2.445 1.631c-.336 .224-.773 .224-1.109 0L9 20.201 6.555 21.832c-.397 .264-.925 .212-1.262-.125l-2-2C3.105 19.52 3 19.265 3 19v-8C3 6.029 7.029 2 12 2ZM12 4C8.134 4 5 7.134 5 11v7.586l1.127 1.127L8.445 18.168l.13-.073c.313-.147 .685-.123 .979 .073L12 19.798l2.445-1.63 .13-.073c.313-.147 .685-.123 .979 .073l2.317 1.545L19 18.586v-7.586C19 7.134 15.866 4 12 4ZM9.5 8C10.328 8 11 8.672 11 9.5 11 10.328 10.328 11 9.5 11 8.672 11 8 10.328 8 9.5 8 8.672 8.672 8 9.5 8ZM14.5 8C15.328 8 16 8.672 16 9.5 16 10.328 15.328 11 14.5 11 13.672 11 13 10.328 13 9.5 13 8.672 13.672 8 14.5 8Z"),
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
        return _ghost3Line!!
    }

private var _ghost3Line: ImageVector? = null
