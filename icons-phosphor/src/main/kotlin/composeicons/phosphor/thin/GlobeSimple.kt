package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GlobeSimple: ImageVector
    get() {
        if (_globeSimple != null) return _globeSimple!!
        _globeSimple = phosphorThinIcon(
            name = "GlobeSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28h0C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM219.9 124h-48C170.75 78.45 150.16 49.48 138.42 36.6c44.934 5.183 79.461 42.214 81.49 87.4ZM128 218.61C119.68 210.61 93.43 181.48 92.07 132h71.86c-1.36 49.48-27.61 78.61-35.93 86.61ZM92.07 124C93.43 74.52 119.68 45.39 128 37.39c8.32 8 34.57 37.13 35.93 86.61ZM117.54 36.6C105.8 49.48 85.21 78.45 84.06 124h-48C38.088 78.817 72.61 41.787 117.54 36.6ZM36.09 132h48c1.15 45.55 21.74 74.52 33.48 87.4C72.64 214.213 38.118 177.183 36.09 132ZM138.46 219.4C150.2 206.52 170.79 177.55 171.94 132h48c-2.028 45.183-36.55 82.213-81.48 87.4Z"),
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
        return _globeSimple!!
    }

private var _globeSimple: ImageVector? = null
