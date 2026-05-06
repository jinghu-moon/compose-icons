package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CrosshairSimple: ImageVector
    get() {
        if (_crosshairSimple != null) return _crosshairSimple!!
        _crosshairSimple = phosphorThinIcon(
            name = "CrosshairSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM132 219.91v-35.91c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v35.91C76.362 217.774 38.226 179.638 36.09 132h35.91c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-35.91C38.226 76.362 76.362 38.226 124 36.09v35.91c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-35.91c47.638 2.136 85.774 40.272 87.91 87.91h-35.91c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h35.91c-2.136 47.638-40.272 85.774-87.91 87.91Z"),
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
        return _crosshairSimple!!
    }

private var _crosshairSimple: ImageVector? = null
