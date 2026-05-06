package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Laptop: ImageVector
    get() {
        if (_laptop != null) return _laptop!!
        _laptop = phosphorBoldIcon(
            name = "Laptop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 156h-4v-84C228 56.536 215.464 44 200 44h-144C40.536 44 28 56.536 28 72v84h-4c-6.627 0-12 5.373-12 12v24c0 15.464 12.536 28 28 28h176c15.464 0 28-12.536 28-28v-24c0-6.627-5.373-12-12-12ZM52 72c0-2.209 1.791-4 4-4h144c2.209 0 4 1.791 4 4v84h-152ZM220 192c0 2.209-1.791 4-4 4h-176c-2.209 0-4-1.791-4-4v-12h184ZM156 96c0 6.627-5.373 12-12 12h-32c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h32c6.627 0 12 5.373 12 12Z"),
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
        return _laptop!!
    }

private var _laptop: ImageVector? = null
