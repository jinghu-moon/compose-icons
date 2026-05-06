package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Champagne: ImageVector
    get() {
        if (_champagne != null) return _champagne!!
        _champagne = phosphorRegularIcon(
            name = "Champagne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 20c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM164.12 73.23c7.26 44.25 4.35 75.76-8.66 93.66-6.444 9.102-16.4 15.095-27.46 16.53v48.58h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-48c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16v-48.58C100.943 181.978 90.989 175.987 84.54 166.89 71.54 148.99 68.63 117.48 75.89 73.23 79.266 53.03 84.013 33.084 90.1 13.53 91.17 10.232 94.243 8 97.71 8h44.59c3.467-0 6.54 2.232 7.61 5.53 6.087 19.554 10.834 39.5 14.21 59.7ZM93.8 64h52.4c-3-15.58-6.72-29.81-9.78-40h-32.83c-3.06 10.19-6.76 24.42-9.79 40ZM149 80h-58c-4.49 30-5.14 61.54 6.45 77.49C102.63 164.56 110 168 120 168c10 0 17.38-3.44 22.52-10.51C154.1 141.54 153.46 110 149 80ZM220 40c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM196 88c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
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
        return _champagne!!
    }

private var _champagne: ImageVector? = null
