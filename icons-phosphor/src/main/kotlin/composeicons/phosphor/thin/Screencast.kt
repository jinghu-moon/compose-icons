package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Screencast: ImageVector
    get() {
        if (_screencast != null) return _screencast!!
        _screencast = phosphorThinIcon(
            name = "Screencast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 56v144c0 6.627-5.373 12-12 12h-72c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h72c2.209 0 4-1.791 4-4v-144c0-2.209-1.791-4-4-4h-176c-2.209 0-4 1.791-4 4v40c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-40C28 49.373 33.373 44 40 44h176c6.627 0 12 5.373 12 12ZM32 188c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4 6.627 0 12 5.373 12 12 0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4C52 196.954 43.046 188 32 188ZM32 156c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4 24.289 .028 43.972 19.711 44 44 0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4C83.967 179.295 60.705 156.033 32 156ZM32 124c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4 41.955 .044 75.956 34.045 76 76 0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4C115.95 161.629 78.371 124.05 32 124Z"),
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
        return _screencast!!
    }

private var _screencast: ImageVector? = null
