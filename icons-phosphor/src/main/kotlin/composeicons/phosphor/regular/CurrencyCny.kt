package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CurrencyCny: ImageVector
    get() {
        if (_currencyCny != null) return _currencyCny!!
        _currencyCny = phosphorRegularIcon(
            name = "CurrencyCny",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M56 56c0-4.418 3.582-8 8-8h128c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-128c-4.418 0-8-3.582-8-8ZM216 160c-4.418 0-8 3.582-8 8v16h-32c-8.837 0-16-7.163-16-16v-48h48c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-160c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h48v8c-.033 30.914-25.086 55.967-56 56-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 39.746-.044 71.956-32.254 72-72v-8h32v48c0 17.673 14.327 32 32 32h40c4.418 0 8-3.582 8-8v-24c0-4.418-3.582-8-8-8Z"),
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
        return _currencyCny!!
    }

private var _currencyCny: ImageVector? = null
