package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Sunglasses: ImageVector
    get() {
        if (_sunglasses != null) return _sunglasses!!
        _sunglasses = phosphorThinIcon(
            name = "Sunglasses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 44c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4 11.046 0 20 8.954 20 20v60h-184v-60C36 60.954 44.954 52 56 52c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4C40.536 44 28 56.536 28 72v92c0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40v-24h40v24c0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40v-92C228 56.536 215.464 44 200 44ZM36 164v-24h2.34l49.27 49.26c-9.648 7.482-22.712 8.822-33.678 3.455C42.967 187.348 36.01 176.209 36 164ZM100 164c.005 7.106-2.367 14.009-6.74 19.61L49.66 140h50.34ZM156 164v-24h2.34l49.27 49.26c-9.648 7.482-22.712 8.822-33.678 3.455C162.967 187.348 156.01 176.209 156 164ZM213.26 183.61 169.66 140h50.34v24c.005 7.106-2.367 14.009-6.74 19.61Z"),
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
        return _sunglasses!!
    }

private var _sunglasses: ImageVector? = null
