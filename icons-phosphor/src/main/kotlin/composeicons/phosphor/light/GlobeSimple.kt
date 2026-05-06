package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GlobeSimple: ImageVector
    get() {
        if (_globeSimple != null) return _globeSimple!!
        _globeSimple = phosphorLightIcon(
            name = "GlobeSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM217.8 122h-43.91C172.35 81.23 155.41 53.77 143.46 39.33c40.838 7.191 71.511 41.3 74.34 82.67ZM128 215.83c-5.777-5.893-10.872-12.417-15.19-19.45C101.325 177.538 94.892 156.053 94.13 134h67.74c-.762 22.053-7.195 43.538-18.68 62.38-4.318 7.033-9.413 13.557-15.19 19.45ZM94.13 122c.762-22.053 7.195-43.538 18.68-62.38C117.128 52.587 122.223 46.063 128 40.17c5.777 5.893 10.872 12.417 15.19 19.45 11.485 18.842 17.918 40.327 18.68 62.38ZM112.54 39.33C100.54 53.77 83.65 81.23 82.11 122h-43.91C41.029 80.63 71.702 46.521 112.54 39.33ZM38.2 134h43.91c1.54 40.77 18.48 68.23 30.43 82.67C71.702 209.479 41.029 175.37 38.2 134ZM143.46 216.67C155.41 202.23 172.35 174.77 173.89 134h43.91c-2.829 41.37-33.502 75.479-74.34 82.67Z"),
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
