package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MapPinPlus: ImageVector
    get() {
        if (_mapPinPlus != null) return _mapPinPlus!!
        _mapPinPlus = phosphorThinIcon(
            name = "MapPinPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M164 104c0 2.209-1.791 4-4 4h-28v28c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-28h-28c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h28v-28c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v28h28c2.209 0 4 1.791 4 4ZM212 104c0 30.42-14.17 62.79-41 93.62-12.138 14.025-25.798 26.656-40.73 37.66-1.376 .961-3.204 .961-4.58 0C110.772 224.274 97.125 211.643 85 197.62 58.17 166.79 44 134.42 44 104 44 57.608 81.608 20 128 20c46.392 0 84 37.608 84 84ZM204 104C204 62.026 169.974 28 128 28 86.026 28 52 62.026 52 104c0 35.9 21.15 67.8 38.9 88.23C102.076 205.029 114.504 216.677 128 227c13.498-10.336 25.926-21.997 37.1-34.81C182.85 171.8 204 139.9 204 104Z"),
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
        return _mapPinPlus!!
    }

private var _mapPinPlus: ImageVector? = null
