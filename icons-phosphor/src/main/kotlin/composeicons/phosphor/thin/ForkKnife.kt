package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ForkKnife: ImageVector
    get() {
        if (_forkKnife != null) return _forkKnife!!
        _forkKnife = phosphorThinIcon(
            name = "ForkKnife",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M76 88v-48c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v48c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4ZM212 40v184c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-52h-52c-2.209 0-4-1.791-4-4 .368-18.847 2.752-37.6 7.11-55.94 9.47-39.22 27.21-65.41 51.31-75.74 1.237-.532 2.658-.406 3.782 .336 1.124 .741 1.8 1.998 1.798 3.344ZM204 46.46C162.25 70.33 156.81 145.75 156.1 164h47.9ZM116 39.34c-.365-2.182-2.428-3.655-4.61-3.29-2.182 .365-3.655 2.428-3.29 4.61l8 47.66c0 19.882-16.118 36-36 36-19.882 0-36-16.118-36-36l8-47.66c.365-2.182-1.108-4.245-3.29-4.61-2.182-.365-4.245 1.108-4.61 3.29l-8 48c-.082 .215-.149 .436-.2 .66 .032 22.737 17.36 41.715 40 43.81v92.19c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-92.19C106.64 129.715 123.968 110.737 124 88c.015-.22 .015-.44 0-.66Z"),
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
        return _forkKnife!!
    }

private var _forkKnife: ImageVector? = null
