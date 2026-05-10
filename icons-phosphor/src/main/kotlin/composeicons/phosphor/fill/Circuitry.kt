package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Circuitry: ImageVector
    get() {
        if (_circuitry != null) return _circuitry!!
        _circuitry = phosphorFillIcon(
            name = "Circuitry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M88 111.31l48 48v60.69c0 2.209-1.791 4-4 4h-84c-8.837 0-16-7.163-16-16v-160C32 39.163 39.163 32 48 32h20c2.209 0 4 1.791 4 4v117.38c-11.02 3.896-17.631 15.165-15.654 26.686 1.977 11.521 11.965 19.942 23.654 19.942 11.689 0 21.678-8.421 23.654-19.942C105.631 168.545 99.02 157.276 88 153.38ZM80 184c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM184 104c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8ZM208 32h-52c-2.209 0-4 1.791-4 4v32.69l13.66 13.66c10.548-5.039 23.191-1.746 29.941 7.798 6.749 9.544 5.641 22.562-2.625 30.828-8.266 8.266-21.284 9.374-30.828 2.625-9.544-6.749-12.837-19.393-7.798-29.941l-16-16C136.846 76.16 136.001 74.124 136 72v-36c0-2.209-1.791-4-4-4h-40c-2.209 0-4 1.791-4 4v52.69l61.66 61.65c1.5 1.502 2.342 3.538 2.34 5.66v64c0 2.209 1.791 4 4 4h52c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16Z"),
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
        return _circuitry!!
    }

private var _circuitry: ImageVector? = null
