package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShieldStar: ImageVector
    get() {
        if (_shieldStar != null) return _shieldStar!!
        _shieldStar = phosphorThinIcon(
            name = "ShieldStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M171.71 118.51c.822 2.049-.172 4.376-2.22 5.2l-35.16 14.07 20.87 27.82c1.325 1.767 .967 4.275-.8 5.6-1.767 1.325-4.275 .967-5.6-.8L128 142.67l-20.8 27.73c-1.325 1.767-3.833 2.125-5.6 .8-1.767-1.325-2.125-3.833-.8-5.6l20.87-27.82L86.51 123.71c-2.049-.828-3.038-3.161-2.21-5.21 .828-2.049 3.161-3.038 5.21-2.21L124 130.09v-34.09c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v34.09l34.51-13.8c2.049-.822 4.376 .172 5.2 2.22ZM220 56v56c0 51.16-24.73 82.12-45.47 99.1-22.4 18.32-44.55 24.5-45.48 24.76-.688 .187-1.412 .187-2.1 0-.93-.26-23.08-6.44-45.48-24.76C60.73 194.12 36 163.16 36 112v-56C36 49.373 41.373 44 48 44h160c6.627 0 12 5.373 12 12ZM212 56c0-2.209-1.791-4-4-4h-160c-2.209 0-4 1.791-4 4v56c0 38.44 14.23 69.63 42.29 92.71 12.388 10.167 26.521 17.998 41.71 23.11 15.187-5.117 29.319-12.947 41.71-23.11C197.77 181.63 212 150.44 212 112Z"),
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
        return _shieldStar!!
    }

private var _shieldStar: ImageVector? = null
