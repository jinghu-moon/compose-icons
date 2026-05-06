package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Ghost2Fill: ImageVector
    get() {
        if (_ghost2Fill != null) return _ghost2Fill!!
        _ghost2Fill = remixIcon(
            name = "Ghost2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c3.5 0 6 3 7 6 3 1 4 3.73 4 6l-2.775 .793c-.429 .123-.725 .515-.725 .962v1.496c0 .966-.784 1.75-1.75 1.75h-.596c-.671 0-1.297 .337-1.668 .896C14.558 21.299 13.396 22 12 22 10.604 22 9.442 21.299 8.514 19.896 8.144 19.337 7.517 19 6.846 19h-.596C5.284 19 4.5 18.216 4.5 17.25v-1.496c0-.446-.296-.839-.725-.962L1 14C1 11.734 2 9 5 8 6 5 8.5 2 12 2ZM12 12c-.828 0-1.5 1.119-1.5 2.5 0 1.381 .672 2.5 1.5 2.5 .828 0 1.5-1.119 1.5-2.5C13.5 13.119 12.828 12 12 12ZM9.5 8C8.672 8 8 8.672 8 9.5 8 10.328 8.672 11 9.5 11 10.328 11 11 10.328 11 9.5 11 8.672 10.328 8 9.5 8ZM14.5 8C13.672 8 13 8.672 13 9.5c0 .828 .672 1.5 1.5 1.5C15.328 11 16 10.328 16 9.5 16 8.672 15.328 8 14.5 8Z"),
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
        return _ghost2Fill!!
    }

private var _ghost2Fill: ImageVector? = null
