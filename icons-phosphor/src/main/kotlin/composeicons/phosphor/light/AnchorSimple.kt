package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AnchorSimple: ImageVector
    get() {
        if (_anchorSimple != null) return _anchorSimple!!
        _anchorSimple = phosphorLightIcon(
            name = "AnchorSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 114h-24c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h17.8c-3.07 44.945-38.854 80.721-83.8 83.78v-116.38c15.09-3.08 25.396-17.086 23.848-32.409C156.3 45.668 143.401 34.006 128 34.006c-15.401 0-28.3 11.662-29.848 26.985C96.604 76.314 106.91 90.32 122 93.4v116.38C77.054 206.721 41.27 170.945 38.2 126h17.8c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-24c-3.314 0-6 2.686-6 6 0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102 0-3.314-2.686-6-6-6ZM110 64c0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18Z"),
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
