package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AnchorSimple: ImageVector
    get() {
        if (_anchorSimple != null) return _anchorSimple!!
        _anchorSimple = phosphorThinIcon(
            name = "AnchorSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 116h-24c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h19.91c-2.136 47.638-40.272 85.774-87.91 87.91v-120.2c14.535-2.098 24.98-15.07 23.928-29.718C154.876 47.344 142.686 35.997 128 35.997c-14.686 0-26.876 11.347-27.928 25.995C99.02 76.64 109.465 89.612 124 91.71v120.2C76.362 209.774 38.226 171.638 36.09 124h19.91c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-24c-2.209 0-4 1.791-4 4 0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100 0-2.209-1.791-4-4-4ZM108 64c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20C116.954 84 108 75.046 108 64Z"),
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
