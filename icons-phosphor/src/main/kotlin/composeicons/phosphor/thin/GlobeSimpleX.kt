package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GlobeSimpleX: ImageVector
    get() {
        if (_globeSimpleX != null) return _globeSimpleX!!
        _globeSimpleX = phosphorThinIcon(
            name = "GlobeSimpleX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M218.83 170.83 197.66 192l21.17 21.17c1.563 1.563 1.563 4.097 0 5.66-1.563 1.563-4.097 1.563-5.66 0L192 197.66l-21.17 21.17c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66L186.34 192 165.17 170.83c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0L192 186.34l21.17-21.17c1.563-1.563 4.097-1.563 5.66 0 1.563 1.563 1.563 4.097 0 5.66ZM228 128c0 2.209-1.791 4-4 4h-131.92c1.61 58.53 38.05 88.58 38.42 88.88h0c1.324 1.062 1.833 2.844 1.271 4.445-.562 1.601-2.074 2.673-3.771 2.675C72.772 228 28 183.228 28 128 28 72.772 72.772 28 128 28h0c55.203 .061 99.939 44.797 100 100ZM138.46 36.6c11.74 12.88 32.33 41.85 33.48 87.4h48C217.912 78.817 183.39 41.787 138.46 36.6ZM92.07 124h71.86C162.57 74.52 136.32 45.4 128 37.39c-8.32 8-34.57 37.13-35.93 86.61ZM36.07 124h48C85.22 78.45 105.81 49.48 117.55 36.6 72.628 41.796 38.117 78.824 36.09 124ZM84.07 132h-48c2.026 45.172 36.532 82.199 81.45 87.4C105.8 206.52 85.21 177.55 84.06 132Z"),
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
        return _globeSimpleX!!
    }

private var _globeSimpleX: ImageVector? = null
