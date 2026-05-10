package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Dresser: ImageVector
    get() {
        if (_dresser != null) return _dresser!!
        _dresser = phosphorFillIcon(
            name = "Dresser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 24h-144C47.163 24 40 31.163 40 40v40c0 2.209 1.791 4 4 4h168c2.209 0 4-1.791 4-4v-40c0-8.837-7.163-16-16-16ZM136 64h-16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM212 100h-168c-2.209 0-4 1.791-4 4v48c0 2.209 1.791 4 4 4h168c2.209 0 4-1.791 4-4v-48c0-2.209-1.791-4-4-4ZM136 136h-15.73c-4.281 .053-7.879-3.205-8.25-7.47-.147-2.212 .631-4.386 2.147-6.003 1.517-1.617 3.636-2.532 5.853-2.527h15.73c4.281-.053 7.879 3.205 8.25 7.47 .147 2.212-.631 4.386-2.147 6.003-1.517 1.617-3.636 2.532-5.853 2.527ZM212 172h-168c-2.209 0-4 1.791-4 4v40c0 8.837 7.163 16 16 16h144c8.837 0 16-7.163 16-16v-40c0-2.209-1.791-4-4-4ZM136 208h-16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8Z"),
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
        return _dresser!!
    }

private var _dresser: ImageVector? = null
