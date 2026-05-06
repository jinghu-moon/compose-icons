package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowClockwise: ImageVector
    get() {
        if (_arrowClockwise != null) return _arrowClockwise!!
        _arrowClockwise = phosphorThinIcon(
            name = "ArrowClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 56v48c0 2.209-1.791 4-4 4h-48c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h37.7L187.53 68.69l-.13-.12C154.818 35.997 102.079 35.747 69.189 68.009 36.299 100.271 35.534 153.005 67.473 186.208c31.939 33.204 84.663 34.485 118.177 2.872 1.607-1.519 4.141-1.447 5.66 .16 1.519 1.607 1.447 4.141-.16 5.66C174.107 211.069 151.493 220.057 128 220h-1.26C85.289 219.404 49.356 191.159 38.986 151.021 28.617 110.883 46.373 68.768 82.349 48.17 118.326 27.572 163.634 33.579 193 62.84l35 32.05v-38.89c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4Z"),
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
        return _arrowClockwise!!
    }

private var _arrowClockwise: ImageVector? = null
