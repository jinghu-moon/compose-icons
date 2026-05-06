package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Tractor: ImageVector
    get() {
        if (_tractor != null) return _tractor!!
        _tractor = phosphorThinIcon(
            name = "Tractor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 166.87v-32.87c.025-5.306-3.46-9.99-8.55-11.49h-.11L188 111.77v-39.77c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v37.61l-32-8.67v-48.94h12c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-120c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h12v40h-12c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h28c39.746 .044 71.956 32.254 72 72v12c0 2.209 1.791 4 4 4h36c-.016 14.24 9.379 26.777 23.051 30.759 13.672 3.982 28.33-1.549 35.963-13.57 7.633-12.021 6.405-27.64-3.014-38.32ZM68 92h-8v-40h80v85.15C126.621 109.559 98.664 92.028 68 92ZM148 180v-70.77l77.19 20.9c1.69 .526 2.833 2.1 2.81 3.87v26.36c-4.852-2.847-10.374-4.352-16-4.36-14.591 .014-27.332 9.878-31 24ZM212 212c-13.255 0-24-10.745-24-24 0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24ZM68 124c-26.51 0-48 21.49-48 48 0 26.51 21.49 48 48 48 26.51 0 48-21.49 48-48C115.972 145.502 94.498 124.028 68 124ZM68 212C45.909 212 28 194.091 28 172c0-22.091 17.909-40 40-40 22.091 0 40 17.909 40 40 0 22.091-17.909 40-40 40ZM76 172c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _tractor!!
    }

private var _tractor: ImageVector? = null
