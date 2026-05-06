package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bread: ImageVector
    get() {
        if (_bread != null) return _bread!!
        _bread = phosphorThinIcon(
            name = "Bread",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 80C236 60.118 219.882 44 200 44h-152C30.468 44.002 15.486 56.633 12.522 73.912 9.557 91.192 19.471 108.094 36 113.94v86.06c0 6.627 5.373 12 12 12h152c6.627 0 12-5.373 12-12v-86.06C226.37 108.837 235.979 95.249 236 80ZM44 200v-84.23c1.328 .153 2.663 .229 4 .23 2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4C32.536 108 20 95.464 20 80 20 64.536 32.536 52 48 52h96c15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4 1.337-.001 2.672-.077 4-.23v84.23c0 2.209-1.791 4-4 4h-96c-2.209 0-4-1.791-4-4ZM200 108c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4 1.337-.001 2.672-.077 4-.23v84.23c0 2.209-1.791 4-4 4h-44.7c.463-1.283 .7-2.636 .7-4v-86.06c12.288-4.355 21.261-15.014 23.458-27.865C181.655 73.225 176.733 60.191 166.59 52h33.41c15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28Z"),
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
        return _bread!!
    }

private var _bread: ImageVector? = null
