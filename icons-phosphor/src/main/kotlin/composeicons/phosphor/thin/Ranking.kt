package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Ranking: ImageVector
    get() {
        if (_ranking != null) return _ranking!!
        _ranking = phosphorThinIcon(
            name = "Ranking",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M116.21 101.26c-.692-2.093 .439-4.351 2.53-5.05l12-4c1.218-.404 2.557-.199 3.598 .551 1.042 .75 1.66 1.955 1.662 3.239v40c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-34.45l-6.74 2.24c-2.093 .692-4.351-.439-5.05-2.53ZM244 208c0 2.209-1.791 4-4 4h-224c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h12v-100C28 97.373 33.373 92 40 92h44v-36C84 49.373 89.373 44 96 44h64c6.627 0 12 5.373 12 12v76h44c6.627 0 12 5.373 12 12v60h12c2.209 0 4 1.791 4 4ZM172 140v64h48v-60c0-2.209-1.791-4-4-4ZM92 204h72v-148c0-2.209-1.791-4-4-4h-64c-2.209 0-4 1.791-4 4ZM36 204h48v-104h-44c-2.209 0-4 1.791-4 4Z"),
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
        return _ranking!!
    }

private var _ranking: ImageVector? = null
