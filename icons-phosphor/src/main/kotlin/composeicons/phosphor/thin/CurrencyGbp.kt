package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CurrencyGbp: ImageVector
    get() {
        if (_currencyGbp != null) return _currencyGbp!!
        _currencyGbp = phosphorThinIcon(
            name = "CurrencyGbp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188 208c0 2.209-1.791 4-4 4h-128c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h4c17.673 0 32-14.327 32-32v-40h-36c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h36v-40c.015-18.571 10.742-35.467 27.541-43.382 16.8-7.915 36.658-5.43 50.989 6.382 1.134 .9 1.693 2.341 1.462 3.77-.23 1.429-1.214 2.622-2.573 3.119-1.359 .498-2.881 .223-3.979-.719C153.498 43.328 136.951 41.257 122.952 47.852 108.954 54.447 100.015 68.525 100 84v40h36c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-36v40c0 12.59-5.928 24.446-16 32h100c2.209 0 4 1.791 4 4Z"),
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
        return _currencyGbp!!
    }

private var _currencyGbp: ImageVector? = null
