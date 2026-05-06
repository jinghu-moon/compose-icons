package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GlobeStand: ImageVector
    get() {
        if (_globeStand != null) return _globeStand!!
        _globeStand = phosphorLightIcon(
            name = "GlobeStand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136 182c43.078 0 78-34.922 78-78C214 60.922 179.078 26 136 26 92.922 26 58 60.922 58 104c.05 43.058 34.942 77.95 78 78ZM136 38c36.451 0 66 29.549 66 66 0 36.451-29.549 66-66 66C99.549 170 70 140.451 70 104 70.044 67.567 99.567 38.044 136 38ZM212.33 174.89c2.293 2.389 2.217 6.185-.17 8.48C193.21 201.649 168.294 212.466 142 213.83v20.17h26c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-64c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h26v-20.17C87.071 211.49 49.44 184.354 33.663 144.362 17.885 104.369 26.852 58.85 56.62 27.83c2.298-2.391 6.099-2.468 8.49-.17 2.391 2.298 2.468 6.099 .17 8.49C28.314 74.628 28.924 135.607 66.652 173.338c37.728 37.731 98.707 38.345 137.188 1.382 1.148-1.104 2.688-1.707 4.28-1.675 1.593 .032 3.107 .696 4.21 1.845Z"),
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
        return _globeStand!!
    }

private var _globeStand: ImageVector? = null
