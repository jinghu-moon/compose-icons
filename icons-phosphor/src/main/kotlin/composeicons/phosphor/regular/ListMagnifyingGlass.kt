package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ListMagnifyingGlass: ImageVector
    get() {
        if (_listMagnifyingGlass != null) return _listMagnifyingGlass!!
        _listMagnifyingGlass = phosphorRegularIcon(
            name = "ListMagnifyingGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M32 64c0-4.418 3.582-8 8-8h176c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-176c-4.418 0-8-3.582-8-8ZM40 136h72c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-72c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM128 184h-88c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h88c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM237.66 197.66c-1.501 1.502-3.537 2.346-5.66 2.346-2.123 0-4.159-.844-5.66-2.346L206 177.36c-17.135 11.305-40.046 7.804-53.023-8.103-12.977-15.906-11.805-39.054 2.71-53.57 14.516-14.516 37.663-15.687 53.57-2.71 15.906 12.977 19.408 35.888 8.103 53.023l20.3 20.3c1.514 1.502 2.366 3.547 2.366 5.68 0 2.133-.852 4.178-2.366 5.68ZM184 168c13.255 0 24-10.745 24-24 0-13.255-10.745-24-24-24-13.255 0-24 10.745-24 24 0 13.255 10.745 24 24 24Z"),
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
        return _listMagnifyingGlass!!
    }

private var _listMagnifyingGlass: ImageVector? = null
