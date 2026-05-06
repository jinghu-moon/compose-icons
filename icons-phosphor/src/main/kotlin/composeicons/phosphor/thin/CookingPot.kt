package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CookingPot: ImageVector
    get() {
        if (_cookingPot != null) return _cookingPot!!
        _cookingPot = phosphorThinIcon(
            name = "CookingPot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M92 48v-32c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v32c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4ZM128 52c2.209 0 4-1.791 4-4v-32c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v32c0 2.209 1.791 4 4 4ZM160 52c2.209 0 4-1.791 4-4v-32c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v32c0 2.209 1.791 4 4 4ZM250.4 99.2 220 122v62c0 15.464-12.536 28-28 28h-128C48.536 212 36 199.464 36 184v-62L5.6 99.2C3.833 97.875 3.475 95.367 4.8 93.6c1.325-1.767 3.833-2.125 5.6-.8L36 112v-32c0-2.209 1.791-4 4-4h176c2.209 0 4 1.791 4 4v32L245.6 92.8c1.767-1.325 4.275-.967 5.6 .8 1.325 1.767 .967 4.275-.8 5.6ZM212 84h-168v100c0 11.046 8.954 20 20 20h128c11.046 0 20-8.954 20-20Z"),
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
        return _cookingPot!!
    }

private var _cookingPot: ImageVector? = null
