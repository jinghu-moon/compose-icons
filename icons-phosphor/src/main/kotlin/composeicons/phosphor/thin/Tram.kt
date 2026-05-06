package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Tram: ImageVector
    get() {
        if (_tram != null) return _tram!!
        _tram = phosphorThinIcon(
            name = "Tram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 52h-52v-32h36c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-80c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h36v32h-52C56.536 52 44 64.536 44 80v104c0 15.464 12.536 28 28 28h16L68.8 237.6c-1.325 1.767-.967 4.275 .8 5.6 1.767 1.325 4.275 .967 5.6-.8L98 212h60l22.8 30.4c1.325 1.767 3.833 2.125 5.6 .8 1.767-1.325 2.125-3.833 .8-5.6L168 212h16c15.464 0 28-12.536 28-28v-104C212 64.536 199.464 52 184 52ZM72 60h112c11.046 0 20 8.954 20 20v44h-152v-44C52 68.954 60.954 60 72 60ZM184 204h-112C60.954 204 52 195.046 52 184v-52h152v52c0 11.046-8.954 20-20 20ZM92 172c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM180 172c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _tram!!
    }

private var _tram: ImageVector? = null
