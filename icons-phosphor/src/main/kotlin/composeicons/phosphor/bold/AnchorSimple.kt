package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AnchorSimple: ImageVector
    get() {
        if (_anchorSimple != null) return _anchorSimple!!
        _anchorSimple = phosphorBoldIcon(
            name = "AnchorSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 108h-24c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h11.15c-5.386 36.833-34.317 65.759-71.15 71.14v-105.2c16.531-5.844 26.446-22.748 23.482-40.029C160.517 40.63 145.533 27.999 128 27.999c-17.533 0-32.517 12.632-35.482 29.912C89.554 75.192 99.469 92.096 116 97.94v105.2C79.167 197.759 50.236 168.833 44.85 132h11.15c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-24c-6.627 0-12 5.373-12 12 0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108 0-6.627-5.373-12-12-12ZM128 52c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12Z"),
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
        return _anchorSimple!!
    }

private var _anchorSimple: ImageVector? = null
